import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int n = word.length();
		int i = 0;
		while(i!=n) {
			word = word.substring(1,5)+word.substring(0,1);
			System.out.println(word);
			i++; 
		}
		
	}

}
