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
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for(int i=1 ; i<n ; i++){
            dp[i] = 1;
            for(int j=i-1 ; j>=0 ; j--){
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1){
                    dp[i] = 1+dp[j];
                }
            }
        }
        for(int i=0 ;i<n ;i++){
            max = Math.max(max , dp[i]);
        }
        System.out.print(max);
    }
}