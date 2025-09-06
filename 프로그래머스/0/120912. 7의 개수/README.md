# [level 0] 7의 개수 - 120912 

🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120912) <br>
🔗 [블로그 정리](https://amy-g.tistory.com/373)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 78.3 MB, 시간: 0.05 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 06일 10:33:33

### 문제 설명

<p>머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 <code>array</code>가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>array</code>의 길이 ≤ 100</li>
<li>0 ≤ <code>array</code>의 원소 ≤ 100,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>array</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[7, 77, 17]</td>
<td>4</td>
</tr>
<tr>
<td>[10, 29]</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>[7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>[10, 29]에는 7이 없으므로 0을 return 합니다.</li>
</ul>


<br>
<br>

### 내 코드
````
import java.util.Arrays;
 
class Solution {
    public int solution(int[] array) {
        int answer = 0;
 
        String str = Arrays.toString(array);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='7'){
                answer++;
            }
        }
        return answer;
    }
}
````

처음엔 배열을 문자열로 바꾼 후 하나 하나 쪼개준 다음에 7 포함 여부를 확인하는 방법을 생각했다.<br>
그런데 마음대로 되질 않는다!!!!!!!!!!!!!!<br>
처음에 코드를 아래와 같이 작성했다. 근데 실행 결과가 계속 테스트 1에서 오답이 떴다. 답이 무조건 0이 떠서 테스트 2는 통과로 보인 듯.<br><br>
<img width="550" height="550" alt="image" src="https://github.com/user-attachments/assets/4cedb413-820e-4023-9953-8a73c9fe7341" />

````
import java.util.Arrays;
 
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        String str1[] = str.split(",");
        int cnt = 0;
        
        for(int i = 0; i < str1.length; i++){
            if(str1.equals("7")){
                cnt++;
                answer = cnt;
            }
        }
        return answer;
    }
}
````
<br>
굳이... 굳~~~~이 이렇게 이해도 안 가는 방법을 쓸 필요가 없었다.<br>
그냥 형변환 한 후에 그냥 배열 순회해서 찾으면 됐던거임...!!!!!!!!<br>
복잡하게 생각은 하는데 또 이상하게 생각해서 문제야...
<br><br><br>


#### 다른 풀이
````
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}
````
각 자릿수를 확인하는 방식으로 풀이. 숫자를 문자열로 바꾸지 않고 진행할 수 있다.<br>
for-each문으로 배열 안의 숫자 순회한다. while문에서 a가 0이 될 떄까지 반복하면서 숫자의 각 자리수를 하나씩 떼어낸다. a%10은 a의 일의 자리를 구하는 연산으로 일의 자리가 7이면 answer를 증가시킨다. a /= 10을 해서 한 자리 줄인다.
<br><br><br>
````
public static int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            String num = Integer.toString(array[i]); //숫자를 문자열로 변환
            String[] arr = num.split(""); //한 글자씩 쪼개서 배열에 담음
            
            for(int j = 0; j < arr.length; j++){ //각 자리 순회
                if(arr[j].equals("7")) //'7'이면 카운트
                	answer++; 
            }
        }
        
        return answer;
    }
}
````


<br><br><br><br><br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
