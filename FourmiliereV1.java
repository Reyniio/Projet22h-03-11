public class FourmiliereV1
{
    /*----------------------------------------------------------------*/
    /* Constantes accessibles par toutes les méthodes de cette classe */
    /*----------------------------------------------------------------*/
    private static final int MUR      = -1;
    private static final int ENTREE   = -2;
    private static final int SORTIE_1 = -3;
    private static final int SORTIE_2 = -4;
 
 
    public static void main(String[] a)
    {
        /*------------------*/
        /* VARIABLES */
        /*------------------*/
        int[][] terrain;
 
        /*------------------*/
        /*  INSTRUCTIONS    */
        /*------------------*/
 
        // Initialisation du Terrain
        terrain = FourmiliereV1.initTerrain();
 
        // Affichage du Terrain
        System.out.println ( FourmiliereV1.tabEnChaine ( terrain ) );
 
    }
 
	private static int[][] initTerrain()
	{	// Remplissage de la partie centrale
		int[][] tab = new tab[15][15];
		// Remplissage de la partie gauche
		int[][] bloc = new int[][] { {-1,-1,-1,-1,-1,-1,-1,-2 },
		                             {-1, 0,-1, 0,-1, 0, 0, 0 },
		                             {-1, 0, 0, 0, 0, 0, 0,-1 },
		                             {-1, 0,-1, 0,-1, 0, 0,-1 },
		                             {-1, 0, 0, 0,-1, 0, 0, 0 },
		                             {-1, 0, 0, 0,-1, 0, 0,-1 },
		                             {-1,-1,-1, 0,-1,-1,-1,-1 },
		                             {-1, 0, 0, 0, 0, 0, 0, 0 },
		                             {-1, 0, 0,-1,-1,-1,-1,-1 },
		                             {-1, 0,-1, 0, 0, 0, 0,-1 },
		                             {-1, 0, 0, 0,-1, 0, 0, 0 },
		                             {-1, 0,-1, 0,-1, 0,-1,-1 },
		                             {-1, 0, 0, 0,-1, 0, 0,-1 },
		                             {-1, 0, 0, 0, 0, 0, 0,-1 },
		                             {-1,-1,-1,-3,-1,-1,-1,-1 }  };
		                             
		// Remplissage de la partie droite

		                          
		             
		 // recopie du tableau bloc dans la partie gauche du tableau tab
		for (int i=0 ; i<16 ; i++)
		{
		    for(int j=0 ; j<8 ; j++)
		    {
		    	tab[i][j]=bloc[i][j];
		    }
		}		                              
		                             
		// construction de la partie droite du tableau tab selon la symetrie verticale
		for (int i=0 ; i<16 ; i++)
		{
			for(int j=7 ; j>=0 ; j--)
			{
				tab[i][7+7-j]=bloc[i][j];
			}
		}

		return tab;
	}
 
    private static String tabEnChaine(int[][] tab, int posXFourmi, int posYFourmi)
    {
        String sRet="";
 
        // Construction d'une chaine sRet symbolisant le terrain
 
        // A compléter
 
 
        return sRet;
 
    }
}
