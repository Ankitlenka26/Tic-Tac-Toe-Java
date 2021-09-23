import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int diff = second-first;
        boolean ordered = true;
        int isIncreasing = 0;
        if(diff > 0){
            isIncreasing = 1;
        }else if(diff == 0){
            isIncreasing = 0;
        }else{
            isIncreasing = -1;
        }
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            if(x!=0){
                if(x-second > 0){
                    if(isIncreasing < 0){
                        ordered = false;
                        break;
                    }else if(isIncreasing == 0){
                        isIncreasing =1;
                    }
                }else if(x-second < 0){
                    if(isIncreasing > 0){
                        ordered = false;
                        break;
                    }else if(isIncreasing == 0){
                        isIncreasing = -1;
                    }
                }else{
                        continue;
                }
                second = x ;
            }else{
                break;
            }
        }
        System.out.println(ordered);
    }
}