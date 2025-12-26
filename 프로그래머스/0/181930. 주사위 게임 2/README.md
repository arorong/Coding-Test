# [level 0] 주사위 게임 2 - 181930 

🔗[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181930#qna)  <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 풀이](#다른-풀이)

<hr>


### 성능 요약

메모리: 91.8 MB, 시간: 0.11 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 12월 26일 15:12:12

### 문제 설명

<p>1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 <code>a</code>, <code>b</code>, <code>c</code>라고 했을 때 얻는 점수는 다음과 같습니다.</p>

<ul>
<li>세 숫자가 모두 다르다면 <code>a</code> + <code>b</code> + <code>c</code> 점을 얻습니다.</li>
<li>세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (<code>a</code> + <code>b</code> + <code>c</code>) × (<code>a</code><sup>2</sup> + <code>b</code><sup>2</sup> + <code>c</code><sup>2</sup> )점을 얻습니다.</li>
<li>세 숫자가 모두 같다면 (<code>a</code> + <code>b</code> + <code>c</code>) × (<code>a</code><sup>2</sup> + <code>b</code><sup>2</sup> + <code>c</code><sup>2</sup> ) × (<code>a</code><sup>3</sup> + <code>b</code><sup>3</sup> + <code>c</code><sup>3</sup> )점을 얻습니다.</li>
</ul>

<p>세 정수 <code>a</code>, <code>b</code>, <code>c</code>가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>a</code>, <code>b</code>, <code>c</code>는 1이상 6이하의 정수입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>c</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>2</td>
<td>6</td>
<td>1</td>
<td>9</td>
</tr>
<tr>
<td>5</td>
<td>3</td>
<td>3</td>
<td>473</td>
</tr>
<tr>
<td>4</td>
<td>4</td>
<td>4</td>
<td>110592</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 따라서 9를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (5<sup>2</sup> + 3<sup>2</sup> + 3<sup>2</sup> ) = 11 × 43 = 473점을 얻습니다. 따라서 473을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (4<sup>2</sup> + 4<sup>2</sup> + 4<sup>2</sup> ) × (4<sup>3</sup> + 4<sup>3</sup> + 4<sup>3</sup> ) = 12 × 48 × 192 = 110,592점을 얻습니다. 따라서 110592를 return 합니다.</li>
</ul>


<br>
<br>

### 내 코드
````
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a != b && b != c && a != c){
            answer = a+b+c;
        } else if(a == b && a != c|| a == c && a != b || b == c && b != a ){
            answer = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
        } else{
            answer =  (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) * ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3));
        }

        return answer;
    }
}
````
조건문을 이용해 풀긴 했는데 가독성이 너무 떨어진다.<br>
<br><br>
### 다른 풀이
프로그래머스에서 다른 풀이들을 찾아봤다.<br>
````
class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;

        if (a == b || b == c || a == c) {
            answer *= (a * a + b * b + c * c);
        }

        if (a == b && b == c) {
            answer *= (a * a * a + b * b * b + c * c * c);
        }

        return answer;
    }
}
````
기본값으로 a+b+c 세 수의 합을 만든다. 그 다음 두 숫자가 같은 경우, 세 숫자가 같은 경우를 계산한다.

````
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }

    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}
````

<br>
<br>
<br>


프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
