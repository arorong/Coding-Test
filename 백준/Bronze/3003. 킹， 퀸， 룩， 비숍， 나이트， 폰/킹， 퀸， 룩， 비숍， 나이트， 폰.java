import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int[] total = {1,1,2,2,2,8}; //체스 피스 수(킹,퀸,룩,비숍,나이트,폰)
    	int[] white = new int[6]; //흰색 피스 배열
    	
    	for(int i = 0; i < 6; i++) { 
    		int N = sc.nextInt();
    		white[i] = total[i] - N;
    		System.out.print(white[i] + " ");
    	}
    }
}