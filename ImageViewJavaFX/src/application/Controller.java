package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	ImageView myImageView;
	@FXML
	Button myButton;

	Image myImage1 = new Image(getClass().getResourceAsStream("Background2.jpg"));

	public void displayImage() {
		myImageView.setImage(myImage1);
	}

}
