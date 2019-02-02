

public class InsertionSort {

	public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int val = arr[i];
            int ind = i;
            while (ind > 0 && arr[ind - 1] > val)
            {
                arr[ind] = arr[ind - 1];
                ind--;
            }
            arr[ind] = val;
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 5, 3};
		InsertionSort.insertionSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
