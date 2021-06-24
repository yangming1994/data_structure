public class BubbleSort {

    public static void sort(int[] arr){
        int N = arr.length;
        for (int i=N-1;i>0 ;i--){
            for (int j=0 ;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {

        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }



    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,6,10,11,2,55};
        BubbleSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
