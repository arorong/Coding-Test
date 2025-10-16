import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int len = str.length();
    	int answer = 1;
    	
    	for(int i = 0; i < len/2; i++) {
    		if(str.charAt(i) != str.charAt(len-i-1)) {
    			answer = 0;
    		}
    	} System.out.print(answer);
    }
}