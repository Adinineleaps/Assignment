import java.util.Random;

public class RandomNo {
	public static void main(String[] args) {
		Random rand = new Random();
		int count=0;
		int[] intArray = new int[10];
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=rand.nextInt(10);
			
		}
		for (int i = 0; i < intArray.length; i++) 
		{ if(i==9) {
			break;
		}
		else if(intArray[i]<intArray[i+1]) {
			count++;
		}
		else {
			continue;
		}
				
	}
		System.out.println(count);
	}
}

