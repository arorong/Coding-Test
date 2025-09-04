# [level 0] 숨어있는 숫자의 덧셈 (2) - 120864 

🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120864)<br>
🔗 [블로그 정리](https://amy-g.tistory.com/368)<br><br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>


### 성능 요약

메모리: 88.8 MB, 시간: 0.23 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 04일 09:30:54

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어집니다. <code>my_string</code>은 소문자, 대문자, 자연수로만 구성되어있습니다. <code>my_string</code>안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li>1 ≤ <code>my_string</code> 안의 자연수 ≤ 1000</li>
<li>연속된 수는 하나의 숫자로 간주합니다.</li>
<li>000123과 같이 0이 선행하는 경우는 없습니다.</li>
<li>문자열에 자연수가 없는 경우 0을 return 해주세요.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"aAb1B2cC34oOp"</td>
<td>37</td>
</tr>
<tr>
<td>"1a2b3c4d123Z"</td>
<td>133</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.</li>
</ul>



<br>
<br>

### 내 코드
````
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("[a-zA-Z]");
        
        for(int i = 0; i < num.length; i++){
            if(!num[i].equals("")){
                answer += Integer.parseInt(num[i]);
            }
        }
        
        return answer;
    }
}
````
문자열 my_string에서 숫자들만 뽑아서 더한다.<br>
정규표현식을 사용해 소문자 대문자 알파벳을 기준으로 my_string﻿의 문자열을 나눈다.<br>
예로 "aAb1B2cC34oOp" -> [ "","",1,"",2"","",34,"","","" ]<br>
분할한 배열인 num을 순회하면서 빈 문자열이 아닌 경우에만 Integer.parseInt()를 이용해 정수로 변환한다.<br>
answer에 더한 후 answer 값 반환한다.
<br><br>
#### 다른 풀이
````
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
````
정규표현식을 사용해 모든 알파벳을 공백으로 바꾼 후 공백 기준으로 문자열을 나눠 str 배열에 저장한다.<br>
향상된 for문을 이용해 str 배열을 순회하면서 빈 문자열이 아닌 경우에만 문자열로  숫자를 정수로 형변환하여 answer에 더해준다.<



<br><br><br><br><br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
