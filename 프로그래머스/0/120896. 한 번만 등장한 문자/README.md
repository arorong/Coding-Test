# [level 0] 한 번만 등장한 문자 - 120896 

🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120896)<br>
🔗 [블로그 정리](https://amy-g.tistory.com/370)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 78.1 MB, 시간: 4.09 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 03일 10:16:23

### 문제 설명

<p>문자열 <code>s</code>가 매개변수로 주어집니다. <code>s</code>에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt; <code>s</code>의 길이 &lt; 1,000</li>
<li><code>s</code>는 소문자로만 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"abcabcadc"</td>
<td>"d"</td>
</tr>
<tr>
<td>"abdc"</td>
<td>"abcd"</td>
</tr>
<tr>
<td>"hello"</td>
<td>"eho"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>"hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.</li>
</ul>


<br>
<br>

### 내 코드
````
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
````
문자열 s를 split()으로 나눠 문자열 배열을 만든 후, 알파벳 순으로 정렬해준다.<br>
바깥쪽 for문을 통해 전체 sArr 문자배열을 순회하고 안쪽 for문을 통해 sArr[i]가 몇 번 나오는지 세어서 cnt에 추가한다.<br>
카운트 한 숫자가 1이면 그 문자값을 추가한다.



<br><br><br><br><br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
