package org.minazou67.sample.ee6.cdi;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path(value="/cdi")
public class SampleResource {

	@Inject
	private SampleService service = null;

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String update(@PathParam("id") long id) {
		service.find(id);
		return "Find! [" + id + "]";
	}
}
