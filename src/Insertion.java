public class Insertion {

    public static void sort(int[] arr){
        int N = arr.length;
        for (int i=1;i<N;i++){
            for (int j=i;j>0;j--){
                if (compare(arr[j],arr[j-1])){
                    swap(arr,j-1,j);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }


    private static boolean compare(int i, int j) {
        if (i<j){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,6};
        Insertion.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
