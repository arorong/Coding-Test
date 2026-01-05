# [level 0] l로 만들기 - 181834 

🔗[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181834) <br> 

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 풀이](#다른-풀이)

<hr>


### 성능 요약

메모리: 394 MB, 시간: 1115.51 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 05일 10:17:34

### 문제 설명

<p>알파벳 소문자로 이루어진 문자열 <code>myString</code>이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>myString</code> ≤ 100,000

<ul>
<li><code>myString</code>은 알파벳 소문자로 이루어진 문자열입니다.</li>
</ul></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>myString</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"abcdevwxyz"</td>
<td>"lllllvwxyz"</td>
</tr>
<tr>
<td>"jjnnllkkmm"</td>
<td>"llnnllllmm"</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>0 ~ 4번 인덱스의 문자 "a","b","c","d","e"는 각각 "l"보다 앞서는 문자입니다. 따라서 "l"로 고쳐줍니다.</li>
<li>그 외의 문자는 모두 "l"보다 앞서지 않는 문자입니다. 따라서 바꾸지 않습니다.</li>
<li>따라서 "lllllvwxyz"을 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>0번, 1번, 6번, 7번 인덱스의 문자 "j","j","k","k"는 각각 "l"보다 앞서는 문자입니다. 따라서 "l"로 고쳐줍니다.</li>
<li>그 외의 문자는 모두 "l"보다 앞서지 않는 문자입니다. 따라서 바꾸지 않습니다.</li>
<li>따라서 "llnnllllmm"을 return 합니다.</li>
</ul>


<br>
<br>

### 내 코드
````
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
````
i 요소의 아스키코드가 'l'의 아스키코드(108) 보다 작으면 'l'로 교체되고 그렇지 않으면 i 요소 그대로 더해준다.
<br>
<br><br>

### 다른 풀이
정규식 표현으로 푸는 방법도 있다.
````
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}
````

<br>
<br>
<br>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
