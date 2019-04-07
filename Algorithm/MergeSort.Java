public class MergeSort {

	public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void merge(int a[],int p ,int q,int r) {
        int n1=  q-p+1;
        int n2= r-q;
        int  left[] = new int[n1+1];
        int  right[] = new int[n2+1];
        for (int i = 0; i < n1; i++) {
            left[i] = a[p+i];
        }
        left[left.length-1] = Integer.MAX_VALUE;
        for (int i = 0; i < n2; i++) {
            right[i] = a[q+1+i];
        }
        right[right.length-1] =  Integer.MAX_VALUE;

        int i=0,j=0;
        for(int k=p;k<=r;k++){
            if(left[i]<right[j]){
                a[k] =left[i];
                i++;
            }else{
                a[k] =right[j];
                j++;
            }
        }
    }

    public static void mergeSort(int a[],int p, int r){
        if (p<r){
            int q= (p+r)/2;
            mergeSort(a, p, q);
            mergeSort(a, q+1, r);
            merge(a, p, q, r);
        }
    }

    public static void main(String[] args) {
        int a[] ={1,5,3,7,2,6,4,8};
        System.out.println("Unsorted Array is :");
        printArray(a);
        System.out.println("sorted Array is :");
        mergeSort(a, 0, a.length-1);
        printArray(a);
    }

}
