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
	
	public float process()
	{
		
		float attribute1=(float) 0.0;
		float attribute2=(float) 0.0;
		float result=(float) 0.0;
		String operator="";
		String [] arrayExpression=Expression.split(" ");
		for(int i=0;i<arrayExpression.length;i++)
		{
			terms.push(arrayExpression[i]);
		
		}
		if(!terms.isEmpty())
		{
			operator= (String) terms.pop();
		}
		if(!terms.isEmpty())
		{
			attribute2= Float.valueOf((String) terms.pop()).floatValue();
		}
		if(!terms.isEmpty())
		{
			attribute1=Float.valueOf((String) terms.pop()).floatValue();
		}
		
		if(operator.equals("+"))
		{
			result= attribute1+attribute2;
		}
		
		return result;
		
	
	}
	
	

}
