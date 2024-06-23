/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  JavaFX Application
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

/**
 * Controller class for the Main.fxml FXML file.
 */
public class MainController implements Initializable {

	final MyNumber myNum = new MyNumber();

	@FXML
	private Label lblStatus;

	@FXML
	private ProgressBar pb;

	@FXML
	private ProgressIndicator pi;

	/**
	 * Initializes the controller class.
	 * 
	 * @param location  The location used to resolve relative paths for the root
	 *                  object.
	 * @param resources The resources used to localize the root object.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		myNum.setNumber(0);
		myNum.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				lblStatus.setText(new BigDecimal(myNum.getNumber()).toString());
				pb.progressProperty().bind(myNum.numberProperty());
				pi.progressProperty().bind(myNum.numberProperty());
			}
		});
	}

	/**
	 * Handles button click event.
	 * 
	 * @param event The ActionEvent triggered by the button click.
	 */
	@FXML
	public void BtnClick(ActionEvent event) {
		myNum.setNumber(myNum.getNumber() + 0.1);
	}

	/**
	 * Handles second button click event.
	 * 
	 * @param event The ActionEvent triggered by the second button click.
	 */
	@FXML
	public void Btn2Click(ActionEvent event) {
		myNum.setNumber(myNum.getNumber() - 0.1);
	}
}
