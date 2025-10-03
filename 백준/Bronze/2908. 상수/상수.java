import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aa = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int bb = Integer.parseInt(new StringBuilder(b).reverse().toString());

        System.out.println(Math.max(aa, bb));
        sc.close();
    }
}
