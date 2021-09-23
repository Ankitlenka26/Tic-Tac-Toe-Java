import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat();
        float p = scanner.nextFloat();
        float k = scanner.nextFloat();
        int count =0;
        while(m<k){
            m = m*(1+p/100);
            count++;
        }
        System.out.println(count);
    }
}