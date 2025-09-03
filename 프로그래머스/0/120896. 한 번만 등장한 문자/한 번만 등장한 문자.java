import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
       String[] sArr = s.split("");
        Arrays.sort(sArr);
        
        for(int i = 0; i < sArr.length; i++){
            int cnt = 0;
            for(int j = 0; j < sArr.length; j++){
                if(sArr[i].equals(sArr[j])){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer += sArr[i];
            }
        }
        
        return answer;
    }
}