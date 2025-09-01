# [level 0] A로 B 만들기 - 120886 

🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120886) 

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 71.4 MB, 시간: 1.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 01일 10:32:17

### 문제 설명

<p>문자열 <code>before</code>와 <code>after</code>가 매개변수로 주어질 때, <code>before</code>의 순서를 바꾸어 <code>after</code>를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt; <code>before</code>의 길이 == <code>after</code>의 길이 &lt; 1,000</li>
<li><code>before</code>와 <code>after</code>는 모두 소문자로 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>before</th>
<th>after</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"olleh"</td>
<td>"hello"</td>
<td>1</td>
</tr>
<tr>
<td>"allpe"</td>
<td>"apple"</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.</li>
</ul>


<br>
<br>

### 내 코드
````
import java.util.Arrays;
 
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeChr = before.toCharArray();
        char[] afterChr = after.toCharArray();
        Arrays.sort(beforeChr); 
        Arrays.sort(afterChr);
 
        if(Arrays.equals(beforeChr, afterChr)){
            answer = 1;
        } else{
            answer = 0;
        }
        
        return answer;
    }
}
````
문자열을 내림차순으로 정렬한 후에 문자열을 비교하고자 했다.

처음에는 문자열을 배열로 바꾼 후 정렬해서 다시 문자열로 바꿀까 했는데 번거로운 것 같아서 문자열 그대로 정렬하고자 했다.

아니 근데 무슨 흐름으로 내가 이렇게 코드를 짰는지 이해가 안 간다;;; 졸면서 해서 그런가

toCharArray()를 sort()와 같다고 생각함; 근데 그런 거 치고 toCharArray()를 사용했는데 sort()를 또 썼어.

<br>

😣 처음 코드
````
import java.util.Arrays;
 
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] chrArray1 = before.toCharArray();
        char[] chrArray2 = after.toCharArray();
        Arrays.sort(chrArray1);
        Arrays.sort(chrArray2);
 
        if(chrArray1.equals(chrArray2)){
            answer = 1;
        } else{
            answer = 0;
        }
        
        return answer;
    }
}
```` 


테스트 1에서 실패가 떴다.

toCharArray()는 String 문자열을 char 배열로 바꿔주는 역할을 한다.

그렇기 때문에 toCharArray()로 문자열을 char[]로 바꾼 뒤 정렬(Arrays.sort)을 한 순간, 비교 대상이 배열이 되기 때문!!!

그래서 문자열 값이 아닌 주소값을 비교하게 되어 오답이 나왔던 것이다!

equals() → 문자열(String)끼리는 내용 비교, 배열(array)끼리는 주소 비교.

졸면서 해서 진짜 아무거나 보이는대로 막 썼나봐 따흑...

진짜 정신차리고 해야지

문자열이 아닌 배열끼리 비교해야 하기 때문에 Arrays.equals(a, b)를 이용해 해결했다.
<br><br><br>

### 다른 풀이
````
import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
 
        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
````
내가 짠 코드 간결 버전

<br><br>

````
class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
    }
}
````


<br><br><br><br><br>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
