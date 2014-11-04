package org.minazou67.sample.ee6.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/welcome")
public class WelcomeResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcome() {
		return "welcome";
	}
}