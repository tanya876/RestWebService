package com.niit.lunatics.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
			public String sayPlainTextHello()
			{
		return "hello jersey plain";
			}
	@GET
	@Path("/xmlhello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayXMLHello()
	{
		return "<?xml version=\"1.0\"?>"+"<hello>Hello jersey"+"</hello>";
	}
	
	@GET
	@Path("/htmlhello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHTMLHello()
	{
		return "<HTML>"+"<TITLE>"+"HELLO JERSEY"+"</TITLE>"+"</BODY><H1>"+"HELLO JERSEY HTML"+"</H1></BODY>"+"</HTML>";
	}
}
