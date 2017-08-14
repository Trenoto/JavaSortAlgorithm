package com.faberald.sort;

public class QucikSort2 extends Algorithm
{

   public QucikSort2(int[] nums)
   {
      super(nums);
   }

   @Override
   public void sortArray(Object... value)
   {
      int low = (Integer) value[0];
      int high =  (Integer) value[1];
      if (low < high)
      {
         int p = partition(nums,low,high);
         sortArray(low,p-1);
         sortArray(p+1,high);
      }
   }
  
   private void swap(int[] nums, int i, int j)
   {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
   
   private int partition(int[] nums, int low, int high)
   {
      int i= low;
      int j = high;
      int pivot = nums[i];
      while(i < j)
      {
         while ( i < j && pivot <= nums[j])
         {
            j--;   
         }
         
         if (i<j)
         {
            nums[i++] = nums[j];
         }
            
         while ( i < j && nums[i] <= pivot)
         {
            i++;
         }
         
         if (i<j)
         {
            nums[j--] = nums[i];
         }
      }
      nums[i] = pivot;
      return i;
   }
   

}
