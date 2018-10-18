/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * comment
 *
 ****************************************************************************/

import java.util.ArrayList;

public class Stack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	//int top;
		
	public void push(int value) {
		//adds value to stack
		stackArray.add(value);
		//System.out.print(value);
	}
}