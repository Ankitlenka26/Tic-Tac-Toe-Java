import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}