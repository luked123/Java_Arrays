public class BubbleSort {

    /** Uses Bubble sort to sort an array of integers */
    public static void BubbleSort(int[] array){
        int length = array.length;
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i = 0; i < length - 1; i++){
                if(array[i] > array[i +1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    /** Uses Bubble sort to sort an array of doubles */
    public static void BubbleSort(double[] array){
        int length = array.length;
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i = 0; i < length - 1; i++){
                if(array[i] > array[i +1]){
                    double temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
