namespace Arrays
{
    internal class Program
    {
        static void Main1()
        {
            int[] arr = new int[5];
            // arr[0]....arr[4]

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine("Enter arr[{0}] ", i);
                arr[i] = int.Parse(Console.ReadLine());
                // arr[i] = Convert.ToInt32(Console.ReadLine());

            }
            for (int i = 0; i < arr.Length; i++)
            {
                //Console.WriteLine(" arr[{0}]: {1} ", i, arr[i]);// placeholder
                Console.WriteLine($"The value of arr[{i}] is {arr[i]}");// string interpolation

            }
            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }
        }
        static void Main2()
        {
            int[] arr = new int[5];
            // arr[0]....arr[4]

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine("Enter arr[{0}] ", i);
                arr[i] = int.Parse(Console.ReadLine());
                // arr[i] = Convert.ToInt32(Console.ReadLine());

            }


            // int pos = Array.IndexOf(arr, 10);// leanerSearch algorithms used inside 
            // int pos = Array.LastIndexOf(arr, 10);
            int pos = Array.BinarySearch(arr, 10);


            if (pos == -1)
                Console.WriteLine("Not found");

            // Array.Clear(arr, 0,arr.Length);   // set to its default value 
            //Array.Copy(arr,arrr2,arr.Length);
            // Array.ConstrainedCopy(arr, arr2,arr.Length);// copy whole array if exception print error
            // Array.Sort(arr); 
            // Array.Reverse(arr);   

            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }

        }
        static void Main3() {
            int[,] arr = new int[3,2];
            //arr[0,0] arr[0,1]
            //arr[1,0] arr[1,1]
            //arr[2,0] arr[2,1]
            Console.WriteLine(arr.Length);
            Console.WriteLine(arr.GetLength(0));// 3 ..length of arr at 1st that is 3
            Console.WriteLine(arr.GetLength(1));// 2
            Console.WriteLine( arr.GetUpperBound(0));// if length is 3 upper bound is 2  and viseversa 
            Console.WriteLine(arr.GetLowerBound(0));// it will always give 0 
            for (int i = 0; i <arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine("Enter arr[{0},{1}]",i,j);
                    arr[i,j]= int.Parse(Console.ReadLine());
                }

            }
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"The value of arr[{i},{j} is {arr[i,j]}"); // string interpolation
                    
                }

            }

            //cdac has 5 students. each student has 3 marks 
            //int [5,3] arr = new int[5,3];

            //cdac has 2 batches. each batch has 5 students. each student has 3 marks 
            //int [2,5,3] arr = new int[2,5,3];

            //cdac has 3 centres. each centre has 2 batches. each batch has 5 students. each student has 3 marks 
            //int [3,2,5,3] arr = new int[3,2,5,3];

            //cdac is in 4 cities. each city has 3 centres. each centre has 2 batches. each batch has 5 students. each student has 3 marks 
            //int [4,3,2,5,3] arr = new int[4,3,2,5,3];

            //----------------------------------------------

        }
        static void Main()
        {
            //jagged Array 

           // Array of integer Array
            int[][] arr = new int[4][];
            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2];//  arr[2][0] - arr [2][1]
            arr[3] = new int[3];//  arr[3][0] arr[3][1] arr[3][2]

            // arr[4] = new int[4];
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}][{1}] : ", i, j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine("value for subscript {0},{1} is {2}  ", i, j, arr[i][j]);

                }
            }
            Console.ReadLine();
        }



    }
}