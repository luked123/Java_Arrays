public class CountLettersInArray {
    public static void main(String[] args){
        char[] chars = createArray();

        // Display the Array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i = 0; i < chars.length; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] array){
        for(int i = 0; i < array.length; i++){
            if((i+1) % 20 == 0){
                 System.out.println(array[i] + " ");
            }
            else{
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        for (char aChar : chars) {
            counts[(aChar - 'a')]++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if((i+1) % 10 == 0){
                System.out.println(counts[i] + " " + (char)(i + 'a') + " ");
            }
            else{
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }
    }
}
