package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(urlPatterns = "/book" )
public class BookServlet extends HttpServlet {
	
	
public BookServlet() {
	
	System.out.println("Constructor from BookServlet");
}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
    TaxiService service = new TaxiServiceImpl();
    TaxiDto dto =service.bookTaxi();
   
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		System.out.println(dto);
		
		    if(dto!=null) {
		    	
		    writer.print("Taxi Booked Successfully");	
			
			writer.print(dto.getId());
			writer.print(dto.getTaxiNo());
			writer.print(dto.getLocation());
			
			
		}else {
			writer.print("Taxi is not booked");
		}

}
}
