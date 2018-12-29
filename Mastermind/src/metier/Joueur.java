package metier;

import java.util.*;

public class Joueur
{
	Scanner sc = new Scanner (System.in);
	final int NB_CHIFFRES = 4;
	final int[] Saisie = new int[NB_CHIFFRES];
	
	public Joueur()
	{
        for(int i=0 ; i<NB_CHIFFRES ; i++) 
        {
        	Saisie[i] = sc.nextInt();
        }
    	System.out.println(Saisie[0]+":"+Saisie[1]+":"+Saisie[2]+":"+Saisie[3]);
	}
}
