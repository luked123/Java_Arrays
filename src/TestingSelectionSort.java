public class TestingSelectionSort {
    public static void main(String[] args){
        double[] array = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        SelectionSort.selectionSort(array);
        for(double d: array){
            System.out.printf("%f, ", d);
        }
    }
}
