import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] cnt = new int[26];

        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            cnt[num]++;
        }

        int max = 0;
        char answer = '?';
        for(int i = 0; i < cnt.length; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                answer = (char)(i + 'A');
            } else if(max == cnt[i]) {
                answer = '?';
            }
        }
        System.out.print(answer);
    }
}
