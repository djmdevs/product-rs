/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple.rs.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Jo
 */
@XmlRootElement
public class Product {
    private String name;
    private Double price;
    private Long id;

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
