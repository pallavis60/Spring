package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;



@WebServlet(urlPatterns = "/save")
public class TaxiSaveServlet extends HttpServlet {
	
	public TaxiSaveServlet() {
		System.out.println("Constructor of TaxiSaveServlet ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		
	String id = req.getParameter("id")	;
	String  taxiNo =	req.getParameter("taxiNo");
	String earnings = req.getParameter("earnings");
	String isAvailable = req.getParameter("isAvailable");
	String location = req.getParameter("location");
	String trips = req.getParameter("trips");
	
	
	TaxiDto dto = new TaxiDto(Integer.valueOf(id),Integer.valueOf(taxiNo),Integer.valueOf(earnings),Boolean.valueOf(isAvailable),location,trips);
	
	TaxiService service = new TaxiServiceImpl();
	
	boolean save =service.saveTaxi(dto);
	if(save==true) {
		
		if(save==true) {
			req.getRequestDispatcher("/TaxiReader.jsp").forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.print("Data not valid so not saved");
			req.getRequestDispatcher("/Taxi.jsp").include(req, resp);
		}
		
		
	}
	}

}




