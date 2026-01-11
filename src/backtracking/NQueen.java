package backtracking;
import java.util.*;
public class NQueen {
  public List<List<String>> solveNQueens(int n) {

        List<List<String>> answer=new ArrayList<>();

        char[][] ch=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }
        }

        find(ch,answer,0);
        
        return answer;
    }
    public void find(char[][] ch,List<List<String>> answer,int r){

        if(r==ch.length){
            display(ch,answer);
            System.out.println("Hi");
            return;
        }

        for(int i=0;i<ch.length;i++){

            if(isSafe(ch,r,i)){
                ch[r][i]='Q';
                find(ch,answer,r+1);
                ch[r][i]='.';
            }
        }
    }
    public boolean isSafe(char[][] ch,int r,int c){
        int n=ch.length;

        for(int i=0;i<n;i++){
            if(ch[i][c]=='Q'){
                return false;
            }
        }

        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(ch[i][j]=='Q'){
                return false;
            }
        }

        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){

            if(ch[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }
    public void display(char[][] ch,List<List<String>> answer){


        List<String> ans=new ArrayList<>();

        for(char[] c:ch){
            ans.add(new String(c));
        }

         answer.add(ans);
    }
  
}
