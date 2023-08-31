package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;


@WebServlet(urlPatterns = "/read")
public class ReadServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		
		TaxiService service = new TaxiServiceImpl();
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
	  List<TaxiDto> dto =	service.findByAvailableStatus(true);
  	
	for(TaxiDto li :dto) {
		
		writer.print("<div>   ");
		writer.println("<td>");
		writer.println("<tr>");
		writer.println("<td>");
		writer.print(li.getId());
		writer.println("</tr>");
		writer.println("</td>");
		writer.print(li.isAvailable());
		writer.print(li.getEarnings());
		writer.print(li.getLocation());
		writer.print(li.getTaxiNo());
		writer.print("    </div>");
		
		
	}
	
  if(!dto.isEmpty()) {
	  writer.println("<div><form action=book  method=get><button type=submit> BookTaxi <button><form><div>");
	  
  }else {
	  writer.println("Thier is no taxis available");
  }
	
	
	
	} 

}
