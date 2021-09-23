class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for(int i=0 ;i< twoDimArray.length ; i++) {
            int j = 0, k = twoDimArray[i].length - 1;
            while (j <= k) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][k];
                twoDimArray[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}