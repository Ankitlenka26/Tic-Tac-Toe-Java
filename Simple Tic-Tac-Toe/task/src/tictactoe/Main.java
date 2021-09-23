package tictactoe;

import java.util.Scanner;

public class Main {
    public static void printBox(char[][] arr){
        String dash = "---------";
        System.out.println(dash);
        for(int i=0 ;i<3 ; i++){
            System.out.print("| ");
            for(int j=0 ; j <3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(dash);
    }
    public static String check(char[][] arr){
        boolean xRow = false;
        boolean oRow = false;
        boolean isEmpty = false;
        // to check row and column
        for(int i=0 ;i<3 ;i++){
            int countXRow =0 ;
            int countORow =0 ;
            int countXCol =0;
            int countOCol =0;
            for(int j=0 ; j<3 ; j++){
                if(arr[i][j] == 'X'){
                    countXRow++;
                }
                if(arr[i][j] == 'O'){
                    countORow++;
                }
                if(arr[j][i] == 'X'){
                    countXCol++;
                }
                if(arr[j][i] == 'O'){
                    countOCol++;
                }
                if(arr[i][j] == ' ' || arr[i][j] == '_'){
                    isEmpty = true;
                }

            }
            if(countORow == 3 || countOCol==3){
                oRow = true;
            }
            if(countXRow == 3 || countXCol==3){
                xRow = true;
            }
        }

        // check for diagonals
        if(arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'){
            xRow = true;
        }
        if(arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X'){
            xRow = true;
        }
        if(arr[0][0] == 'O'&& arr[1][1] == 'O' && arr[2][2] == 'O'){
            oRow = true;
        }
        if(arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O'){
            oRow = true;
        }
        String res;
        if(xRow && oRow){
             res = "Impossible";
        }else if(xRow){
            res =  "X wins";
        }else if(oRow){
            res = "O wins";
        }else if(!xRow && !oRow && !isEmpty){
            res = "Draw";
        }else{
            res = "Game not finished";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialization of game box
        char[][] arr = new char[3][3];
        for(int i=0 ;i<3 ; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
            }
        }
        printBox(arr);
        int move =0;

        while(true){
            char currentMove;
            // Detemine which player is going to play this round
            if(move % 2 == 0){
                currentMove = 'X';
            }else{
                currentMove = 'O';
            }
            // increment move variable for next play


            System.out.print("Enter the coordinates: ");
            int x , y;
            if(!scanner.hasNextInt()){
                System.out.println("You should enter numbers!");
                continue;
            }
            x = scanner.nextInt();
            if(!scanner.hasNextInt()){
                System.out.println("You should enter numbers!");
                continue;
            }
            y = scanner.nextInt();
            if(x > 3 || x < 1 || y>3 || y<1){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }else if(arr[x-1][y-1] != '_' && arr[x-1][y-1] != ' '){
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }else{
                arr[x-1][y-1] = currentMove;
                move++;
                printBox(arr);
                String ans = check(arr);
                if(ans == "X wins" || ans == "O wins" || ans == "Draw" ){
                    System.out.println(ans);
                    break;
                }else{
                    continue;
                }
            }

        }

    }
}
