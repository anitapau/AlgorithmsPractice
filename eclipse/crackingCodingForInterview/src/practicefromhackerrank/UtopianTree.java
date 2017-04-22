package practicefromhackerrank;
//The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

import java.util.Arrays;
import java.util.Scanner;

//Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after growth cycles?
public class UtopianTree {

	public static void main(String[] theArgs) {
		Scanner scan = new Scanner(System.in);
        //Prompt to next line
        int size = Integer.parseInt(scan.nextLine());
        int i = 0;
        int[] array = new int[size];
        while(i < size && scan.hasNextLine()) {
        	array[i] = Integer.parseInt(scan.nextLine());
        	i++;
        }
        for(int k = 0; k<array.length ; k++) {
        	System.out.println(printValue(array[k]));
        }
        scan.close();
	}
	
	
	public static int printValue(int theCycle) {
		int height = 1;
		int i = 1;
		while(i <= theCycle) {
			if(i % 2 == 0) {
				height +=1;
				
			}
			else {
				height*=2;
			
			}
			i++;
		}
		return height;
		
	}
}
