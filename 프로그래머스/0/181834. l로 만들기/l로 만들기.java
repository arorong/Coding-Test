class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            char a = myString.charAt(i);
            if(a < 'l'){
                answer += 'l';
            } else{
                answer += a;
            }
        }
        
        return answer;
    }
}