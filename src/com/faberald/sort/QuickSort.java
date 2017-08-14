package com.faberald.sort;

public class QuickSort extends Algorithm
{

   public QuickSort(int[] nums)
   {
      super(nums);
   }


   public void sortArray(Object... value)
   {
      StringBuilder sb = new StringBuilder("The array is [ ");
      for (int i: nums)
         sb.append(i+" ");
      int l = (Integer) value[0];
      int r = (Integer) value[1];
      int pivot = nums[(l+r)/2];
      
      sb.append("]"+ " Pivot is " + pivot + l + r);
      
      System.out.println(sb);
      
      int temp = 0;
      
      while(l<r)
      {
         while(nums[l] < pivot) l++;
         while(nums[r] > pivot) r--;
         
         if (l>=r) break;
         
         temp = nums[l];
         nums[l] = nums[r];
         nums[r] = temp;
         
         if(nums[l]==pivot) --r;
         if(nums[r]==pivot) ++l;
      }
      
      if(l==r)
      {
         l++;
         r--;
      }
      
      if(((Integer) value[0])<r) sortArray((Integer) value[0],r);
      if(((Integer) value[1])>l) sortArray(l, (Integer) value[1]);
      
   }

}
