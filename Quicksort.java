package com.company;
import java.util.Random;
public class Quicksort {
    public static int N = 31;
    public static int[] arr = new int[N];
    private static Random generator = new Random();


    public static void InitArray()
    {
        for (int i = 0; i < N; i++)
        {
            arr[i] = generator.nextInt(100);
        }


    }


    public static void printArray()
    {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }

   public static void QuickSort(int left, int right)
   {
     if (left>=right)
         return;

       int i=left,j=right,p=(i+j)/2,tmp;

       while(i<j) {
           while (arr[i] <= arr[p] && i < p)
               i++;

           while (arr[j] >= arr[p] && j > p)
               j--;


           if (i < j) {
               tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;

               if (i == p)
                   p = j;
               else if (j == p)
                   p = i;
           }
       }
       QuickSort(left,p-1);
       QuickSort(p+1,right);



   }



    public static void main(String[] args)
    {
        InitArray();
        System.out.println("Массив до сортировки:");
        printArray();
        System.out.println(" ");
        QuickSort(0,N-1);
        System.out.println("Массив после быстрой сортировки:");
        printArray();


    }
}
