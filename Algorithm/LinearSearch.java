import java.util.Scanner;

public class LeanearSearch {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n;
		n = cin.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = cin.nextInt();
		}
		
		int key = cin.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("found");
				return;
			}
		}
		System.out.println("not found");
	}
}
