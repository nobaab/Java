import java.util.Scanner;

public class KnapsackProblem {

	public static int knapsack(int val[], int wt[], int v, int W)
	{
	    int[][] k = new int[v+1][W+1];
	    for(int i = 0; i <= v; i++){
	        for(int w = 0; w <= W; w++){
	            if(i == 0 || w == 0){
	                k[i][w] = 0;
	            }
	            else if(wt[i] <= w){
	                k[i][w] = Math.max(val[i] + k[i-1][w-wt[i]], k[i-1][w]);
	            }
	            else{
	                k[i][w] = k[i-1][w];
	            }
	        }
	    }
	    return k[v][W];
	}

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
	    int v, w, W;
	    v = cin.nextInt();	w = cin.nextInt();	W = cin.nextInt();

	    int[] val = new int[v+1];
	    int[] wt = new int[w+1];
	    for(int i = 1; i <= v; i++){
	        val[i] = cin.nextInt();
	    }
	    for(int i = 1; i <= w; i++){
	        wt[i] = cin.nextInt();
	    }

	    /// no need to sort...

	    System.out.println(knapsack(val, wt, v, W));
	    cin.close();
	}
}

/*

3 3 50
60 100 120
10 20 30
220

3 3 50
120 100 60
30 20 10
220

4 4 7
5 7 4 1
4 5 3 1
9

4 4 7
1 4 5 7
1 3 4 5
9
*/
