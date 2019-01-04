package metier;

import java.util.Random;
import java.util.Scanner;

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
	
	public Metier()
	{
        for(int i=0 ; i<NB_CHIFFRES ; i++) 
        {
            solution[i] = r.nextInt(MAX+1);
        }
	    
	    for(int j=0 ; j<ESSAIE ; j++)
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
		    count = new Integer(count.intValue() - 1);
			System.out.println("Il vous reste "+(count)+" essaies");
			if(count == 0)
			{
				System.out.println("Vous avez epuisez tous vos essais.\nMerci d'avoir jouer");
			}
	    }
	}
}
