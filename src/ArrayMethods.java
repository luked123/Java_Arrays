public class ArrayMethods {

    /* General useful methods */

    /** Finds the maximum element in the array */
    public static int findMax(int[] array){
        int max = array[0];
        for(int i: array){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    /** Finds the maximum element in the array */
    public static double findMax(double[] array){
        double max = array[0];
        for(double i: array){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    /** Finds the minimum element in the array */
    public static int findMin(int[] array){
        int min = array[0];
        for(int i: array){
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    /** Finds the minimum element in the array */
    public static double findMin(double[] array){
        double min = array[0];
        for(double i: array){
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    /** Prints the given integer array */
    public static void printArray(int[] array){
        for(int i: array){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    /** Prints the given double array */
    public static void printArray(double[] array){
        for(double i: array){
            System.out.printf("%f ", i);
        }
        System.out.println();
    }

    /** Prints the given array in the specified format */
    public static void printFormattedArray(String format, int[] array){
        for(int i: array){
            System.out.printf(format, i);
        }
        System.out.println();
    }

    /** Tests to see if the given int array is sorted */
    public static boolean isSorted(int[] array){
        for(int i = 0; i < array.length -1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    /** Tests to see if the given double array is sorted */
    public static boolean isSorted(double[] array){
        for(int i = 0; i < array.length -1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }


    /* Search Array Methods */

    /** Use linear search to find a int key in an int array*/
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

    /** Use linear search to find a double key in a double array */
    public static double linearSearch(double[] list, double key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

    /** Use binary search to find a int key in the int array
     * The list must be sorted first*/
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }
            else if(key == list[mid]) {
                return mid;
            }
            else{
                low = mid + 1;
            }
        }

        return -low - 1; // Represents where the key would be inserted into the list
    }

    /* Sort array methods */

    /** Sort the integer list by Selection Sort */
    public static void selectionSort(int[] list){
        for(int i = 0; i < list.length; i++){
            int currentMin = list[i];
            int currentMinIndex = i;

            // Scan the remainder of the list for the smallest element
            for(int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap the values if the next smallest element is found
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /** Sort the given double list by selection sort */
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            // Scan the remainder of the list for the smallest element
            for(int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap the values if the next smallest element is found
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

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
