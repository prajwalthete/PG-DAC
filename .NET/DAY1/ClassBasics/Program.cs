//using System;
global using System;
namespace ClassBasics
{
    internal class Program
    {
        static void Main1()
        {
            System.Console.WriteLine("Hello World");

            Console.WriteLine("Hello World");
            // n1.n1a.MyClass1;
        }
        static void Main2()
        {   /*
            class1 c;   // c is referance of type Class1
            c = new class1();   //c refer to the instance of the class
            c.Display();
            */
            class1 c = new class1();
            c.Display();
            c.Display("abc");
            Console.WriteLine(c.add(10, 20));
            // Console.WriteLine(c.addWithOptinalParam(a:10,b:20));
            Console.WriteLine(c.add());
            Console.WriteLine(c.add(10, 20));
            Console.WriteLine(c.add(10, 20, 30));
            Console.WriteLine(c.add(10, 20, 30)); // positional param


            Console.WriteLine(c.add(a: 10, b: 20, c: 30)); //  parameters
            Console.WriteLine(c.add(c: 30));

        }
        static void Main()
        {
            class1 c = new class1();
            c.DoSomeThing();
        }

    }
    public class class1
    {
        public void Display()
        {

            Console.WriteLine("Display");
        }
        public void Display(String s)   //func overloading 
        {

            Console.WriteLine("Display" + s);
        }/*
        public int add(int a,int b)
        {
            return a + b;
        }
        public int add(int a, int b,int c)
        {
            return a + b + c;
        }
        public int addWithOptinalParam(int a, int b, int c=0) // Optional parameter with Default Value 
        {
            return a + b + c;

        }
        */

        // Optional Parameters With Default Values
        public int add(int a = 0, int b = 0, int c = 0)
        {
            return a + b + c;
        }
        public void DoSomeThing()
        {
            int i = 100;
            // ststic int (j)  // not allowed 
            Console.WriteLine("DS");
            DoSomeThingElse();


            // local Function & it is implicitly Private
            void DoSomeThingElse()
            {
                Console.WriteLine("DSE");
                //local func can access variable defined in the calling function
                Console.WriteLine(i);


            }
            // local functin with keyword static
            static void DoSomeThingElse2()
            {
                Console.WriteLine("DSE");
                //ststic local func cannot  access variable defined in the calling function
               // Console.WriteLine(i);// error 


            }

        }



    }


    namespace n1
    {
        namespace n1a
        {
            public class MyClass1
            {

            }

        }
    }
}