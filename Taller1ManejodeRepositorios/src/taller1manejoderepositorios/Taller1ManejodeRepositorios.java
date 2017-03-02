/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1manejoderepositorios;

/**
 *
 * @author
 */
public class Taller1ManejodeRepositorios {

    /**
     * @param args the command line arguments
     */
    public static Recipes recepies = new Recipes();
    

    public static void main(String[] args) {
        // TODO code application logic here
        searchByName window = new searchByName();
        window.setVisible(true);
        window.setTitle("Formulario de Busqueda");
        
        busquedaPorIngrediente ventana=new busquedaPorIngrediente();
        ventana.setVisible(true);
        ventana.setTitle("Busqueda de receta por ingrediente");
        Recipes r=new Recipes();
        System.out.println(r.recipes);   
    }
    
}
