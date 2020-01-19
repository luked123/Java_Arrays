public class SumArray {
    public static void main(String[] args){
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 3, 4, 5 };
        int[] merged = new int[array1.length + array2.length];
        int pos = 0;

        for (int i = 0; i < array1.length; i++) {
            merged[pos] = array1[i];
            pos++;
        }

        System.out.println(pos); 
        System.out.println(merged[pos]);

        for (int j = merged[pos]; j < array2.length; j++) {
            if (merged[pos] != array2[j]) {
                merged[pos] = array2[j];
                pos++;
            }
        }
        PracticeWithArrays.printArray(merged);
    }
}
