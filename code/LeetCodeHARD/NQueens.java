
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4 ; 
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    public static boolean isSafe1(int row ,int col , char[][] board , int n ){
        // upper diagonal

        int duprow = row ;
        int dupcol = col ; 
        while ( duprow >= 0 && dupcol>=0){
            if(board[duprow][dupcol] == 'Q') return false ; 
            duprow--;
            dupcol--;
        }

        // only upper 

        duprow = row;
        dupcol = col;
        while(dupcol>=0){
            if(board[duprow][dupcol] == 'Q') return false;
            dupcol--;
        }

           // only lower 

        duprow = row;
        dupcol = col;
        while(duprow<n){
            if(board[duprow][dupcol] == 'Q') return false;
            duprow++;
        }

        // only left hand 

        dupcol = col;
        duprow = row;
        while (duprow >= 0) {
            if(board[duprow][dupcol]=='Q') return false; 
            duprow--;
        }

        // lower diagonal 

        duprow = row;
        dupcol = col;
        while(duprow<n && dupcol>=0){
            if(board[duprow][dupcol] == 'Q') return false;
            duprow++;
            dupcol--;
        } 

        return true;
    
    }

    public static void solve (int col , char[][] board , List<List<String>> ans , int n ){
        if(col == n ){
            ans.add(converttoList(board));
            return ;
        }   
         for(int row = 0 ; row < n ; row++){
            if(isSafe1(row,col,board , n )){
                        System.out.println("BEFOREE : " + Arrays.deepToString(board));

                board[row][col] = 'Q';
                                        System.out.println("After : " + Arrays.deepToString(board));

                solve(col+1, board, ans, n);// recur for he next coln 
                board[row][col] = '.';
            }
        }
    }

     public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>() ; 
        char[][] board = new char[n][n];
 
        for(int i = 0 ; i<n ; i++){
          for(int j = 0 ; j<n ; j++){
            board[i][j] ='.';
          }
        }
        System.out.println(Arrays.deepToString(board));

        solve(0,board,ans , n);
        return ans ; 

    }

    public static List<String> converttoList(char[][] arr){
        List<String> str = new ArrayList<>();

        for(int i = 0 ; i<arr.length ; i++){
            str.add(new String(arr[i]));
        }
        return str;
    }
}
