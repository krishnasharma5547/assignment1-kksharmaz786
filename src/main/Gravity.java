/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
		static double g=9.8;
		public static double calculateSpeed(double time ){
			double speed;
			speed= g*time;
			return speed ;
		}
		public static double calculateDistance(double time){
			double distance = 0.5 * g * time*time;
			return distance;
		}
		public static void main(String[] args) {
			double time;
			Scanner sc = new Scanner(System.in);
			time=sc.nextDouble();
			double d = calculateDistance(time);
			double s = calculateSpeed(time);
			System.out.println("The speed of the object at "+ time +" seconds after its release is " + s + " and the distance the object has travelled in the "+ time+ " seconds after the relase is "+ d);
		}
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
