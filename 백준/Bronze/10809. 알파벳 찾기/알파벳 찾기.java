import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26]; //알파벳
		
		//모든 값을 -1로 초기화
		for(int i = 0; i < 26; i++) {
			arr[i] = -1; 
		}
		
		for(int i = 0; i< s.length(); i++) {
			char c = s.charAt(i); //i번째 문자
			int idx = c - 'a'; //'a'를 0으로, 'b'를 1로,.... 매핑
			if(arr[idx] == -1) { //처음 등장하는 위치 찾아야 하므로 -1일 때 해당 알파벳 첫 등장 인덱스 저장
				arr[idx] = i;
			}
		}
		
		//알파벳 숫서대로 첫 등장 인덱스 출력
		for(int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
	} 
}