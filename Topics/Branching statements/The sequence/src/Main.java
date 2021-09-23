import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count =0;
        boolean isDone = false;
        for(int i=1 ;i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i + " ");
                count++;
                if(count == n){
                    isDone = true;
                    break;
                }
            }
            if(isDone){
                break;
            }
        }
    }
}