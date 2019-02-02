public class MergeSort {

	public void Merge(int[] arr, int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        int i, j;
        for (i = 0; i < n1; i++)
        {
            L[i] = arr[left + i];
        }
        for(j = 0; j < n2; j++)
        {
            R[j] = arr[mid+1 + j];
        }
        L[i] = R[j] = Integer.MAX_VALUE;
        for(int l = 0, r = 0, k = left; k <= right; k++)
        {
            if(L[l] <= R[r])
            {
                arr[k] = L[l];
                l++;
            }
            else
            {
                arr[k] = R[r];
                r++;
            }
        }
    }

    public void MergeSortMethod(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = left + (right - left) / 2;
            MergeSortMethod(arr, left, mid);
            MergeSortMethod(arr, mid + 1, right);
            Merge(arr, left, mid, right);
        }

    }

    public static void main(String[] args)
    {
        MergeSort ms = new MergeSort();
        int[] arr = {2, 4, 1, 6, 8, 5, 3, 7};
        ms.MergeSortMethod(arr, 0, arr.length-1);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
