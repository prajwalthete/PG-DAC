using System;

namespace Static_and_Instance_variable
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student s = new Student();
            s.rollNo = 1;
            s.firstName = "prajwal";
            s.lastName = "Thete";
            s.printFullname();
            Console.WriteLine(Student.schoolName);
            Console.WriteLine(Student.getFees());
            Console.WriteLine(Student.getFeesAnnualIncrement(3000));
            Console.WriteLine(s.rollNo);

            Console.WriteLine("---------------------------------");    

            Student s2 = new Student();
            s2.rollNo = 2;
            s2.firstName = "pratik ";
            s2.lastName = "Thete";
            s2.printFullname();
            Console.WriteLine(Student.schoolName);
            Console.WriteLine(Student.getFees());
            Console.WriteLine(Student.getFeesAnnualIncrement(4000));
            Console.WriteLine(s2.rollNo);
        }
    }

    class Student
    {
        public int rollNo;     // instance variable 
        public string firstName;
        public string lastName;
        public int standard;
        public static string schoolName = "abc school ";
        public static int fees = 5000 ; // static variable

        public void printFullname()     // instance method
        {
            string fullname = this.firstName +""+this.lastName;
            Console.WriteLine("Your fullname Is {0}",fullname);    
        }
        public  static int getFees()    // static method 
        {
            return fees;
        }
        public static int getFeesAnnualIncrement(int fee)
        {
            return fee / 10; 
        }
    }






}