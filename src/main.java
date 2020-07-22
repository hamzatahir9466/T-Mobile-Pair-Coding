import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		postFixCalculator expTerm= new  postFixCalculator();
		String input="";
		Float result=(float) 0.0;

		 System.out.println("please enter the post fix input string");
		 Scanner myObj = new Scanner(System.in);
		 input= myObj.nextLine();
		 System.out.println("Here is what you entered "+ input);
		 expTerm.setExpression(input);
		 
		 System.out.println("Next we are calling process function");
		 result= expTerm.process();
		 System.out.println("Here is the result "+result);
       
	}

}
