package com.faberald.sort;

public class MergeSort extends Algorithm
{

   public MergeSort(int[] nums)
   {
      super(nums);
      // TODO Auto-generated constructor stub
   }

   @Override
   public void sortArray(Object... value)
   {
      // TODO Auto-generated method stub
      int[] array =(int[]) value[0];
      int[] copy = new int[array.length];
      
      for(int i=0;i<array.length;i++)
         copy[i] = array[i];
      
      mergeSort(array,copy,0,array.length-1);
      
      
   }
   
   private void mergeSort(int[] array,int[] copy, int lo, int hi)
   {
      if (lo == hi) return;
      
      int len = (hi-lo)/2;
      
      mergeSort(array,copy,lo,lo+len);
      mergeSort(array,copy,lo+len+1,hi);
      int copyIndex = hi;
      int i =lo+len;
      int j = hi;
      
      while(i>=lo && j>=lo+len+1)
      {
         if(array[i]>array[j])
            copy[copyIndex--] = array[i--];
         else
            copy[copyIndex--] = array[j--];
      }
      
      while(i>=lo)
      {
         copy[copyIndex--] = array[i--];
      }
      while(j>=lo+len+1)
      {
         copy[copyIndex--] = array[j--];
      }
      for(i=lo;i<=hi;i++)
         array[i] = copy[i];
   }
   
}
