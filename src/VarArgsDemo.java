/* Class that demos variable amount of arguments
    to a method. Uses ellipsis. Must be the last argument in the method
    declaration and there can be only one. Cannot be used as a return type
 */

public class VarArgsDemo {
    public static void main(String... args){
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1,2,3}); // anonymous array
    }

    /* Here is the method that is taking a variable amount of int objects */
    public static void printMax(double... numbers){
        double max = numbers[0];

        for(double i: numbers){
            if(i > max){
                max = i;
            }
        }

        System.out.println("The maximum of the numbers is " + max);
    }
}
