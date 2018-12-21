/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * MrCoxallStack class
 *
 ****************************************************************************/

import java.util.ArrayList;

public class MrCoxallStack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	private static String update = "";
	
	public void print() {
		//prints entire stack
		System.out.println("\nStack: " + stackArray);
	}
	
	public String push(int value) {
		//adds value to stack
		stackArray.add(value);
		update = "Value was added.";
		return update;
	}
}
