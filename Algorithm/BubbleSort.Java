public class BubbleSort {
	
	static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		
	    for(int i = 0; i < 5; i++){
	        for(int j = 1+i; j < 6; j++){
	            if(arr[i] > arr[j]){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 3, 1, 5, 4};
		
		BubbleSort.bubbleSort(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}

}
