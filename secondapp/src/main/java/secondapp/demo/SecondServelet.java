package secondapp.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServelet  extends HttpServlet
 {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//to read UI data we use HttpServeletRequest reference 
		//getParameter(String) will get value from jsp to java.class
			
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		
		
		System.out.println("--FirstName--"+firstname);
		System.out.println("--LastName--"+lastname);

		//to display as response in client
		resp.getWriter().print("<h1>WELCOME "+firstname+" "+lastname+" "+"to Xworkz</h1>");
		
			
}}
