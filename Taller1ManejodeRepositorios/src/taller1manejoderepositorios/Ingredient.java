/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1manejoderepositorios;

/**
 *
 * @author Home
 */
public class Ingredient {
    private String name;
    private Integer quantity;
    public  Ingredient(String name,Integer quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }  
}
