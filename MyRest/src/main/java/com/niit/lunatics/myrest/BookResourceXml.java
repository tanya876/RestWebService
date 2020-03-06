package com.niit.lunatics.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("Books")
public class BookResourceXml {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Response getAllBooks(@PathParam("id") String bookId) {
		Book book=new Book();
		book.setId(bookId);
		book.setName("harry potter");
		book.setVolumeNumber(1);
		book.setAuthorName("j. k. rowling");
		return Response.status(200).entity(book).build();
	}
	
}
