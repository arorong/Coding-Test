# [Bronze II] 상수 - 2908 

🔗[문제 링크](https://www.acmicpc.net/problem/2908)  <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)

<hr>



### 성능 요약

메모리: 17548 KB, 시간: 168 ms

### 분류

수학, 구현

### 제출 일자

2025년 10월 3일 15:50:51

### 문제 설명

<p>상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.</p>

<p>상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.</p>

<p>두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.</p>

### 출력 

 <p>첫째 줄에 상수의 대답을 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aa = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int bb = Integer.parseInt(new StringBuilder(b).reverse().toString());

        System.out.println(Math.max(aa, bb));
        sc.close();
    }
}

````
처음에는 reverse 생각을 못하고 숫자를 String으로 받은 후 for문을 이용해 뒤집어서 형변환 하려고 했는데 계속 실패떠서 구글링해서 찾아봄...<br><br>
✔️ ``new StringBuilder(a).reverse().toString()``<br>
``new StringBuilder(a)``: 문자열 a를 가변 버퍼에 담음<br>
``.reverse()``: 버퍼를 제자리에서 뒤집기<br>
``.toString()``: 뒤집힌 결과를 문자열로 꺼냄<br>
→ 예: "734" → "437"

✔️``Integer.parseInt(...)``<br>
뒤집힌 문자열을 정수로 바군다.<br>
(문제 조건상 ‘0이 포함되지 않음’이라 앞에 0이 붙는 케이스는 원래부터 없지만, 설령 있었다 해도 parseInt("012")는 12로 안전하게 변환됨.)<br>
``Math.max(aa, bb)`` : 두 정수 중 큰 값을 출력
<br><br>

🔍**왜 StringBuilder를 사용했나**?<br>
1. reverse()를 지원<br>
String에는 reverse()가 없고, StringBuilder에는 있다.<br>
그래서 new StringBuilder(A).reverse().toString() 한 줄로 “문자열 뒤집기”를 끝낼 수 있다.<br>
가독성도 좋음
2. 가변 버퍼라 append/뒤집기 비용이 낮음<br>
String은 불변이라 문자를 붙일 때마다 새 객체가 만들어지지만, StringBuilder는 내부 버퍼를 바꿔서 처리한다. (이번 문제처럼 3글자면 체감은 없지만, 습관적으로 안전)
3. 표준적이고 실수 적은 방법<br>
직접 인덱스 계산/자리수 분해를 하다 보면 off-by-one 같은 실수를 할 수 있다.<br>
reverse()는 그런 실수를 원천 차단.
<br><br><br>
### 다른 코드
````
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	
	}
}
````
🔗[참고](https://st-lab.tistory.com/66)
<br><br>
````
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = reversNum(sc.nextInt());
        int b = reversNum(sc.nextInt());

        System.out.println((a>b)? a:b);
    }

    static int reversNum(int num){
        String number = String.valueOf(num);
        String temp = "0";
        for (int i = 3; i > 0 ; i--) {
            temp += number.charAt(i-1);
        }
        return Integer.parseInt(temp);
    }
}
````
🔗[참고](https://jaejong.tistory.com/18)


<br>
<br>
<br>
<br>
<br>

