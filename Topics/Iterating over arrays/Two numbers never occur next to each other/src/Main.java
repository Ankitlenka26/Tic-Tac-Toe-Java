import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean didBreak = false;
        for(int i=1; i<n ; i++){
            if((arr[i]==x && arr[i-1]==y) || (arr[i]==y && arr[i-1]==x)){
                System.out.println(false);
                didBreak = true;
                break;
            }
        }
        if(!didBreak){
            System.out.println(true);
        }
    }
}