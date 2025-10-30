# [Silver V] K번째 수 - 11004 

🔗[문제 링크](https://www.acmicpc.net/problem/11004)<br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)
#### [5. 사용된 자료구조](#사용된-자료구조)

<hr>


### 성능 요약

메모리: 379204 KB, 시간: 1952 ms

### 분류

정렬

### 제출 일자

2025년 10월 30일 10:38:30

### 문제 설명

<p>수 N개 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다.</p>

<p>둘째에는 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다. (-10<sup>9</sup> ≤ A<sub>i</sub> ≤ 10<sup>9</sup>)</p>

### 출력 

 <p>A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[] a = new int[n];
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		a[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(a);
    	System.out.print(a[k-1]);
    }
}
````
처음에는 Scanner로 진행했었는데 시간 초과가 뜸.
<img width="1500" height="72" alt="image" src="https://github.com/user-attachments/assets/4b3fa903-b7c0-42a8-8785-6da6aac689a3" />
<br>
그래서 BefferdReader를 사용했다.<br>
n과 k를 입력받고 n만큼 a 배열에 수를 저장한다.<br>
Arrays.sort()를 이용해 수를 정렬한 후, k번째 수를 출력한다.
<br><br><br>
### 다른 코드
**Do it! 알고리즘 코딩 테스트 풀이 참고**<br>
배열 - 퀵 정렬<br><br>
**✍🏻 슈도 코드 작성**<br>
````
N(숫자의 개수) K(K번째 수)
A(숫자 데이터 저장 배열)
for(N만큼 반복하기){
 A 배열 저장하기
}
퀵 소트 실행하기
K번째 데이터 출력하기

[별도의 함수 구현 부분]
퀵 소트 함수(시작, 종료, K)
{
 피벗 구하기 함수(시작, 종료)
 if(피벗 == K ) 종료
 else if(K < 피벗) 큇 소트 수행하기(시작, 피벗 - 1, K)
 else 퀵 소트 수행하기(피벗 + 1, 종료, K)
}
피벗 구하기 함수(시작, 종료)
{
 데이터가 두 개인 경우는 바로 비교하여 정렬
 M(중앙값)
 중앙값을 시작 위치와 스왑
 피컷을 시작 위치 값 A[S]로 저장
 i(시작점), j(종료점)
 while(i <= j)
 {
  피벗보다 큰 수가 나올 떄까지 i++
  피벗보다 작은 수가 나올 떄까지 j--
  찾은 i완 j 데이터를 스왑
 }
 피벗 데이터를 나눠진 두 그룹의 경계 index에 저장하기
 경계 index 리턴
}

````
<br>

**코드**
````
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine());
    	
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	quickSort(a, 0, n-1, k-1);
    	System.out.print(a[k-1]);
    }

	private static void quickSort(int[] a, int s, int e, int k) {
		if(s < e) {
			int pivot = partition(a, s, e);
			if(pivot == k) //k번째 수가 피벗이면 더이상 구할 필요 없다.
				return;
			else if(k < pivot) //k가 피벗보다 작으면 왼쪽 그룹반 정렬 수행
				quickSort(a, s, pivot - 1, k);
			else	//k가 피벗보다 크면 오른쪽 그룹만 정렬 수행
				quickSort(a, pivot + 1, e, k);
		}
	}

	private static int partition(int[] a, int s, int e) {
		if(s + 1 == e) {
			if(a[s] > a[e])swap(a,s,e);
			return e;
		}
		int m = (s + e) / 2;
		swap(a, s, m); //중앙값을 1번째 요소로 이동하기
		int pivot = a[s];
		int i = s + 1, j = e; 
		while(i <= j) {
			while(pivot < a[j] && j > 0) {	//피벗보다 작은 수가 나올 떄까지 j--
				j--;
			}
			while(pivot > a[j] && i < a.length-1) {	//피벗보다 큰 수가 나올 떄까지 i++
				i++;
			}
			if(i <= j) {
				swap(a, i++, j--);
			}
		}
		
		//i == j 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정
		a[s] = a[j];
		a[j] = pivot;
		return j;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
````
근데 이거 백준에 돌려보니까 시간초과 뜸; 흠.. 제가 뭘 잘못한거죠..?

<br>

### 📌사용된 자료구조
퀵 정렬


<br>
<br>
<br>
<br>
<br>
