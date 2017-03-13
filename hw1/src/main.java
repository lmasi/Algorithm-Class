import sort.sort.*;

import java.util.*;

class main
{
	public static void main(String[] args)
	{
		for(int length = 10; length <= 10000; length += 500)
		{
			System.out.println("\n========= array length : " + length + " ===========");
			Random rd = new Random();
			int[] arr = new int[length];	//tmp
			int[] arr_sorted= new int[arr.length];
			int[] arr_reversed= new int[arr.length];
			int[] arr_random= new int[arr.length];

			for(int i=0; i<arr.length; i++)
				arr_sorted[i] = i;			//best case

			for(int i=0; i<arr.length; i++)
				arr_reversed[i] = arr.length - i;	//worst caes		

			for(int i=0; i<arr.length; i++)
				arr_random[i] = rd.nextInt();		// randomly sort


			System.out.println("\n*sorted case* ");
			{
				SortManager sM = new InsertionSort();
				sM.setArrayForSort(arr_sorted);
				System.out.println("Insertion sort \t: " + sM.getAverageSortTime(1000));

				SortManager sM2 = new MergeSort();
				sM2.setArrayForSort(arr_sorted);
				System.out.println("Merge sort \t: " + sM2.getAverageSortTime(1000));

				SortManager sM3 = new CollectionSort();
				sM3.setArrayForSort(arr_sorted);
				System.out.println("Array sort \t: " + sM3.getAverageSortTime(1000));
			}

			System.out.println("\n*reversed case*");
			{
				SortManager sM = new InsertionSort();
				sM.setArrayForSort(arr_reversed);
				System.out.println("Insertion sort \t: " + sM.getAverageSortTime(1000));

				SortManager sM2 = new MergeSort();
				sM2.setArrayForSort(arr_reversed);
				System.out.println("Merge sort \t: " + sM2.getAverageSortTime(1000));

				SortManager sM3 = new CollectionSort();
				sM3.setArrayForSort(arr_reversed);
				System.out.println("Array Sort \t: " + sM3.getAverageSortTime(1000));
			}

			System.out.println("\n*random case*");
			
				SortManager sM = new InsertionSort();
				sM.setArrayForSort(arr_random);
				System.out.println("Insertion sort \t: " + sM.getAverageSortTime(1000));

				SortManager sM2 = new MergeSort();
				sM2.setArrayForSort(arr_random);
				System.out.println("Merge sort \t: " + sM2.getAverageSortTime(1000));

				SortManager sM3 = new CollectionSort();
				sM3.setArrayForSort(arr_random);
				System.out.println("Array Sort \t: " + sM3.getAverageSortTime(1000));
			


			System.out.println("\n============= randomly generated array =============");
			for(int n : arr_random)
				System.out.print(n + " ");
			System.out.println("\n=================================================");
			
			System.out.println("\n============= after sort =============");
			sM3.printSortedArray();
			System.out.println("=================================================");
		}
	}
}
