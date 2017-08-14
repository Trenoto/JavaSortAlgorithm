package com.faberald.sort;

public class BubbleSort extends Algorithm
{
   public BubbleSort(int[] nums)
   {
      super(nums);
   }
   public void sortArray(Object... value)
   {
      for(int i = 0; i < nums.length-1;i++)
      {
         for(int j = 0; j < nums.length-1-i;j++)
         {
            if (nums[j+1] < nums[j])
            {
               int temp = nums[j];
               nums[j] = nums[j+1];
               nums[j+1] = temp;
            }
         }
      }
   }
}
