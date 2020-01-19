public class LockerPuzzle {
    public static void main(String[] args){
        boolean[] lockers = new boolean[100];
        for(int student = 0; student < 100; student++){
            for(int locker = 0; locker < lockers.length; locker++){
                if((locker + 1) % (student + 1) == 0){
                    lockers[locker] = !lockers[locker];
                }
            }
        }

        for(int i = 0; i < lockers.length; i++){
            if(lockers[i]){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
