class Solution {
    public boolean wordExists(char [][]board, int row, int col, char []word,int index){
        //BASE CASE - when board character doesn't matches word[index] return false
        // when row and col becomes less than index return false
        //when row and col becomes greater than board length retun false
        //if board character is already visited which is denoted by '*' return false

        if(row<0|| row>=board.length|| col<0|| col>=board[0].length || board[row][col]=='*' || board[row][col]!= word[index])
         return false;

         //TRUE Base case
         if(index==word.length-1) return true;

         //Mark with special character if the borad character is visited earlier
         char ch=board[row][col];
         board[row][col]='*';
         //Then we will make four direction call to check the word and increment index one by one
         //this all direction function call should return true if word matches store it in result variable
         boolean res=wordExists(board,row+1,col,word,index+1)||
         wordExists(board,row-1,col,word,index+1)||
         wordExists(board,row,col+1,word,index+1)||
         wordExists(board,row,col-1,word,index+1);

         //When four direction is checked revert back the board character
         board[row][col]=ch;

         return res;

    }
    public boolean exist(char[][] board, String word) {
        //First converting the word into character array 
        char [] wrd_arr=word.toCharArray();

        //Then we will traverse through the whole board to check the starting character
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                //Then we will check the firct character of board and word arr are same or not
                //And also create a worker function for checking the whole word
                if(board[row][col]==wrd_arr[0] && wordExists(board,row,col,wrd_arr,0)){ //wordExists is a worker function to check the word
                    return true;
                }
            }
        }
        return false;
    }
}