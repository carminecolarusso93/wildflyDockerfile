package it.unisannio.presentation;

import it.unisannio.application.CurrencyConverterLocal;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Servlet implementation class ConverterController
 */
@Consumes("application/json")	// Non usato
@Produces("application/json")  	// Non usato
@Path("/ConverterController")	
public class ConverterController {
	
    @EJB
	private CurrencyConverterLocal converter;
    
   
    /**
     * //@see HttpServlet#HttpServlet()
     */
    public ConverterController() {
        super();
    }
    @GET
	public Response getCurrency(@QueryParam("euro") float euro)  {
		try {	   
		   float dollars = converter.convert(euro);
		   return Response.ok().entity(dollars).build();
		} catch (Exception e) { 		
		   return Response.status(500, "Errore sul server").build();
		} 
	
	}

}
