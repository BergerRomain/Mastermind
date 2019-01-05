package donnees;

import java.util.Scanner;
import metier.*;

public class Menu 
{			
	Scanner sc = new Scanner (System.in);
	public static int menu;
	
	public Menu()
	{
		System.out.println("Mastermind");
		System.out.println("1: Mode Normal");
		System.out.println("2: Mode Triche");
		menu = sc.nextInt();
		while(menu < 1 || menu > 2)
		{
			System.out.println("Veuillez saisir 1 ou 2");
			menu = sc.nextInt();
		}
		if(menu == 1)
		{
			Metier M = new Metier();
		}
		else if(menu == 2)
		{
			Metier M = new Metier();
		}
	}
}
