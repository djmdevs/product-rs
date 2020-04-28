/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple.rs.client;

import com.sun.security.sasl.ClientFactoryImpl;
import com.sun.xml.ws.security.policy.Target;
import exemple.rs.entity.Product;
import java.io.IOException;
import javax.jms.ConnectionFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author uarota
 */
public class TestResource {
    public  static void main(String args[]) throws IOException{
        //creating a client from builder
        final Client client = ClientBuilder.newClient();
        final WebTarget product = client.target("http://localhost:8080/product-rs/webresources").path("/Product/Product/4/xml");
        
        //post the message
        product.request("text/xml").post(Entity.xml(new Product()));
        
        System.err.println("Message Product Posted");
        System.in.read();
        
        Product p = product.request("text/xml").get(Product.class);
        System.err.println("Message Product Posted");
        
    }
}
