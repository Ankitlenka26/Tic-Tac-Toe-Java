import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int n = scanner.nextInt();
        int [] bridges = new int[n];
        for(int i=0; i<n ;i++){
            bridges[i] = scanner.nextInt();
        }
        boolean isCrashed = false;
        for(int i=0 ;i<n ;i++){
            if(bridges[i] <= height){
                System.out.print("Will crash on bridge " + (i+1));
                isCrashed = true;
                break;
            }
        }
        if(!isCrashed){
            System.out.println("Will not crash");
        }

    }
}