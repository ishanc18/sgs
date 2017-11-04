package com.app.test;  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
/**
 * This class is for testing whether rest web service is working properly or not.
 * Please put all the test classes in this package.
 * @author Ishan
 *
 */
@Path("/hello")  
public class Hello {     
  // This method is called if HTML is requested  
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public String sayHtmlHello() {  
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
  }  
}   