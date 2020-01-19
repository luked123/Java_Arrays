import java.sql.Time;

public class PracticeWithArrays {

    public static void main(String [] args) {

        // a.
        double[] oneArray = new double[10];

        // Initialize random values in array
        for(int i = 0; i < oneArray.length; i++){
            oneArray[i] = Math.random() * 10;
        }

        // b.
        oneArray[oneArray.length - 1] = 5.5;

        // c.
        System.out.printf("The sum of index %d and index %d int oneArray is %f\n", 0, 1, oneArray[0] + oneArray[1]);

        // d.
        double sum = 0.0;
        for(double e: oneArray){
            sum += e;
        }
        System.out.printf("The sum of all the elements in oneArray is %f\n", sum); // d.

        // e.
        double minimum = oneArray[0];
        for(double e: oneArray){
            if(e < minimum){
                minimum = e;
            }
        }
        System.out.printf("The minimum of oneArray is %f\n", minimum);

        // f.
        int randomIndex = (int) (Math.random() * oneArray.length);
        System.out.printf("The element at index %d is %f\n", randomIndex, oneArray[randomIndex]);

        // g.
        double[] secondArray = {3.5, 5.5, 4.52, 5.6};

        // 7.11
        int[] list = {1, 2, 3, 4, 5, 6};
        for(int i = 1; i < list.length; i++){
            list[i] = list[i - 1];
        }

        for(int i = 0; i < list.length; i++){
            System.out.printf("%d ", list[i]);
        }
        System.out.println();

        double[] thirdArray = new double[secondArray.length];
        System.arraycopy(secondArray, 0, thirdArray, 0, secondArray.length);

        for(double e: thirdArray){
            System.out.printf("%f ", e);
        }
        System.out.println();

        printArray(new int[]{3,1,2,6,4,2}); // demonstrates an anonymous array

        int x = 1;
        int[] y = new int[10];

        System.out.printf("The value of x is %d before the method\n", x);
        System.out.printf("The value of y[0] is %d before the method\n", y[0]);

        m(x,y);

        System.out.printf("The value of x is %d after the method\n", x);
        System.out.printf("The value of y[0] is %d after the method\n", y[0]);

        printArray(reverse(new int[]{1,2,3,4,5,6}));

    }

    public static void printArray(int[] array){
        for(int i: array){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    /* Demonstrates how arrays pass by reference and primitive types arguments value is passed */
    public static void m(int number, int[] numbers){
        number = 1001;
        numbers[0] = 5005;
    }

    /** Reverses an array */
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0, j = result.length - 1; i < result.length; i++, j-- ){
            result[j] = list[i];
        }

        return result;
    }
}
