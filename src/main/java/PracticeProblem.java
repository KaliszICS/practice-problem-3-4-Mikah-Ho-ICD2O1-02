/**
 * File: Nested ifs
 * Author: Mikah Ho
 * Date Created: Mar 26, 2026
 * Date Last Modified: Mar 30, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static int min(int num1, int num2, int num3) {

		if (num1 > num2) {

			if (num2 < num3) {
				return num2;
			}
			return num3;
		}
		else if (num1 < num3) {
			return num1;
		}
		return num3;
	} 

	//q2
	public static boolean isLeapYear(int year) {
		
		if (year % 4 == 0) { //step 1

			if (year % 100 == 0) { //step 2

				if (year % 400 == 0) { // step 3
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
}
				


