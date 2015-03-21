package simplegame.gui;

import javax.swing.JFrame;

public class PantallaPrincipal
{
	public static void main(String[] args) {
		JFrame pantallaPrincipal = new JFrame("Mini Tennis");
		pantallaPrincipal.setSize(300, 300);
		pantallaPrincipal.setVisible(true);
		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
