package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 1, 2, 6, 8, 4};
        bubbleSort(array);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int[] array) {
        for(int i = 0;i <array.length - 1;i++){
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
