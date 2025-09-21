import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] score = new int[N];
    int m = 0;

    for(int i = 0; i < score.length; i++){
        score[i] = sc.nextInt();
        if(score[i] > m){
            m = score[i];
        } 
    }

    double sum = 0;
    for(int i = 0; i < score.length; i++){
        sum += (double)score[i]/m*100;
    }
	double avg = sum/N;
	System.out.print(avg);
 }
}