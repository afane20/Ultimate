/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MealPlanner.FileManager;
import MealPlanner.Ingredient;
import MealPlanner.Property;
import MealPlanner.Recipe;
import MealPlanner.Schedule;
import MealPlanner.ShoppingList;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

/**
 *
 * @author paul
 */
public class ScheduleTester {
    
    Schedule s = new Schedule();
    // Error Now that shoppingList is private, I need to get it some other way
    ShoppingList shoppingList = new ShoppingList();
    FileManager files = new FileManager();
    Property prop = new Property();
        
    public ScheduleTester() {
    }

    
    public void recipeTest() {
        Recipe spag = new Recipe();
        spag.setTitle("1");
        s.getRecipeList().add(spag);
        
        Recipe food1 = new Recipe();
        food1.setTitle("2");
        s.getRecipeList().add(food1);
        
        Recipe food2 = new Recipe();
        food2.setTitle("3");
        s.getRecipeList().add(food2);
        
        Recipe food3 = new Recipe();
        food3.setTitle("4");
        s.getRecipeList().add(food3);
        
        Recipe food4 = new Recipe();
        food4.setTitle("5");
        s.getRecipeList().add(food4);
        
        Recipe food5 = new Recipe();
        food5.setTitle("6");
        s.getRecipeList().add(food5);
        
//        Recipe food6 = new Recipe();
//        food6.setTitle("7");
//        s.getRecipeList().add(food6);
        
//        Recipe food7 = new Recipe();
//        food7.setTitle("8");
//        s.getRecipeList().add(food7);
    }
    
    @Test
    public void rotateRecipeListTest(){
        // Make your test recipies
        //recipeTest();
        String file = prop.getFile(); 
        files.readXmlFile(s, file);
        shoppingList.displayShoppingList();

        // Make sure that the recipe list works (it does)
        for (Recipe recipe : s.getRecipeList()){
            // Add to roate list
            s.getRotateList().add(recipe);
            System.out.println("Recipe: " + recipe.getTitle());
        }
        
        // Make sure that the rotate list works (it does)
        for (Recipe rotate : s.getRotateList()) {
            System.out.println("Rotate: " + rotate.getTitle());
        }
            
        // Now assign your schedule list
        s.rotateRecipes();
        
        // Make sure that your schedule list works 
        //   with proper rotations (it does!!!)
        for (Recipe schedule : s.getWeekList()) {
            System.out.println("Schedule: " + schedule.getDirections());
        }
        /*
        for (int i = 0; i < s.getRotateList().size(); i++) {
            if (i == 1) 
            s.getRotateList().remove(i);
        }
        
         for (Recipe recipe : s.getRecipeList()){
            // Add to roate list
           // s.getRotateList().add(recipe);
            System.out.println("Recipe2: " + recipe.getTitle());
        }
        
        // Make sure that the rotate list works (it does)
        for (Recipe rotate : s.getRotateList()) {
            System.out.println("Rotate2: " + rotate.getTitle());
        }
           
        // Now assign your schedule list
        s.rotateRecipes();
        
        for (Recipe schedule : s.getWeekList()) {
            System.out.println("Schedule2: " + schedule.getDirections());
        }
        */
        /*s.makeWeekIngredient();
        
        // Ingredient list before the merge
        for (Ingredient ing1 : s.getWeekIngredientList()) {
            System.out.println("Ingredients before: " + ing1.getName());         
        }
        
        shoppingList.searchIngredientList(s);
        
        // Ingredient list after the merge
        for (Ingredient ing1 : shoppingList.getShoppingList()) {
            System.out.println("Ingredients after: " + ing1.getName() + " " + ing1.getNumber()); 
            
        } 
        
        for (Ingredient ing1 : s.getWeekIngredientList()) {
            System.out.println("Ingredients before2: " + ing1.getName() + " " + ing1.getNumber());         
        }*/
        
        Document xml = null;
        xml = files.buildXmlDocument(s);
        files.saveXmlDocument(xml, file);
        // This, however does not work
        //Assert.assertNotEquals(s.iterateThruSchedule(), null);          
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
