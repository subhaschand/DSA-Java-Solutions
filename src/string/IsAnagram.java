package string;
public class IsAnagram {

   public boolean isAnagram(String s, String t) {
        
        int[] freq=new int[26];
        
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        
        for(char ch:t.toCharArray()){
            freq[ch-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
        
    }
  
}
