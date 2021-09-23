import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = scanner.nextInt();
        }
        int lastElement = arr[arr.length-1];
        for(int i=arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}