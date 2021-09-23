import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] arr = new char[n][n];
        for(int i=0 ;i< arr.length ; i++){
            for(int j=0 ; j< arr[i].length ; j++){
                if(i==j || i+j == n-1 || i==n/2 || j==n/2){
                    arr[i][j] = '*';
                }else{
                    arr[i][j] = '.';
                }
            }
        }

        for(int i=0 ;i< arr.length ; i++){
            for(int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}