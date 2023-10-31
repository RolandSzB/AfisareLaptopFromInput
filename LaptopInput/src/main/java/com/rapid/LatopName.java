package com.rapid;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LatopName extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
   
			String laptopBrand = req.getParameter("laptop");
			 int brandLength = laptopBrand.length();
			 
			 if(brandLength % 2 ==0 ) {
				 String r="par";
				 req.setAttribute("isPar", r);
			 } else {
				 String r="impar";
				 req.setAttribute("isPar", r);
			 }
			 
			 
			req.setAttribute("brand", laptopBrand);
			
			req.setAttribute("length", brandLength);
			
	           
			
			req.getRequestDispatcher("numeLaptop.jsp").forward(req, res);
			
		}
}