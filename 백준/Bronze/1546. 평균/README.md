# [Bronze I] 평균 - 1546 

[문제 링크](https://www.acmicpc.net/problem/1546) <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)

<hr>

### 성능 요약

메모리: 18780 KB, 시간: 220 ms

### 분류

수학, 사칙연산

### 제출 일자

2025년 9월 21일 11:07:08

### 문제 설명

<p>세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.</p>

<p>예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.</p>

<p>세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.</p>

### 출력 

 <p>첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10<sup>-2</sup> 이하이면 정답이다.</p>


<br>
<br>

### 내 코드
````
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int m = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] > m) {
                m = score[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += (double) score[i] / m * 100;
        }
        double avg = sum / N;
        System.out.print(avg);
    }
}
````

처음에 합계 낼 때 ``sum += (double) score[i] / m * 100;``이렇게 코드를 작성했었다. 
실행을 하니 값이 완전 다르게 나왔는데, 왜 그런고하니 score와 m이 모두 int인데 int는 정수형이라 계산을 하면 소수점 이하는 버리기 때문에 만약 40/80을 하면 값은 0이 된다. 그렇기 때문에 결과값이 다르게 나왔던 것! 계산을 할때 강제로 double로 형변환 해주거나 score와 m을 처음부터 double로 바꿔준다.

<br>
<br>
<br>
<br>
<br>
