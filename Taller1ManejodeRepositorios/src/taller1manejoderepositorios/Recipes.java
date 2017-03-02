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
import dao.Step;
import dao.Recipe;
import java.util.ArrayList;

public class Recipes {
      public ArrayList<Recipe> recipes = new ArrayList<Recipe>();

      public  void loadDefaultRecipes()
    {
        this.recipes = new ArrayList<Recipe>();
        recipes.add(new Recipe(1,"pizza",2));
        recipes.get(0).setIngredient(new Ingredient("Pollo",4));
        recipes.get(0).setIngredient(new Ingredient("Pan",2));
        recipes.get(0).setIngredient(new Ingredient("Lechuga",1));
        recipes.get(0).setIngredient(new Ingredient("Ajonjoli",3));
        recipes.get(0).setIngredient(new Ingredient("Camos",8));
        recipes.get(0).setStep(new Step(1,"Revolcer el pollo"));
        recipes.get(0).setStep(new Step(2,"añadir la lechuga"));
        recipes.get(0).setStep(new Step(3,"Moler el ajonjoli"));
        recipes.add(new Recipe(2,"ajiaco",2));
        recipes.get(1).setIngredient(new Ingredient("alcaparras",4));
        recipes.get(1).setIngredient(new Ingredient("Pan",2));
        recipes.get(1).setIngredient(new Ingredient("Mazorca",1));
        recipes.get(1).setIngredient(new Ingredient("papa",3));
        recipes.get(1).setIngredient(new Ingredient("Lenteja",8));
        recipes.get(1).setStep(new Step(1,"Revolcer las alcaparras"));
        recipes.get(1).setStep(new Step(2,"desgranar la mazorca"));
        recipes.get(1).setStep(new Step(3,"Cocinar la lenteja"));
        
    }
      public Recipe seek(String name)
      {
         for(Recipe e:this.recipes)
         {
             if(name.equals(e.getName())){
                System.out.println("Recipe ID: " + e.getiD());
                return e;
             }
             
         }
         return null;
      }
      
      public Recipe seek_name_time(String input){
          for(Recipe e : this.recipes){ 
            if(input.toLowerCase().equals(e.getName().toLowerCase())){
                return e;
            }
            if(input.equals(String.valueOf(e.getDuration()))){
                return e;
            }
          }
          return null;
      }
}
