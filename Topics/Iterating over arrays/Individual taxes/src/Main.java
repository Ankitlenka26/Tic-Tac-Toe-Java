import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] income = new int[n];
        int[] tax = new int[n];
        for(int i=0 ;i<n ;i++){
            income[i] = scanner.nextInt();
        }
        for(int i=0 ;i<n ;i++){
            tax[i] = scanner.nextInt();
        }
        // now calculate the taxes
        int maxTaxAmount = Integer.MIN_VALUE;
        int maxTaxCompanyNo = -1;
        for(int i=0 ;i<n ;i++){
            int taxPay = (income[i]*tax[i]);
            if(taxPay > maxTaxAmount){
                maxTaxAmount = taxPay;
                maxTaxCompanyNo = i+1;
            }
        }

        System.out.println(maxTaxCompanyNo);
    }
}