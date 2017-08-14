package com.faberald.sort;

public class InsertionSort extends Algorithm
{
   public InsertionSort(int[] nums)
   {
      super(nums);
   }

   @Override
   public void sortArray(Object... value)
   {
      int insertVal, j;
      //assume the first element in array is sorted
      for (int i = 1; i < nums.length;i++)
      {
         insertVal = nums[i];
         j = i - 1;
         while (j>=0 && nums[j] > insertVal)
         {
            nums[j+1] = nums[j];
            j--;
         }
         
         nums[j+1] = insertVal;
      }
      
   }
    
}
