package iut.gon.tp3;

public class GrilleModel {
	
	String[][] tab = new String[][] {
		{new String(" "),new String(" "),new String(" ")},
		{new String(" "),new String(" "),new String(" ")},
		{new String(" "),new String(" "),new String(" ")}
	};
	
	public GrilleModel() {
	}
	
	public String getCase(int l, int c) {
		return tab[l][c];
	}
	
	public void setCase(int l, int c, String text) {
		tab[l][c] = text;
	}
}
