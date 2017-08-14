package com.faberald.sort;

import java.util.Arrays;

public abstract class Algorithm implements Sort
{
   protected int[] nums;

   protected Algorithm(int[] nums)
   {
      this.nums = nums;
   }
   
   abstract public void sortArray(Object... value);
   
   public void printOutArray()
   {
      System.out.println(Arrays.toString(nums));
   }
   
}
