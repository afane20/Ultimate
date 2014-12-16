

package test3;

import MealPlanner.FileManager;
import MealPlanner.Ingredient;
import MealPlanner.Property;
import MealPlanner.Recipe;
import MealPlanner.Schedule;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;




/**
 * FXML Controller class
 *
 * @author Salvador E. Afane, Ahslie Horst, Paul O'Neil
 */
public class Screen1Controller implements Initializable, ControlledScreen {

    ScreensController myController;

    MealManager mealManager = MealManager.getInstance();
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Property prop = new Property();
        String file = prop.getFile();
        Schedule s = Schedule.getInstance();
        FileManager fm = new FileManager();
        fm.readXmlFile(s, file);
        
        for (Recipe recipe : s.getRecipeList()){
            // Add to roate list
            s.getRotateList().add(recipe);
        }
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    

    @FXML
    private void goToScreen2(ActionEvent event){
       myController.setScreen(ScreensFramework.screen2ID);
    }
    
    
    @FXML
    private void goToScreen3(ActionEvent event){
       myController.setScreen(ScreensFramework.screen3ID);
    }
    
    @FXML
    private void goToScreen4(ActionEvent event){
       myController.setScreen(ScreensFramework.screen4ID);
    }
    
     @FXML
    private void goToScreen5(ActionEvent event){
       myController.setScreen(ScreensFramework.screen5ID);
    }
    @FXML
    private Label label2;
    
    public void button1(ActionEvent event){
       // label1.setText("something");
        //tab1.
        label2.setText("Well something should change");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }
    
    public void button2(ActionEvent event){
        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
         System.out.println("Your name: " + result.get());
        }
        // The Java 8 way to get the response value (with lambda expression).
        result.ifPresent(name -> System.out.println("Your name: " + name));
    }
  
    public final void displayToTextArea() {
        Schedule s = Schedule.getInstance();
        
        String ingList = "Ingredients: \n";
        Recipe todaysMeal = s.iterateThruSchedule();
        for (Ingredient ing : todaysMeal.getIngredientList()) {
            ingList += Double.toString(ing.getNumber()) + " " + ing.getType() + " " + ing.getName() + "\n";
        }
       // textarea.setText(todaysMeal.getTitle());
    }
}
