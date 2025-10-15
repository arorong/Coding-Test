# [Bronze II] 다이얼 - 5622 

🔗[문제 링크](https://www.acmicpc.net/problem/5622) <br>

#### [1. 성능 요약](#성능-요약)
#### [2. 문제 설명](#문제-설명)
#### [3. 내 코드](#내-코드)
#### [4. 다른 코드](#다른-코드)

<hr>


### 성능 요약

메모리: 17600 KB, 시간: 164 ms

### 분류

구현

### 제출 일자

2025년 10월 15일 09:39:19

### 문제 설명

<p>상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.</p>

<p style="text-align: center;"><img alt="" src="https://u.acmicpc.net/9c88dd24-3a4c-4a09-bc50-e6496958214d/Screen%20Shot%202021-06-16%20at%2012.48.39%20AM.png" style="width: 267px; height: 265px;"></p>

<p>전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.</p>

<p>숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.</p>

<p>상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.</p>

<p>할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.</p>

### 출력 

 <p>첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.</p>


<br>
<br>

### 내 코드
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	
    	int countSec = 0;
    	for(int i = 0; i < str.length(); i++) {
    		switch(str.charAt(i)) {
    		case 'A': case 'B': case 'C':
    			countSec += 3;
    			break;
    			
    		case 'D': case 'E': case 'F':
    			countSec += 4;
    			break;
    			
    		case 'G': case 'H': case 'I':
    			countSec += 5;
    			break;
    			
    		case 'J': case 'K': case 'L':
    			countSec += 6;
    			break;
    			
    		case 'M': case 'N': case 'O':
    			countSec += 7;
    			break;
    			
    		case 'P': case 'Q': case 'R': case 'S':
    			countSec += 8;
    			break;
    			
    		case 'T': case 'U': case 'V':
    			countSec += 9;
    			break;
    			
    		case 'W': case 'X': case 'Y': case 'Z':
    			countSec += 10;
    			break;
    		}
    	} System.out.print(countSec);
    }
}
````
if문과 switch-case문을 고민하다가 switch-case문으로 문풀한 적이 드물어서 이를 사용해 풀었다.<br>
countSec은 다이얼을 돌리는데 걸린 총 시간을 뜻한다.
<br><br><br>
### 다른 코드
**if~else문**
````
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	
    	int countSec = 0;
    	for(int i = 0; i < str.length(); i++) {
    		char s = str.charAt(i);
    		if(s == 'A' || s == 'B' || s == 'C') {
    			countSec += 3;
    		} else if(s == 'D' || s == 'E' || s == 'F') {
    			countSec += 4;
    		} else if(s == 'G' || s == 'H' || s == 'I') {
    			countSec += 5;
    		} else if(s == 'J' || s == 'K' || s == 'L') {
    			countSec += 6;
    		} else if(s == 'M' || s == 'N' || s == 'O') {
    			countSec += 7;
    		} else if(s == 'P' || s == 'Q' || s == 'R' ||s == 'S') {
    			countSec += 8;
    		} else if(s == 'T' || s == 'U' || s == 'V') {
    			countSec += 9;
    		} else {
    			countSec += 10;
    		}
    	}
    	System.out.print(countSec);
    }
}
````
위처럼 할 수도 있는데 더 줄여서 아래처럼 구현할 수도 있다.
````
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= 'C') count += 3;          // ABC
            else if (c <= 'F') count += 4;     // DEF
            else if (c <= 'I') count += 5;     // GHI
            else if (c <= 'L') count += 6;     // JKL
            else if (c <= 'O') count += 7;     // MNO
            else if (c <= 'S') count += 8;     // PQRS
            else if (c <= 'V') count += 9;     // TUV
            else count += 10;                  // WXYZ
        }
        System.out.println(count);
    }
}
````
<br>

**배열**
````
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        arr[0] = arr[1] = arr[2] = 3; //A, B, C는 각각 3초가 걸린다
        arr[3] = arr[4] = arr[5] = 4; //D, E, F는 4초가 걸린다 
        arr[6] = arr[7] = arr[8] = 5;
        arr[9] = arr[10] = arr[11] = 6;
        arr[12] = arr[13] = arr[14] = 7;
        arr[15] = arr[16] = arr[17] = arr[18] = 8;
        arr[19] = arr[20] = arr[21] = 9;
        arr[22] = arr[23] = arr[24] = arr[25] = 10;
        int sum = 0;  //걸리는 시간
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += arr[(int)c - 65];  //아스키 코드값 이용
        }
        System.out.print(sum);
    }
}
````
🔗[참고](https://propercoding.tistory.com/163#google_vignette) 

<br>

**배열 + indexOf**
````
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String[] groups = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int g = 0; g < groups.length; g++) {
                if (groups[g].indexOf(c) >= 0) {
                    count += (g + 3);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
````
각 그룹 문자열에서 문자를 찾아 그룹 인덱스 + 3으로 시간을 계산


<br>
<br>
<br>
<br>
<br>
