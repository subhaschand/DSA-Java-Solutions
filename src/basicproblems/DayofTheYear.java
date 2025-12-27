package basicproblems;

public class DayofTheYear {
  public int dayOfYear(String data) {

        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};

        int year=Integer.parseInt(data.substring(0,4));
        int month=Integer.parseInt(data.substring(5,7));
        int day=Integer.parseInt(data.substring(8,10));

        int ans=0;

        if(isleap(year)){
            arr[1]=29;
        }

        for(int i=0;i<month-1;i++){
            ans +=arr[i];
        }
        ans +=day;
        return ans;
    }
    public boolean isleap(int year){

        return ((year%4==0&&year%100!=0)||(year%400==0));
    }
  
}
