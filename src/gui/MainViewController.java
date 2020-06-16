package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	//Alert alert = new Alert(AlertType.INFORMATION);
	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;

	@FXML
	private MenuItem menuItemSobre;

	@FXML
	public void onMenuItemVendedor() {
		System.out.println("Menu Vendedor clicado!");
	}

	@FXML
	public void onMenuItemDepartamento() {
		System.out.println("Menu Departamento clicado!");
	}

	@FXML
	public void onMenuItemSobre() {
		System.out.println("Menu Sobre clicado!");
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
