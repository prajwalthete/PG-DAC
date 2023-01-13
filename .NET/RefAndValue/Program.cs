using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RefAndValueTypes
{
    class Program
    {
        static void Main1()
        {
            Class1 o1 = new Class1();
            Class1 o2 = new Class1();
            o1.i = 100;
            o2.i = 200;
            o1 = o2;
            o1.i = 300;
            Console.WriteLine(o1.i);
            Console.WriteLine(o2.i);
            Console.ReadLine();
            //200,300
            //300,300

        }
        static void Main2()
        {
            int o1, o2;
            o1 = 100;
            o2 = 200;
            o1 = o2;
            o2 = 300;
            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.ReadLine();
        }
        static void Main3()
        {
            string o1, o2;
            o1 = "100";
            o2 = "200";
            o1 = o2;
            o2 = "300";
            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.ReadLine();
            //200,300
            //300,300
        }
        static void DataTypes()
        {
            char ch; //Char 2 bytes
            byte b; //Byte
            sbyte sb; //SByte
            short s;// Int16 2
            ushort us; //UInt16
            int i; //Int32 4
            uint ui; //UInt32
            long l; //Int64
            ulong ul; //UInt64
            bool bo; //Boolean
            float f; //Single
            double dbl; //Double
            decimal dec; //Decimal

            string str; //String
            object o; //Object
        }
    }
    public class Class1
    {
        public int i;
    }
}


namespace RefAndValueTypes2
{
    class Program
    {
        static void Main1()
        {
            int a = 1;
            int b = 2;
            Init(out a, out b);
            //Swap(ref a,ref b);
            Print(in a);
            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.ReadLine();
        }
        static void Swap(ref int i, ref int j)
        {
            int temp = i;
            i = j;
            j = temp;
        }
        //out is similar to ref - changes made in func reflect back in calling code
        //the initial value is discarded
        //out variables MUST be initialized in the function
        static void Init(out int i, out int j)
        {
            //Console.WriteLine(i);  //error
            i = 100;
            j = 200;
        }
        static void Print(in int i)
        {
            Console.WriteLine(i);
            //i = 100;//error -- in variables are read only
        }
    }
}

namespace RefAndValueTypes3 //passing reference types
{
    class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            o.i = 100;
            //DoSomething1(o);
           // DoSomething2(o);
            DoSomething3(ref o);
            Console.WriteLine(o.i);
            Console.ReadLine();
        }
        static void DoSomething1(Class1 obj)  //obj = o
        {
            //changes made in func (changing value of properties) is reflected in calling code o
            obj.i = 200;
        }
        static void DoSomething2(Class1 obj)  //obj = o
        {
            //changes made in func (obj pointing to some other block) is NOT reflected in calling code o

            obj = new Class1();
            obj.i = 200;
        }
        static void DoSomething3(ref Class1 obj)  //obj = o
        {
            //changes made in func (obj pointing to some other block) is reflected in calling code o

            obj = new Class1();
            obj.i = 200;
        }
    }
    public class Class1
    {
        public int i;
    }
}