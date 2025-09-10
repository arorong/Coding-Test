import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int max = array[array.length-1];
        int[] cnt = new int[max+1];
        
        for(int i = 0; i < array.length; i++){
            cnt[array[i]]++;
        }
        
        int maxCount = cnt[0];
        for(int i = 1; i<cnt.length; i++){
            if(maxCount < cnt[i]){
                maxCount = cnt[i];
                answer = i;
            } else if(maxCount == cnt[i]){
                answer = -1;
            }
        }
        return answer;
    }
}