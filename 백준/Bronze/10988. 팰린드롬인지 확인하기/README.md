# [Bronze III] 팰린드롬인지 확인하기 - 10988 

🔗[문제 링크](https://www.acmicpc.net/problem/10988) <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)

<hr>


### 성능 요약

메모리: 17608 KB, 시간: 176 ms

### 분류

구현, 문자열

### 제출 일자

2025년 10월 16일 14:22:42

### 문제 설명

<p>알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.</p>

<p>팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. </p>

<p>level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.</p>

### 입력 

 <p>첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.</p>

### 출력 

 <p>첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int len = str.length();
    	int answer = 1;
    	
    	for(int i = 0; i < len/2; i++) {
    		if(str.charAt(i) != str.charAt(len-i-1)) {
    			answer = 0;
    		}
    	} System.out.print(answer);
    }
}
````
문자열을 절반으로 나눠서 절반만큼 for문을 돌린다. if문을 통해앞/뒤 문자를 비교해 일치하지 않으면 0을, 일치하면 1을 반환한다.
<br><br><br>
### 다른 코드
**StringBuilder**
````
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);
		
	}
}
````
🔗[참고](https://auyeol-coding.tistory.com/51)

<br>

**StringBuilder**
````
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
````
reverse()와 toString()을 사용하였다.

🔗[참고](https://propercoding.tistory.com/83#google_vignette)


<br>
<br>
<br>
<br>
<br>
