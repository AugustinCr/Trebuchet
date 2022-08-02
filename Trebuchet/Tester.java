/**
 * This class reads input from the file, saves the data to
 * arrays and sends it to trebuchetCalcs for calculations.
 * 
 * @author Andrei Dumitrascu
 * @version JDK 17.0.7.3
 * @since 2022-06-25
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {

        File inFile = new File("project_2_data.txt");
        Scanner input = new Scanner(inFile);
        
        int numOfSets = input.nextInt();
        int i = 0;
        
        //SET 1
        int speedLength1 = input.nextInt();
        int[] speedNums1 = new int[speedLength1];
    
        while (input.hasNextInt() && i < speedLength1) {  	// The values in the file are saved to single dimensional arrays using while loops.
        	speedNums1[i] = input.nextInt();				// The loop is repeated for all sets.
        	i++;
        }
        i = 0;
        
        int angleLength1 = input.nextInt();
        int[] angleNums1 = new int[angleLength1];			// There are two while loops for every set. One for the speeds, and one for the angles. 
        
        while (input.hasNextInt() && i < angleLength1) {
        	angleNums1[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist1 = input.nextInt(); //Minimum and maximum distances are saved in variables.  
        int maxDist1 = input.nextInt();
        
        //SET 2
        int speedLength2 = input.nextInt();
        int[] speedNums2 = new int[speedLength2];
        
        while (input.hasNextInt() && i < speedLength2) {
        	speedNums2[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength2 = input.nextInt();
        int[] angleNums2 = new int[angleLength2];
        
        while (input.hasNextInt() && i < angleLength2) {
        	angleNums2[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist2 = input.nextInt();
        int maxDist2 = input.nextInt();
        
        //SET 3
        int speedLength3 = input.nextInt();
        int[] speedNums3 = new int[speedLength3];
        
        while (input.hasNextInt() && i < speedLength3) {
        	speedNums3[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength3 = input.nextInt();
        int[] angleNums3 = new int[angleLength3];
        
        while (input.hasNextInt() && i < angleLength3) {
        	angleNums3[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist3 = input.nextInt();
        int maxDist3 = input.nextInt();
	
        //SET 4
        int speedLength4 = input.nextInt();
        int[] speedNums4 = new int[speedLength4];
        
        while (input.hasNextInt() && i < speedLength3) {
        	speedNums4[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength4 = input.nextInt();
        int[] angleNums4 = new int[angleLength4];
        
        while (input.hasNextInt() && i < angleLength4) {
        	angleNums4[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist4 = input.nextInt();
        int maxDist4 = input.nextInt();
        
        //SET 5
        int speedLength5 = input.nextInt();
        int[] speedNums5 = new int[speedLength5];
        
        while (input.hasNextInt() && i < speedLength5) {
        	speedNums5[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength5 = input.nextInt();
        int[] angleNums5 = new int[angleLength5];
        
        while (input.hasNextInt() && i < angleLength5) {
        	angleNums5[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist5 = input.nextInt();
        int maxDist5 = input.nextInt();
	
        //SET 6
        int speedLength6 = input.nextInt();
        int[] speedNums6 = new int[speedLength6];
        
        while (input.hasNextInt() && i < speedLength6) {
        	speedNums6[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength6 = input.nextInt();
        int[] angleNums6 = new int[angleLength6];
        
        while (input.hasNextInt() && i < angleLength6) {
        	angleNums6[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist6 = input.nextInt();
        int maxDist6 = input.nextInt();
        
        //SET 7
        int speedLength7 = input.nextInt();
        int[] speedNums7 = new int[speedLength7];
        
        while (input.hasNextInt() && i < speedLength7) {
        	speedNums7[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int angleLength7 = input.nextInt();
        int[] angleNums7 = new int[angleLength7];
        
        while (input.hasNextInt() && i < angleLength7) {
        	angleNums7[i] = input.nextInt();
        	i++;
        }
        i = 0;
        
        int minDist7 = input.nextInt();
        int maxDist7 = input.nextInt();
        
        input.close();

        // All of the saved distances, speeds, angles, and lengths are passed to a method
        // which uses this data to calculate and display everything seen in the output.
        trebuchetCalcs trebuchetCalc = new trebuchetCalcs();
		trebuchetCalc.trajectoryCalc(speedNums1, angleNums1, speedLength1, angleLength1, minDist1, maxDist1);
		trebuchetCalc.trajectoryCalc(speedNums2, angleNums2, speedLength2, angleLength2, minDist2, maxDist2);
		trebuchetCalc.trajectoryCalc(speedNums3, angleNums3, speedLength3, angleLength3, minDist3, maxDist3);
		trebuchetCalc.trajectoryCalc(speedNums4, angleNums4, speedLength4, angleLength4, minDist4, maxDist4);
		
		trebuchetCalc.trajectoryCalc(speedNums5, angleNums5, speedLength5, angleLength5, minDist5, maxDist5);
		trebuchetCalc.trajectoryCalc(speedNums6, angleNums6, speedLength6, angleLength6, minDist6, maxDist6);
		trebuchetCalc.trajectoryCalc(speedNums7, angleNums7, speedLength7, angleLength7, minDist7, maxDist7);
	
	}
}
