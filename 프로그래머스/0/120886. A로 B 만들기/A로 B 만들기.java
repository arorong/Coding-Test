import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeChr = before.toCharArray();
        char[] afterChr = after.toCharArray();
        Arrays.sort(beforeChr); 
        Arrays.sort(afterChr);

        if(Arrays.equals(beforeChr, afterChr)){
            answer = 1;
        } else{
            answer = 0;
        }
        
        return answer;
    }
}