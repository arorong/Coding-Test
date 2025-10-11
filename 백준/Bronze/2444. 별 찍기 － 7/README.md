# [Bronze III] 별 찍기 - 7 - 2444 

🔗 [문제 링크](https://www.acmicpc.net/problem/2444)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 21872 KB, 시간: 460 ms

### 분류

구현

### 제출 일자

2025년 10월 11일 14:55:28

### 문제 설명

<p>예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.</p>

### 입력 

 <p>첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.</p>

### 출력 

 <p>첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		for(int j = 0; j < n-i; j++ ) {
    			System.out.print(" ");
    		}
			for(int k = 0; k < i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
    	}
    	
    	for(int i = n-1; i >= 1; i--) {
    		for(int j = 0; j < n-i; j++)
    			System.out.print(" ");
    		for(int k = 0; k < i*2-1; k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
````

위쪽 삼각형에서 공백은 n - i / 별(*)은 2*i -1<br>
아래쪽 삼각형에서 공백은 n - i / 별(*)은 2*i -1<br>
아래쪽 삼각형 코드에서 첫번째 for문 i >= 0로 했었는데, ``i가 0일 경우 공백 n개 출력 후 별은 2*0 - 1 = -1이라 0개, 즉 빈 줄(공백만 있는 줄)이 추가로 출력``된다. 그러므로 1까지만 찍는 것을 권장.
<br><br><br>

**📌시간복잡도**<br>
각 줄마다 최대 O(n)개의 문자(공백+별)를 출력하고, 줄 수가 O(n) → 시간 O(n²)<br>
추가 자료구조 없이 상수 공간 O(1)

<br>
<br>
<br>
<br>
<br>









