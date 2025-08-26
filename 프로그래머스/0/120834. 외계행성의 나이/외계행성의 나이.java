class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age); //숫자를 문자열로
 
        for (int i = 0; i < str.length(); i++) { //str 순회
            int num = str.charAt(i) - '0'; //문자를 정수로 변환 예) 문자 '0'~'9' -> 정수 0~9
            char ch = (char) ('a' + num); //숫자를 알파벳으로 변환 예) 정수 0~9 -> 문자 'a'~j'
            answer += ch; //문자 이어붙이기
        }
        return answer;
    }
}
