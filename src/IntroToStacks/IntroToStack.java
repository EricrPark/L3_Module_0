package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			stack.push(Math.random()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String userInput = JOptionPane.showInputDialog("Please enter a number between 0 and 100 inclusive");
		String userInput2 = JOptionPane.showInputDialog("Please enter another number between 0 and 100 inclusive");
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		Double valueInput = Double.parseDouble(userInput);
		Double valueInput2 = Double.parseDouble(userInput2);
		System.out.println("Example");
		System.out.println("NUM 1: " + valueInput);
		System.out.println("NUM 2: " + valueInput2);
		System.out.println("Popping elements off stack...");
		while(!stack.empty()) {
			Double popped = stack.pop();
			if(valueInput > popped) {
				if(valueInput2 < popped) {
					System.out.println(popped);
				}
			}
			else if(valueInput < popped) {
				if(valueInput2 > popped) {
					System.out.println(popped);
				}
			}
			
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
