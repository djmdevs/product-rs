/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple.rs.resource;

import exemple.rs.entity.Product;
import exemple.rs.resouce.service.ProductResourceService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Danilo Jo
 */
@Path("/Product")
public class ProductResource implements ProductResourceService{

    @Override
    public Product getProductAsJSON(Long id) {
       return this.genereteFalseProduct(id);
    }

     @Override
     @GET
     @Path("/{id}/xml")
     @Produces(MediaType.APPLICATION_XML)
    public Product getProductAsXML(@PathParam("id") Long id) {
        return this.genereteFalseProduct(id);
    }

    @Override
    public void storeFromJSON(Product p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void storeFromXML(Product p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ProductResource() {
    }
    
    private Product genereteFalseProduct(Long id){
       
        Product p = new Product();
        p.setId(id);
        p.setName("PRODUCT-"+id);
        p.setPrice(50.0*id);
        
        return p;
    }

    @Override
    public List<Product> getProductsXML() {
        List<Product> prdts = new java.util.ArrayList();
        for(int i=2;i<10;i++){
            prdts.add(this.genereteFalseProduct((long)i));
        }
        return prdts;
    }
    
    
    
}
