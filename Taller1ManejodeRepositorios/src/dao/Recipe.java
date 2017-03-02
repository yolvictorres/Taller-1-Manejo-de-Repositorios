/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Home
 */
import java.util.ArrayList;
import taller1manejoderepositorios.Ingredient;

public class Recipe {
    private Integer iD;
    private String name;
    private Integer duration;
    public ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    public ArrayList<Step> steps = new ArrayList<Step>();
    public Recipe(Integer iD,String name,Integer duration){
        this.iD = iD;
        this.name = name;
        this.duration = duration;
    }
    
    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    public void setIngredient(Ingredient ingre)  {
         this.ingredients.add(ingre);
    }
    public void setStep(Step step)
    {
        this.steps.add(step);
    }
}
