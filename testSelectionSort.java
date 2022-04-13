import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;




class testSelectionSort {

	SelectionSort sort = new SelectionSort();
	@Test
	public void test()
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {}

    public void testPositive()
    {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

       sort.basicSelectionSort(arr);
       assertEquals(Sortedarr[0], arr[0]);
    }

    public void testNegative()
    {

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

       sort.basicSelectionSort(arr);
       assertEquals(Sortedarr[0], arr[0]);
    }

    public void testMixed()
    {
      int[] arr = new int[6];
          arr[0] = -8;
          arr[1] = -9;
          arr[2] = 7;
          arr[3] = -10;
          arr[4] = 2;
          arr[5] = 0;

          int[] Sortedarr = new int[6];
          Sortedarr[0] = -10;
          Sortedarr[1] = -9;
          Sortedarr[2] = -8;
          Sortedarr[3] = 0;
          Sortedarr[4] = 2;
          Sortedarr[5] = 7;

         sort.basicSelectionSort(arr);
         assertEquals(Sortedarr[0], arr[0]);

    }

    public void testDuplicates()
    {
      int[] arr = new int[9];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = 2;
        arr[4] = -8;
        arr[5] = 2;
        arr[6] = -10;
        arr[7] = 2;
        arr[8] = 0;

        int[] Sortedarr = new int[9];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -8;
        Sortedarr[4] = 0;
        Sortedarr[5] = 2;
        Sortedarr[6] = 2;
        Sortedarr[7] = 2;
        Sortedarr[8] = 7;

       sort.basicSelectionSort(arr);
       assertEquals(Sortedarr[0], arr[0]);
    }


}
