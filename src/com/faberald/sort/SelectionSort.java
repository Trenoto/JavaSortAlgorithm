package com.faberald.sort;

public class SelectionSort extends Algorithm
{

   public SelectionSort(int[] nums)
   {
      super(nums);
   }
   
   public void sortArray(Object... value)
   {
      int min;
      for (int i=0; i < nums.length-1;i++)
      {
         min = i;
         for (int j=i+1; j < nums.length;j++)
         {
            if (nums[min] > nums[j])
               min = j;
         } 
         int temp = nums[i];
         nums[i] = nums[min];
         nums[min] = temp;
      }
   }
}
