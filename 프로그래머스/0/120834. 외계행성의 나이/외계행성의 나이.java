class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            char ch = (char) ('a' + num);
            answer += ch; 
        }

        return answer;
    }
}