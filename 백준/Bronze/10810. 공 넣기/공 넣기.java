import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bascket = new int[N];

		for(int x = 0; x < M; x++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int y = i - 1; y <= j - 1; y++){
				bascket[y] = k;
			}
		}
		
		for(int y = 0; y < N; y++){
			System.out.print(bascket[y] + " ");
		}
	}

}