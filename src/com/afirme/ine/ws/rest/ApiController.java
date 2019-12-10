package com.afirme.ine.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
public class ApiController {

	@Path("test")
	@GET @Produces(MediaType.APPLICATION_JSON)
	public String testWS(){
		return "WebServices working...";
	}
}
