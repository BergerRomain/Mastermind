package donnees;

import metier.*;

public class Menu 
{
	protected Integer count = new Integer(10);
	final int ESSAIE = 10;
	
	public Menu()
	{
		System.out.println("Bienvenue sur le Mastermind");
        for(int j=0 ; j<ESSAIE ; j++)
        {	
    		System.out.println("Il vous reste "+(count)+" essaies");
    		Joueur J = new Joueur();
        	count = new Integer(count.intValue() - 1);
        }
	}
}
