
public class AssignmentJava {

	public static void main(String[] args) {
		/*
		 * Question 1: What does this error mean in Java ‘variable cannot be resolved’?
		 * Show with example how it can be resolved.
		 *
		 * Answer: When a variable is declared and assigned a value after
		 * initialization. The output will result in an error message, ‘variable cannot
		 * be resolved’. So, it is important to declare a variable first before
		 * initializing it. However, once the variable is declared, it can be assigned a
		 * new value. It will update the value when assigned a second time.
		 */
		// System.out.println(int num = 10);
		// Correct way-
		int num = 10;
		num = 11;
		System.out.println(num);

		/*
		 * Question 2: Can we have 2 variables of the same name and type in a class? If
		 * not, please explain why. Write the error that you will get, if any.
		 * 
		 * Answer: Two Variables cannot be of the same name. Type can be the same unless
		 * declared different names. Same values can be assigned to different variables
		 */

		// String name = "HO HO HO : I am Santa";
		// String name = "HO HO HO : I am Santa";

		// Correct way:
		String name = "HO HO HO : I a	m Santa.";
		String name1 = "HO HO HO : I am Santa";
		System.out.println(name + " " +name1);

		/*
		 * Question 3: What is debug mode in Eclipse? How to use Debug mode? 
		 * Answer:
		 * Debug mode is a way of executing a code line by line. It is used to know the
		 * output of any line in a code at any time without executing the whole program.
		 * Code compilation errors are also shown, if there is a coding mistake.
		 *
		 * To run Debugger in Eclipse - Double click to put a mark in front of a line
		 * that is to be debugged Goto Run in the top navigation bar- click debug. When
		 * in Debug mode - Click step over (↴) in the navigation toolbar. The marked
		 * line code will be executed and output will be shown in the console.
		 * 
		 */
		
		/*
		 * Question 4: Explain use of refactor in eclipse.
		 *Answer: Refactoring is the method of changing the body of a code by altering the internal structure of a code and without altering the outer structure.
		 *Some alternation with Refactoring:
		 *Renaming: Name of any Class, Project, Variable and Methods can be changed.
		 *Right-click on the element that needs to be changed.
		 *Click on Refactoring and follow the steps.
		 *Move: ProjectClass can be moved from one project to the other by using the ‘move’ option in refactoring.  
		 *Methods are also possible to move from one class to another.
		 *Extract Interface
		 *Extract Superclass
		 *Use supertype where possible
		 *Pull up
		 *Pull down
		 *Extract Class
		 */
		
		
		/*
		 * Question 5: Resultant of an operation that included int data type can be saved in what kind of other variables? 
		 * Please explain with an example.
		 *Answer:Resultant of an operation can also be stored in double and float.
		 */
		int amount = 20;
		double amount2 = amount;
		float amount3 = amount;
		
		int cash = 10;
		float cash1 = 10.2f;
			
		System.out.println(amount + " " + amount2 + " " + amount3);
		System.out.println("Sum of amount and cash1: "+ (amount + cash1));
		System.out.println("multiplication of amount and cash1: "+ (amount * cash1));
		System.out.println("Simple division of amount and cash1: "+ (amount / cash1));
		
		
		
	}

}
