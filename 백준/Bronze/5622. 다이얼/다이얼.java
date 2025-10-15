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