public class TestingArrayMethods {
    public static void main(String[] args){
        int[] list1 = {5, 3, 2, 1, 0, 8, 9, 4, 6, 7, 9,};
        double[] list2 = {5.5, 3.3, 2.2, 1.1, 0.0, 8.8, 9.9, 4.4, 6.6, 7.7, 9.9};
        ArrayMethods.printArray(list1);
        ArrayMethods.printArray(list2);
        System.out.printf("List1 is sorted: %b\n", ArrayMethods.isSorted(list1));
        System.out.printf("List2 is sorted: %b\n", ArrayMethods.isSorted(list2));

        System.out.println("Sorting Lists...");
        ArrayMethods.BubbleSort(list1);
        ArrayMethods.BubbleSort(list2);

        System.out.printf("List1 is sorted: %b\n", ArrayMethods.isSorted(list1));
        System.out.printf("List2 is sorted: %b\n", ArrayMethods.isSorted(list2));
        ArrayMethods.printArray(list1);
        ArrayMethods.printArray(list2);

        System.out.printf("The minimum of list 1 is: %d\n", ArrayMethods.findMin(list1));
        System.out.printf("The minimum of list 2 is: %f\n", ArrayMethods.findMin(list2));

        System.out.printf("The maximum of list 1 is: %d\n", ArrayMethods.findMax(list1));
        System.out.printf("The maximum of list 2 is: %f\n", ArrayMethods.findMax(list2));

        ArrayMethods.printFormattedArray("| %d | ", list1);

    }
}
