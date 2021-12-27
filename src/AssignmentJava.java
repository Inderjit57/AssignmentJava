
public class AssignmentJava {

	public static void main(String[] args) {
		/*
		 * Question 1: What does this error mean in Java ‘variable cannot be resolved’?
		 * Show with example how it can be resolved.
		 *
		 * Answer: When a variable is declared and assigned a value after execution. The
		 * output will result in an error message, ‘variable cannot be resolved’. So, it
		 * is important to declare a variable first before initializing it. However,
		 * once the variable is declared, it can be assigned a new value. It will update
		 * the value when assigned a second time.
		 */
		System.out.println(int num = 10);
		
		// Correct way-
		//int num = 10;
		//num = 11;
		//System.out.println(num);

		/*
		 * Question 2: Can we have 2 variables of the same name and type in a class? If
		 * not, please explain why. Write the error that you will get, if any.
		 * 
		 * Answer: Two Variables cannot be of the same name. Type can be the same unless
		 * declared different names. Same values can be assigned to different variables
		 */

		String name = "HO HO HO : I am Santa";
		String name = "HO HO HO : I am Santa";

		// Correct way:
		//String name = "HO HO HO : I a	m Santa.";
		//String name1 = "HO HO HO : I am Santa";
		System.out.println(name + " " + name1);

		/*
		 * Question 3: What is debug mode in Eclipse? How to use Debug mode? Answer:
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
		 * Question 4: Explain use of refactor in eclipse. Answer: Refactoring is the
		 * method of changing the body of a code by altering the internal structure of a
		 * code and without altering the outer structure. Some alternation with
		 * Refactoring: Renaming: Name of any Class, Project, Variable and Methods can
		 * be changed. Right-click on the element that needs to be changed. Click on
		 * Refactoring and follow the steps. Move: ProjectClass can be moved from one
		 * project to the other by using the ‘move’ option in refactoring. Methods are
		 * also possible to move from one class to another. Extract Interface Extract
		 * Superclass Use supertype where possible Pull up Pull down Extract Class
		 */

		/*
		 * Question 5: Resultant of an operation that included int data type can be
		 * saved in what kind of other variables? Please explain with an example.
		 * Answer:Resultant of an operation can also be stored in double and float.
		 */
		int amount = 20;
		double amount2 = amount;
		float amount3 = amount;

		int cash = 10;
		float cash1 = 10.2f;

		System.out.println(amount + " " + amount2 + " " + amount3);
		System.out.println("Sum of amount and cash1: " + (amount + cash1));
		System.out.println("multiplication of amount and cash1: " + (amount * cash1));
		System.out.println("Simple division of amount and cash1: " + (amount / cash1));

		/*
		 * Question 6: Can one variable be used to initialise another variable? If yes,
		 * under what conditions this is possible, please explain with an example.
		 * Answer: Yes, a variable can be initialized by another variable. Once the
		 * variable is declared, it can be assigned a new value. It will update the
		 * value when assigned a second time.
		 */

		String condition, fact, style;
		condition = fact = style = "Elephant walk slowly";
		fact = "They are taller than aliens";

		System.out.println(fact);
		System.out.println(condition);
		System.out.println(style);

		/*
		 * Question 7: What do you understand by compile time and run time in java.
		 * Answer: Compile time- Compile time is when a source code written is converted
		 * to a byte code for the computer to understand. Source code is converted to
		 * byte code; .java to .class input = source code, dependent file, libraries are
		 * required for compilation Output = Compiled code or error messages occurred
		 * during compilation.
		 *
		 * Runtime = When a program is in runtime, it's under execution after an
		 * unsuccessful or successful code is written.
		 */
		
		/*
		 * Question 8: What Are Curly Braces in Java?
		 *Answer:Curly braces act as a starting and end point in Java code writing. 
		 *It is also used to define a scope, methods, conditions. 
		 *With braces multiple statements can be grouped in a single block. 
		 *Instead of using curly braces for every statement, which is also right, one curly brace can be used. 
		 */
		
		int number = 10;
		
		if (number == 10) {
			System.out.println("it is equal to 10");
		}
		{
			System.out.println("Type in more numbers");
		}
		
		//OR
		
		if (number >= 10) {
			System.out.println("it is equal to 10 or greater");
			System.out.println("Type in more greater numbers");
		}
		
		/*
		 *Question 9: What do you understand about Syntax error in java? Give at least 5 examples of it.
		 *Answer:Syntax error are the one which cause the program to stop due to a mistake in a syntax; missing semicolons, missing brackets, value is not assigned properly to a variable. 
		 *A compiler will tell the error in the console while compiling the code line by line. 
		 *It will show the exact location of the mistake and a corrective action.
		 */
		
		// Example 1: Decalared variable with capital letter and called with small letter.
		int x = 40, y = 60;
		  
        // Declared variable Sum with Capital S
        int Sum = x + y;
  
        // Trying to call variable Sum with a small s ie. sum
        System.out.println("Sum of variables is " + sum);
		 
        //Example 2: Missing semicolon
        
        String weather = "Rainy"		// Missing Semicolon
        
        		System.out.println(weather);
        		
        //Example 3: Missing Parenthesis
        	double degreesOutside = 75.4;
        	float degreesInside = 70.1f;
        	
        	if (degreeOutside >= 73			//Missing Parenthesis
        	System.out.println("Its hot outside. Turn on the AC Please");
        	
        	else if (degreesInside <= 70)
        		System.out.println("Its Cold inside. Please turn on the Heating";		// Missing Parenthesis
        	
        //Example 4: DataType is not declared right
        	Int a = 10;
        	Float b = 11.2;
        	System.out.println("sum of two numbers:" + (a+b));
        	
        //Example 5: Variable value is not assigned as per Datatype:
        	float number4 = 15;			//float variable ends with f
        	
        	System.out.println(number4);
        
        // Example 6: when one forward / is missing from a comment
        	
        	char symbol = 'A';			/it is an alphabet
        			System.out.println(symbol);
        	
        /*
         * Question 10: What is local repo and remote git repo?
         *Answer: 
         *Local Repository																	Remote Repository
         *It’s a repo that is stored on individuals computer. Example; Git Bash			It’s a repo that is stored on a remote server or computer. Example: Git Hub
         *All the changes in a code are saved first using a local repository. 			It is used by a team/company on which everyone pushes their code after the successful compilation. Code is pushed using local repository

         *Steps to push code from Local to Remote Repo:	
         *When the code has finished successful compilation,
         *1.	First thing is to make sure the local repo is tracking the source code file (git init). 
         *2.	Then check the status (git status)
         *3.	It is then added (git add src<location> to a staging area 
         *4.	From there it commits (git commit -m”<concise explanation>”) the changes to a local repository. This can be done even when the internet is disconnected.
         *5.	After the final confirmation of a completed code, push (git push) the changes from local repository to the remote repository. This copies the changes from .git folder on the local computer to .git folder on the remote computer. 
         *All the changes are then visible to people who have access to the remote repository. 
         *They can pull the changes from the remote repository to their local repository and then integrate the changes into their workspaces.
         *In similar way the codes can be pulled from the remote repository to the local repository and then integrate the changes into the workspace.
         */
        	
        /*
         * Question 11: What is the meaning of ‘push’ in git?
         *Answer: Push command is used to send the completed code from workspace to local repo to remote repo. 
         *All the changes are then visible to a person with the access to remote repo branch.
         */
        	
        /*
         * Question 12: Under what condition should we initialize a git repo?
         *Answer:  To initialize git repository, git init command is used. 
         *This creates a local directory for the code to track and store all the changes made. 
         *The command is only run once during the code developing cycle
         */
        	
        /*
         * Question 13: How can you confirm if a local repo is connected to a remote repo or not?
         *Answer: Command which is used to confirm the connection between a local and remote repo: 	git remote or git remote -vv. 
         *Note: if there are no remote repo connected then it shows nothing
         *To connect local to remote repo:
         *Copy and paste the command from the remote repository in local repository and press enter.
         */
	}

}
