# [Bronze II] 단어의 개수 - 1152 

🔗 [문제 링크](https://www.acmicpc.net/problem/1152) <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)
#### [5. 사용된 자료구조](#사용된-자료구조)

<hr>



### 성능 요약

메모리: 63512 KB, 시간: 484 ms

### 분류

구현, 문자열

### 제출 일자

2025년 10월 3일 14:20:17

### 문제 설명

<p>영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.</p>

### 입력 

 <p>첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.</p>

### 출력 

 <p>첫째 줄에 단어의 개수를 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim(); //앞뒤 공백 제거
		
		if(str.isEmpty()) {
			System.out.println(0); // 전부 공백이었으면 단어 0개
		} else{
			String[] arr = str.split(" "); // 문제 조건: 공백 1개로 구분
			System.out.print(arr.length);
		}
	} 
}
````
<br><br>
처음엔 아래 코드처럼 작성했었다.
````
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		Arrays.toString(arr);
		System.out.print(arr.length);
	} 
}
````
이클립스에서 돌렸을 땐 제대로 나와서 제출했더니 틀렸다고 떴다. 왜 그런가 했더니 문자열 앞에 공백을 간과하고 있었다. 앞 공백 생각 안하고 코드 짰더니 틀렸던 것!<br>
**✔️ 앞/뒤 공백 처리 문제**<br>
``split(" ")``는 문자열이 앞에 공백으로 시작하면 맨 앞에 ""(빈 문자열) 토큰이 생겨서 개수가 1개 더 늘어난다.<br>
예: " hello" → ["", "hello"] → 길이 2 (정답은 1)
<br>
참고: Java의 split은 뒤쪽의 빈 토큰은 버리지만 앞쪽 빈 토큰은 유지.<br>
그래서 "hello " → ["hello"](정답 1과 동일)인데, " hello"는 망가짐.<br>
<br>
**✔️ 쓸모없는 코드**<br>
``Arrays.toString(arr);``는 리턴값을 안 쓰면 아무 효과가 없다. (디버그용이라면 ``System.out.println(Arrays.toString(arr));``처럼 출력해야 함.)<br>
이건 몰랐던 내용
<br><br><br>
### 다른 코드
split("\\s+") 사용
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(str.split("\\s+").length); // 공백 1개든 여러 개든 OK
        }
        sc.close();
    }
}
````

<br>
StringTokenizer 사용

````
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
        sc.close();
    }
}
````

### 사용된 자료구조
배열
<br>
<br>
<br>
<br>
<br>



