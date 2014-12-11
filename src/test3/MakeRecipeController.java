package test3;

import MealPlanner.Recipe;
import javafx.fxml.FXML;
import javafx.scene.control.Dialogs;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import ch.makery.address.model.Person;
//import ch.makery.address.util.CalendarUtil;

/**
 * Dialog to edit details of a person.
 * 
 * @author 
 */
public class MakeRecipeController {
	
    
	@FXML
        private TextField recipeTitle;
        
        @FXML
        private TextField ingridientTitle;
        @FXML
        private TextField quantity;
        @FXML
        private ListView ingrideintList;
        @FXML
        private TextArea directions;
        
	private Stage dialogStage;
	
	private boolean okClicked = false;
	
        private Recipe recipe;
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		
	}
	
        
        
	/**
	 * Sets the stage of this dialog.
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
        public void addIngredient(){
            
        }
        
	/**
	 * Sets the person to be edited in the dialog.
	 * 
	 * @param recipe
	 */
	public void setRecipe(Recipe recipe) {
            
            this.recipe = recipe;
            
//		this.person = person;
//		
//		firstNameField.setText(person.getFirstName());
//		lastNameField.setText(person.getLastName());
//		streetField.setText(person.getStreet());
//		postalCodeField.setText(Integer.toString(person.getPostalCode()));
//		cityField.setText(person.getCity());
//		birthdayField.setText(CalendarUtil.format(person.getBirthday()));
//		birthdayField.setPromptText("yyyy-mm-dd");
	}
	
	/**
	 * Returns true if the user clicked OK, false otherwise.
	 * @return
	 */
	public boolean isOkClicked() {
		return okClicked;
	}
	
	/**
	 * Called when the user clicks ok.
	 */
	@FXML
	private void handleOk() {
            
//		if (isInputValid()) {
//			person.setFirstName(firstNameField.getText());
//			person.setLastName(lastNameField.getText());
//			person.setStreet(streetField.getText());
//			person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
//			person.setCity(cityField.getText());
//			person.setBirthday(CalendarUtil.parse(birthdayField.getText()));
//			
			okClicked = true;
			dialogStage.close();
//		}
	}
//	
	/**
	 * Called when the user clicks cancel.
	 */
	@FXML
	private void handleCancel() {
		dialogStage.close();
	}
	
	/**
	 * Validates the user input in the text fields.
	 * 
	 * @return true if the input is valid
	 */
	private boolean isInputValid() {
//		String errorMessage = "";
//
//		if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
//			errorMessage += "No valid first name!\n"; 
//		}
//		if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
//			errorMessage += "No valid last name!\n"; 
//		}
//		if (streetField.getText() == null || streetField.getText().length() == 0) {
//			errorMessage += "No valid street!\n"; 
//		}
//		
//		if (postalCodeField.getText() == null || postalCodeField.getText().length() == 0) {
//			errorMessage += "No valid postal code!\n"; 
//		} else {
//			// try to parse the postal code into an int
//			try {
//				Integer.parseInt(postalCodeField.getText());
//			} catch (NumberFormatException e) {
//				errorMessage += "No valid postal code (must be an integer)!\n"; 
//			}
//		}
//		
//		if (cityField.getText() == null || cityField.getText().length() == 0) {
//			errorMessage += "No valid city!\n"; 
//		}
//		
//		if (birthdayField.getText() == null || birthdayField.getText().length() == 0) {
//			errorMessage += "No valid birthday!\n";
////		} else {
////			if (!CalendarUtil.validString(birthdayField.getText())) {
////				errorMessage += "No valid birthday. Use the format yyyy-mm-dd!\n";
////			}
//		}
//		
//		if (errorMessage.length() == 0) {
//			return true;
//		} else {
//			// Show the error message
//			Dialogs.showErrorDialog(dialogStage, errorMessage,
//					"Please correct invalid fields", "Invalid Fields");
//			return false;
//		}
	return false;
        }
}

