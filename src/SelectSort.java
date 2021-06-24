public class SelectSort {

    public static void sort(int[] arr){
        int N = arr.length;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i+1;j<N;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex==i){
                continue;
            }
            swap(arr,minIndex,i);
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int tep = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex] = tep;
    }


    public static void main(String[] args) {

        int[] arr = {1,3,5,2,7,6};
        SelectSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
