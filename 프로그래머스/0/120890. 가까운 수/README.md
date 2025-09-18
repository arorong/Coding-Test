# [level 0] 가까운 수 - 120890 

🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120890) <br>
🔗 [블로그 정리](https://amy-g.tistory.com/380)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 74.3 MB, 시간: 0.57 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 18일 10:17:50

### 문제 설명

<p>정수 배열 <code>array</code>와 정수 <code>n</code>이 매개변수로 주어질 때, <code>array</code>에 들어있는 정수 중 <code>n</code>과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>array</code>의 길이 ≤ 100</li>
<li>1 ≤ <code>array</code>의 원소 ≤ 100</li>
<li>1 ≤ <code>n</code> ≤ 100</li>
<li>가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>array</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[3, 10, 28]</td>
<td>20</td>
<td>28</td>
</tr>
<tr>
<td>[10, 11, 12]</td>
<td>13</td>
<td>12</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>3, 10, 28 중 20과 가장 가까운 수는 28입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>10, 11, 12 중 13과 가장 가까운 수는 12입니다.</li>
</ul>

<p>※ 공지 - 2023년 3월 29일 테스트 케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.</p>


<br>
<br>

### 내 코드
````
import java.util.*;
 
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        
        answer = array[0];
        
        return answer;
    }
}
````

<br><br><br>

### 다른 풀이
````
import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || Math.abs(array[i] - n) < Math.abs(answer - n)) {
                answer = array[i];
                if (answer == n) {
                    break;
                }
            }
        }
        return answer;
    }
}
````
[🔗출처](https://sigfriede.tistory.com/230)<br>

<br><br><br><br><br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
