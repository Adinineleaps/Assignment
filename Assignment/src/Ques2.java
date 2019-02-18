

public class Ques2 {
	public static void main(String[] args) {
		int no = (int)(Math.random() * (9999)+1)+10000;
		System.out.println(no);
		int sum=0;
		while (no != 0)
		{
		sum = sum + no % 10;
		no = no/10;
		}
		System.out.println(sum);
		
	}
}
