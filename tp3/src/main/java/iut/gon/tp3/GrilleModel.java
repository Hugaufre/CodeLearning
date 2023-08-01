package iut.gon.tp3;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class GrilleModel {
	
	SimpleStringProperty[][] tab = new SimpleStringProperty[][] {
		{new SimpleStringProperty(" "),new SimpleStringProperty(" "),new SimpleStringProperty(" ")},
		{new SimpleStringProperty(" "),new SimpleStringProperty(" "),new SimpleStringProperty(" ")},
		{new SimpleStringProperty(" "),new SimpleStringProperty(" "),new SimpleStringProperty(" ")}
	};
	
	public GrilleModel() {
	}
	
	public SimpleStringProperty getCase(int l, int c) {
		return tab[l][c];
	}
	
	public void setCase(int l, int c, String text) {
		tab[l][c].setValue(text);
	}
}
