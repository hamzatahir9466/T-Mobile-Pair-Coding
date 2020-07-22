import java.util.Stack;

public class postFixCalculator {
	
	private String Expression;
    private Stack terms;
     	
	public postFixCalculator() {
		terms=new Stack();
	}

	public postFixCalculator(String expression) {
		
		Expression = expression;
		terms=new Stack();
	}

	public String getExpression() {
		return Expression;
	}

	public void setExpression(String expression) {
		Expression = expression;
	}
	
	public void process()
	{
		
		String [] arrayExpression=Expression.split(" ");
		for(int i=0;i<arrayExpression.length;i++)
		{
			//System.out.println(arrayExpression[i]);
			
		}
	 /*	for(int i=0;i<Expression.length();i++)
	 	{
	 		System.out.println(Expression.charAt(i));
	 		terms.push(Expression.charAt(i));
	 	}
	 	
	 	
	 	for(int i=0;i<terms.size();i++)
	 	{
	 		System.out.println(terms.pop());
	 	}*/
	}
	
	

}
