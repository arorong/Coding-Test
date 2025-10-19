# [Bronze I] 단어 공부 - 1157 

[문제 링크](https://www.acmicpc.net/problem/1157)  <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>


### 성능 요약

메모리: 29220 KB, 시간: 408 ms

### 분류

구현, 문자열

### 제출 일자

2025년 10월 19일 10:52:22

### 문제 설명

<p>알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.</p>

### 입력 

 <p>첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.</p>

### 출력 

 <p>첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next().toUpperCase(); //대문자로 변환
    	
    	int[] cnt = new int[26]; //알파벳에 대한 빈도를 저장할 정수 배열 생성
    	// cnt[0]은 A의 개수, cnt[1]은 B의 개수...
    	
    	for(int i = 0; i < str.length(); i++) {
    		int num = str.charAt(i) -'A'; //i번째 문자 꺼냄. 'A'의 아스키코드 65. -'A'를 해서 정수로 변환. 'A' -> 0, 'B' ->1...
    		//baaa라면 BAAA로 변환된 후, str.charAt(0)은 'B'-'A' = 66- 65. cnt[1]은 B의 인덱스
    		cnt[num]++; //해당 인덱스의 cnt 값을 1 증가시켜 그 문자의 출현 횟수 카운트
    	}
    	
    	int max = 0; //최대 빈도 수
    	char answer = '?'; //현재까지의 최빈 문자. 초기값 '?'
    	for(int i = 0; i < cnt.length; i++) { //배열 돌면서 각 문자의 빈도를 cnt[i]를 max와 비교
    		if(max < cnt[i]) { // 더 큰 빈도값을 발견하면 max 갱신하고 그 문자를 answer로 설정
    			max = cnt[i];
    			answer = (char)(i+'A'); 
    		} else if(max == cnt[i]) { //빈도가 최대와 같다면 '?' 
    			answer = '?';
    		}
    	}
    	System.out.print(answer);
    }
}
````
결과가 대문자로 출력되기도 하고, 문자와 알파벳 비교를 편히 하기 위해 입력 문자열을 모두 대문자로 변환한다. (toUpperCase())
<br>
알파벳 개수만큼 배열을 생성해준다.
<br>
for문으로 입력한 문자열을 순회해 문자열에 있는 알파벳 수를 카운트한다.
<br>
반복문을 통해 cnt 배열을 순회해 max 갱신


<br>
<br>
<br>
<br>
<br>




