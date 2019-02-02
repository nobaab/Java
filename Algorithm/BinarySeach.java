import java.util.Arrays;

public class Bb {

	public static int binary_Search(int low, int high, int key, int[] arr)
    {
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else{
                System.out.println("found");
                return 1;
            }
            return binary_Search(low,high,key,arr);
        }
        return 0;
    }
 
    public static void main(String[] args) {
       
        int[]a={10,10,4,5,8,15,14};
        Arrays.sort(a);
        int low=0;
        int high=a.length-1;
        int key=12;
        int x=binary_Search(low,high,key,a);
        if(x==0)
                {
                    System.out.println("Not found");
                }
       
    }

}
