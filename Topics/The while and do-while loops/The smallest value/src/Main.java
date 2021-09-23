import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int i=1;
        while(factorial(i) <= m){
            i++;
        }
        System.out.println(i);
    }

    public static long factorial(int n){
        long prod = 1;
        while(n>0){
            prod *= n ;
            n--;
        }
        return prod;
    }
}