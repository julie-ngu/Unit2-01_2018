/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * comment
 *
 ****************************************************************************/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//gets input from user for stack
		Stack userStack = new Stack();
		
		System.out.print("Enter a number:\n");
		
		Scanner userInput = new Scanner(System.in);
		int userNum = userInput.nextInt();
		
		userStack.push(userNum);
		//System.out.println(userNum);	
	}
}