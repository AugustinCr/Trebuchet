/**
 * This class is responsible for the calculations and displaying the tables.
 * 
 * @author Andrei Dumitrascu
 * @version JDK 17.0.7.3
 * @since 2022-06-25
 */

import java.text.DecimalFormat;

public class trebuchetCalcs {

	/**
	 * Calculates the data in the 2D Array and displays a table.
	 * 
	 * @param speed - arrays consisting of the speeds
	 * @param angle - arrays consisting of the angles
	 * @param speedLength - length of the array consisting the speeds
	 * @param angleLength - length of the array consisting the angles
	 * @param minDist - minimum distance of the set (near-wall)
	 * @param maxDist - maximum distance of the set (far-wall)
	 * @return N/A Void - prints out the tables.
	 */
	public void trajectoryCalc(int[] speed, int[] angle, int speedLength, int angleLength, int minDist, int maxDist) {
		double[][] trajectoryTable = new double[speedLength][angleLength];
		DecimalFormat df = new DecimalFormat(".00");
		
		// The projectile motion formula is used in the for loop to calculate the motion of an object.
		// The results are stored in the two dimensional array.
		for (int i = 0; i < trajectoryTable.length; i++) {
			for (int j = 0; j < trajectoryTable[i].length; j++) {
				trajectoryTable[i][j] = ((Math.pow(speed[i], 2)) * Math.sin(Math.toRadians(angle[j]) * 2)) / 9.8;
			}
		}
		
		System.out.println();
		System.out.println("	PROJECTILE TABLE");
		System.out.println("----------------------------------");
		
		// This for loop displays the degrees.
		for (int i = 0; i < angleLength; i++) {
			System.out.print("        " + angle[i] + " deg	");
		}
		
		System.out.println();
		System.out.println();
		
		/* 	-This for loop displays the speeds (m/s), and the 2D array with all of its data.
			-DecimalFormat (df.format) is used to limit the numbers to two decimal places.
		 	-The values in the 90 deg column of set #1 are showing up as 0.00, because the real
		 	 numbers, in non scientific e-notation are virtually zero. */
		for (int i = 0; i < trajectoryTable.length; i++) {
			System.out.print(speed[i] + "m/s	");
			for (int j = 0; j < trajectoryTable[i].length; j++) {
				System.out.print(df.format(trajectoryTable[i][j]) + "		");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		System.out.println("BEST TRAJECTORY VALUES:");
		System.out.println("Minimum Distance: " + minDist + " Maximum Distance: " + maxDist);
		
		//	This for loop displays the speed and angle combinations that work best to hit the target between the minimum and maximum distances.
		//	The boolean checker is used to keep track of whether there are viable ways to hit the target. If not, a message is displayed.
		boolean checker = false;
		for (int i = 0; i < trajectoryTable.length; i++) {
			for (int j = 0; j < trajectoryTable[i].length; j++) {
				trajectoryTable[i][j] = ((Math.pow(speed[i], 2)) * Math.sin(Math.toRadians(angle[j]) * 2)) / 9.8;
				
				if (trajectoryTable[i][j] > minDist && trajectoryTable[i][j] < maxDist) {	// The if statement checks if the calculated number is between minimum and maximum distances.
					System.out.print("[" + speed[i] + "m/s, " + angle[j] + "deg] ");
					checker = true;
				}
			}
		}
		if (!checker) {
			System.out.println("There are no viable ways to hit the target.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	
	}
}
