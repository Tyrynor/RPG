package ihm;

import javax.swing.JFrame;

import constantes.Constantes;
import entitees.Joueur;

/**
 * 
 * @author Tyrynor, 22/07/2018
 *
 */
public class Fenetre extends JFrame {
	

	public Fenetre() {
		super(Constantes.IHM_NOM_FENTRE);
		this.setSize(Constantes.IHM_TAILLE_FENETRE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PrincipalPane());
		this.setUndecorated(true);
		this.setVisible(true);
	}
	
}
