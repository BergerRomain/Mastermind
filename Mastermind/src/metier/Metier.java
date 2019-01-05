package metier;

import java.util.*;
import donnees.Menu;

public class Metier
{
	Scanner sc = new Scanner (System.in);
	final int NB_CHIFFRES = 4;
	final int ESSAIE = 10;
	final int MAX = 6;
	protected Random r = new Random();
	protected Integer count = new Integer(10);
	protected Integer[] Saisie = new Integer[NB_CHIFFRES];
	protected Integer[] solution = new Integer[NB_CHIFFRES];
	private boolean victoire = false;
    private static final char Vrai = 'V';
    private static final char Faux = 'F';
    int menu = Menu.menu;
	
	public Metier()
	{
		System.out.println("Bienvenue sur le Mastermind");
		System.out.println("Les chiffres entre 0 et 6 (inclus) correspondent aux 7 couleurs du jeu");
		solution();
	    for(int j=0 ; j<ESSAIE ; j++)
	    {	
	    	saisie();
	    	comparaison();
		    count = new Integer(count.intValue() - 1);
			System.out.println("Il vous reste "+(count)+" essaies");
			fin();
	    }
	}
	
	public void solution()
	{
        for(int i=0 ; i<NB_CHIFFRES ; i++) 
            solution[i] = r.nextInt(MAX+1);
		if(menu == 2)
        	System.out.println("Solution: "+solution[0]+":"+solution[1]+":"+solution[2]+":"+solution[3]);
	}
	
	public void saisie()
	{
	    for(int i=0 ; i<NB_CHIFFRES ; i++)
	    {
		    Saisie[i] = sc.nextInt();
		    while(Saisie[i] < 0 || Saisie[i] > 6)
		    {
		    	System.out.println("Veuillez entrer une valeur entre 0 et 6");
		    	Saisie[i] = sc.nextInt();
		    } 
	    }
	    System.out.println(Saisie[0]+":"+Saisie[1]+":"+Saisie[2]+":"+Saisie[3]);
	}
	
	public void comparaison()
	{
		victoire = true;
        for(int i=0 ; i<NB_CHIFFRES ; i++) {
            boolean bonChiffre = Saisie[i] == solution[i];
            System.out.print( (bonChiffre ? Vrai : Faux) + " ");
            victoire = victoire && bonChiffre;
        }
        System.out.println("\n");
	}
	
	public void fin()
	{
		if(count == 0 && !victoire)
			System.out.println("Vous avez epuisez tous vos essais.\nMerci d'avoir jouer");
		else if(count < ESSAIE && victoire)
			System.out.println("Vous avez gagnez en seulement "+(ESSAIE-count)+" essaies, bravo");
	}
}
