# [Bronze II] 수 정렬하기 - 2750 

[문제 링크](https://www.acmicpc.net/problem/2750)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)
#### [5. 사용된 자료구조](#사용된-자료구조)

<hr>


### 성능 요약

메모리: 22176 KB, 시간: 272 ms

### 분류

정렬, 구현

### 제출 일자

2025년 10월 26일 10:26:03

### 문제 설명

<p>N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.</p>

### 출력 

 <p>첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] arr = new int[N];
    	
    	for(int i = 0; i < N; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	for(int i = 0; i<N; i++) {
    		System.out.println(arr[i]);
    	}
    }
}
````
Arrays.sort()를 사용해 문제를 풀었다.<br>
먼저 배열 arr를 선언해준 후, arr에 숫자를 담아준다. Arrays.sort()로 정렬해준 후 하나씩 출력한다.
<br><br><br>
### 다른 코드
**Do it! 알고리즘 코딩 테스트 풀이 참고**<br>
정렬 구현 파트이므로 정렬로 문제를 푼다. <br>
배열 - 버블 정렬<br><br>
**✍🏻 슈도 코드 작성**<br>
````
N(정렬할 수 개수)
A(정렬할 배열 선언)
for(i:0~N -1)
 {
   for(j:0~N -1-i) //정렬하는 범위
   {
     현재 A 배열의 값보다 한 칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
   }
  }
  A 배열 출력
````
<br>

**코드**<br>
<img width="950" height="100" alt="image" src="https://github.com/user-attachments/assets/04776d79-2f47-4085-964f-5772746f73bf" />
````
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] A = new int[N];
    	
    	for(int i = 0; i < N; i++) {
    		A[i] = sc.nextInt();
    	}

     //버블 정렬 구현하는 영역
    	for(int i = 0; i < N-1; i++) { //마지막엔 두 개가 한 번에 swap 되므로 n-1까지만 돌려도 된다.
    		for(int j = 0; j < N-1-i; j++) {
    			if(A[j] > A[j+1]) {
    				int temp = A[j];
    				A[j] = A[j+1];
    				A[j+1] = temp;
    			}
    		}
    	}
    	for(int i = 0; i < N; i++) {
    		System.out.println(A[i]);
    	}
    }
}
````
``if(A[j] > A[j+1])`` 일 때 인접한 두 원소를 서로 바꿔서 큰 값이 우측으로 이동하게 만든다.<br>

**🔍 N-1, N-1-i를 하는 이유?** <br>
``외부 루프 i = 0 .. N-2 (i < N-1)``<br>
한 번의 내부 루프당 최댓값 하나가 제일 끝으로 이동<br>
N개의 원소가 있을 때, N-1번의 패스만으로 모든 원소가 제자리를 찾는다. 마지막 남은 하나는 자동으로 정렬된 상태가 되므로 N번 반복할 필요가 없다.<br>
그래서 N-1번만 반복
<br>
``내부 루프 j = 0 .. N-2-i (j < N-1-i)``<br>
각 루프가 끝나면 우측 끝에 이미 정렬된 원소 i개가 생김(첫 루프 후 최댓값 1개, 두 번째 루프 후 두 개...)<br>
그러니 그 정렬된 부분(우측 끝 i개)을 다시 비교할 필요가 없으므로 내부 루프의 끝 인덱스를 N-1-i로 줄여서 불필요한 비교/교환을 줄인다.
<br>

한 마디로,<br>
N-1은 필요한 패스 수(최대)<br>
N-1-i는 이미 정렬된 오른쪽 끝 부분을 건너뛰기 위한 내부 범위 축소.

* 동작 예시 (작동 흐름, N=4, A={4,2,3,1})
````
i=0 (첫 패스): 비교 대상 j=0..2 → 결과 가장 큰 값(4)이 A[3]로 이동
i=1 (두 번째): j=0..1 → 두 번째로 큰 값이 A[2]로 이동
i=2: j=0..0 → 그다음 값이 A[1]로 이동
i=3 (N-1까지라면 필요 없음) → 정렬 완료
````
<br>

### 📌사용된 자료구조
버블 정렬


<br>
<br>
<br>
<br>
<br>
