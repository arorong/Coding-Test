import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        
        for (int i = 0; i < N; i++) { //바구니 내용 채우기
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) { //횟수만큼 순회
            int a = sc.nextInt() - 1; //시작 바구니 번호. 배열 0부터 시작
            int b = sc.nextInt() - 1; // 끝 바구니 번호

            while (a < b) {
                int temp = basket[a];
                basket[a++] = basket[b];
                basket[b--] = temp;
            }
        }
        sc.close();

        for (int result:basket)
            System.out.print(result + " ");
    }
}