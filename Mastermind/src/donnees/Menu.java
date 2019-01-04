package donnees;

import metier.*;

public class Menu 
{	
	protected Integer count = new Integer(10);
	final int ESSAIE = 10;
	
	public Menu()
	{
		System.out.println("Bienvenue sur le Mastermind");
		System.out.println("Les chiffres entre 0 et 6 (inclus) correspondent aux 7 couleurs du jeu");
		Metier M = new Metier();
	}
}
