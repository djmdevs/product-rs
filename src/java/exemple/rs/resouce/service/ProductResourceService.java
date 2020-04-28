/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple.rs.resouce.service;

import exemple.rs.entity.Product;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author uarota
 */
public interface ProductResourceService {
     @GET
     @Path("/{id}/xml")
     @Produces(MediaType.APPLICATION_XML)
     Product getProductAsXML(@PathParam("id") Long id);
     
     @GET
     @Path("/{id}/json")
     @Produces(MediaType.APPLICATION_JSON)
     Product getProductAsJSON(@PathParam("id") Long id);
     
     @POST
     @Consumes(MediaType.APPLICATION_XML)
     void storeFromXML(Product p);
     
     @POST
     @Consumes(MediaType.APPLICATION_JSON)
     void storeFromJSON(Product p);
     
     @GET
     @Path("/list/xml")
     @Produces(MediaType.APPLICATION_XML)
     List<Product> getProductsXML();
             
}
