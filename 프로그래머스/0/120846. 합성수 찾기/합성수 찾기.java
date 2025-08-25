class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 순회하면서 각 숫자의 약수 개수를 확인
        for(int i = 1; i <= n; i++){ 
            int count = 0; // 현재 숫자 i의 약수 개수를 저장
            
            // 1부터 i까지 나눠서 i 약수 확인
            for(int j = 1; j <= i; j++){ 
                if(i % j == 0){ // 나머지가 0이면 약수
                    count++;
                } 
            }
            // 약수의 개수가 3개 이상이면 합성수이므로 answer 증가
            if(count >= 3){ 
                answer++;
            } 
        }
        return answer; // 합성수의 개수를 반환
    }
}
