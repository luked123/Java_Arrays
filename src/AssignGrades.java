import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.print("Enter the number of students: ");
        int numberOFStudents = input.nextInt();

        //Create array
        int[] scores = new int[numberOFStudents];

        //Prompt user for scores
        System.out.printf("Enter %d scores: ", numberOFStudents);
        // Collect scores
        for(int i = 0; i < numberOFStudents; i++){
            scores[i] = input.nextInt();
        }

        //Get max score
        int bestScore = getBestScore(scores);

        // Get Grades
        char[] grades = getGrades(scores, bestScore);

        //Display scores
        displayScores(scores, grades);
    }

    /** Gets Correct grades based on scores */
    public static char[] getGrades(int[] scores){
        char[] grades = new char[scores.length];
        for(int i = 0; i < grades.length; i++){
            if(scores[i] >= 90){
                grades[i] = 'A';
            }
            else if(scores[i] >= 80){
                grades[i] = 'B';
            }
            else if(scores[i] >= 70){
                grades[i] = 'C';
            }
            else if(scores[i] >= 60){
                grades[i] = 'B';
            }
            else{
                grades[i] = 'F';
            }
        }

        return  grades;
    }

    /** Gets the students grades based on the best score */
    public static char[] getGrades(int[] scores, int bestScore){
        char[] grades = new char[scores.length];
        for(int i = 0; i < grades.length; i++){
            if(scores[i] >= (bestScore - 10)){
                grades[i] = 'A';
            }
            else if(scores[i] >= (bestScore - 20)){
                grades[i] = 'B';
            }
            else if(scores[i] >= (bestScore - 30)){
                grades[i] = 'C';
            }
            else if(scores[i] >= (bestScore - 40)){
                grades[i] = 'B';
            }
            else{
                grades[i] = 'F';
            }
        }

        return  grades;
    }

    /** Gets the best score out of all the students */
    public static int getBestScore(int[] scores){
        int max = scores[0];
        for(int score : scores){
            if(max < score){
                max = score;
            }
        }

        return max;
    }

    /** Displays the students grades */
    public static void displayScores(int[] scores, char[] grades){
        for(int i = 0; i < scores.length; i++){
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grades[i]);
        }
    }

}
