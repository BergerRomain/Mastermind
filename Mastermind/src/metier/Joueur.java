package metier;

import java.util.*;

public class Joueur
{
	Scanner sc = new Scanner (System.in);
	final int NB_CHIFFRES = 4;
	final int ESSAIE = 10;
	final int[] Saisie = new int[NB_CHIFFRES];
	public int count = 10;
	
	public Joueur()
	{
        for(int j=0 ; j<ESSAIE ; j++)
        {
        	for(int i=0 ; i<NB_CHIFFRES ; i++) 
        	{
        		Saisie[i] = sc.nextInt();
        	}
        	System.out.println(Saisie[0]+":"+Saisie[1]+":"+Saisie[2]+":"+Saisie[3]);
        	Indices I = new Indices();
        }
	}
}
