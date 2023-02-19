package practical;

import java.util.Random;

public class One {

	public static void main(String[] args) {
		int start = 1;
        int end = 800;
        int counter = 500;

        int smallest;
        int greatest;
        int randomInt ;

        int numbers [] = new int[counter];
        Random random = new Random(); 

        randomInt = random.nextInt(end-start) + start;
        numbers [0] = randomInt;

        smallest = randomInt;
        greatest = randomInt;


        System.out.println("0th Greatest : " + greatest + "\n");
        System.out.println("0th Smallest : " + smallest + "\n");

        for(int i=1;i<counter;i++) {

            numbers[i] = random.nextInt(end-start) + start;

            smallest = Math.min(smallest,numbers[i]);
            greatest = Math.max(greatest,numbers[i]);

            System.out.println(i + "th Smallest : " + smallest + "\n");

        }	
	}
	public static void doesFileExist(String [] args) {
		
		
	}
}
	
	

