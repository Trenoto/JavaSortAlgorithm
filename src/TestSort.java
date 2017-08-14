import com.faberald.sort.*;

public class TestSort
{
   public static void main(String[] args)
   {
      int[] nums = {8,7,7,6,5,3,9,2,4,55,78,12,1};
//      Sort bs = new BubbleSort(nums);
//      bs.sortArray();
//      bs.printOutArray();
      
//      Sort ss = new SelectionSort(nums);
//      ss.sortArray();
//      ss.printOutArray();
      
//      Sort is = new InsertionSort(nums);
//      is.sortArray();
//      is.printOutArray();
      
      Sort qs = new QucikSort2(nums);
      qs.sortArray(0,nums.length-1);
      qs.printOutArray();
   }
}
