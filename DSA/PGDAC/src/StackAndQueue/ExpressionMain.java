package StackAndQueue;

import java.util.Stack;

public class ExpressionMain {
    public static int calc(int a, int b, char operator) {
        switch (operator) {
            case '$':
                return (int) Math.pow(a, b);
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '+':
                return a + b;
            case '-':
                return a - b;
        }
        return 0;
    }

    public static int solvePostfix(String post) {
        // stack of operands
        Stack<Integer> s = new Stack<Integer>();
        // traverse postfix from left to right
        for (int i = 0; i < post.length(); i++) {
            // get each sym from expression
            char sym = post.charAt(i);
            // if sym is operand
            if (Character.isDigit(sym)) {
                // convert it to int & push on stack
                // e.g. '5' -toString()-> "5" -parseInt()-> 5
                String operand = Character.toString(sym);
                s.push(Integer.parseInt(operand));
            } else {
                // pop two operands from stack
                int b = s.pop();
                int a = s.pop();
                // calculate the result
                int c = calc(a, b, sym);
                // push result on stack
                s.push(c);
            }
        }// repeat for all syms in expression
        // pop final result from stack and return.
        return s.pop();
    }

    public static int solvePrefix(String pre) {
        // stack of operands
        Stack<Integer> s = new Stack<Integer>();
        // traverse prefix from right to left
        for (int i = pre.length() - 1; i >= 0; i--) {
            // get each sym from expression
            char sym = pre.charAt(i);
            // if sym is operand
            if (Character.isDigit(sym)) {
                // convert it to int & push on stack
                // e.g. '5' -toString()-> "5" -parseInt()-> 5
                String operand = Character.toString(sym);
                s.push(Integer.parseInt(operand));
            } else {
                // pop two operands from stack
                int a = s.pop();
                int b = s.pop();
                // calculate the result
                int c = calc(a, b, sym);
                // push result on stack
                s.push(c);
            }
        }// repeat for all syms in expression
        // pop final result from stack and return.
        return s.pop();
    }

    public static int pri(char operator) {
        switch (operator) {
            case '$':
                return 3;
            case '*':
                return 2;
            case '/':
                return 2;
            case '%':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
        }
        return 0;
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> s = new Stack<Character>();
        StringBuilder post = new StringBuilder();
        //1. traverse infix expression from left to right
        for (int i = 0; i < infix.length(); i++) {
            char sym = infix.charAt(i); // sym can be operand, (, ) or operator
            //2. if operand is found, append to postfix.
            if (Character.isDigit(sym))
                post.append(sym);
            else if (sym == '(') //4. if opening ( is found, then push it on stack.
                s.push(sym);
            else if (sym == ')') { //5. if closing ) is found,
                // pop all operators from stack one by one and append to postfix
                // until opening ( is found.
                while (s.peek() != '(')
                    post.append(s.pop());
                // also pop and discard opening (
                s.pop();
            } else { //3. if "operator" is found, push it on the stack.
                // if priority of topmost operator from stack >= priority of current operator,
                while (!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
                    // pop operator from stack and append to postfix.
                    post.append(s.pop());
                }
                s.push(sym);
            }
        } // end of for loop
        //6. when all syms from infix are done, pop all operators from stack one by one and append to postfi
        while (!s.isEmpty())
            post.append(s.pop());
        return post.toString();
    }

    public static String infixToPrefix(String infix) {
        Stack<Character> s = new Stack<Character>();
        StringBuilder pre = new StringBuilder();
        //1. traverse infix expression from right to left
        for (int i = infix.length() - 1; i >= 0; i--) {
            char sym = infix.charAt(i); // sym can be operand, (, ) or operator
            //2. if operand is found, append to prefix.
            if (Character.isDigit(sym))
                pre.append(sym);
            else if (sym == ')') //4. if closing ) is found, then push it on stack.
                s.push(sym);
            else if (sym == '(') { //5. if opening ( is found,
                // pop all operators from stack one by one and append to prefix
                // until closing ) is found.
                while (s.peek() != ')')
                    pre.append(s.pop());
                // also pop and discard closing )
                s.pop();
            } else { //3. if "operator" is found, push it on the stack.
                // if priority of topmost operator from stack > priority of current operator,
                while (!s.isEmpty() && pri(s.peek()) > pri(sym)) {
                    // pop operator from stack and append to prefix.
                    pre.append(s.pop());
                }
                s.push(sym);
            }
        } // end of for loop
        //6. when all syms from infix are done, pop all operators from stack one by one and append to prefix
        while (!s.isEmpty())
            pre.append(s.pop());
        //7. reverse the prefix and return
        return pre.reverse().toString();
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> s = new Stack<Character>();
        String open = "([{", close = ")]}";
        //1. traverse expression from left to right
        for (int i = 0; i < expr.length(); i++) {
            char sym = expr.charAt(i);
            //2. if opening ( is found, push on stack
            if (open.indexOf(sym) != -1)
                s.push(sym);
                //3. if closing ) is found,
            else if (close.indexOf(sym) != -1) {
                // if stack is empty (some opening is less)
                if (s.empty())
                    return false;
                // pop one from stack
                char pop = s.pop();
                // compare if they are matching. if yes, continue.
                if (close.indexOf(sym) != open.indexOf(pop))
                    return false;
                // if not matching, return false
            }
        }
        //4. when whole expression is done, if stack is empty, return true else return false.
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String infix = "5+9-4*(8-6/2)+1$(7-3)";
        String postfix = ""; // "59+4862/-*-173-$+";
        String prefix = ""; // "+-+59*4-8/62$1-73";
		/*
		postfix = infixToPostfix(infix);
		System.out.println("Postfix: " + postfix);
		int result = solvePostfix(postfix);
		System.out.println("Result: " + result);
		prefix = infixToPrefix(infix);
		System.out.println("Prefix: " + prefix);
		result = solvePrefix(prefix);
		System.out.println("Result: " + result);
		*/
        boolean balanced = isBalanced(infix);
        System.out.println("Balanced : " + balanced);
    }
}
