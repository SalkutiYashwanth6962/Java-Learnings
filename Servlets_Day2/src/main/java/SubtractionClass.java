import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SubtractionClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number1=Integer.parseInt(req.getParameter("num1"));
		int number2=Integer.parseInt(req.getParameter("num2"));
		int number3=Integer.parseInt(req.getParameter("num3"));
		int result=number1-number2-number3;
		
		if(result%2==0) {
			PrintWriter printWriter= res.getWriter();
			printWriter.print(result+"is even");	
		}
		
		PrintWriter printWriter= res.getWriter();
		printWriter.print("the subtraction of three numbers:"+result);
		
	}
  
}
