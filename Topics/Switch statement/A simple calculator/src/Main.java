import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long x = Long.parseLong(scanner.next());
        String op = scanner.next();
        long y = Long.parseLong(scanner.next());
        switch (op){
            case "+" :
                System.out.println(x+y);
                break;
            case "-" :
                System.out.println(x-y);
                break;
            case "*" :
                System.out.println(x*y);
                break;
            case "/" :
                if(y == 0){
                    System.out.println("Division by 0!");
                }else{
                    System.out.println(x/y);
                }
                break;
            default :
                System.out.println("Unknown operator");
        }
    }
}