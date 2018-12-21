/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * comment
 *
 ****************************************************************************/

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		//gets input from user for stack
		MrCoxallStack userStack = new MrCoxallStack();
		
		System.out.print("Enter a number:\n");
		
		Scanner userInput = new Scanner(System.in);
		int userNum = userInput.nextInt();
		
		System.out.println(userStack.push(userNum) + userStack.print());
	}
}
