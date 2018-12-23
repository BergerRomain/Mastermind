package metier;

import java.util.*;

public class Solution 
{
	final int NB_CHIFFRES = 4;
	final int MAX = 6;
	final int[] solution = new int[NB_CHIFFRES];
	
	public Solution()
	{
		Random r = new Random();
        for(int i=0 ; i<NB_CHIFFRES ; i++) 
        {
            solution[i] = r.nextInt(MAX+1);
        }
        //System.out.println(solution[0]+":"+solution[1]+":"+solution[2]+":"+solution[3]);
	}
}
