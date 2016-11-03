import java.util.Scanner;
public class FourmiliereV3
{
	/*----------------------------------------------------------------*/
	/* Constantes accessibles par toutes les méthodes de cette classe */
	/*----------------------------------------------------------------*/
	private static final int MUR      = -1;
	private static final int ENTREE   = -2;
	private static final int SORTIE_1 = -3;
	private static final int SORTIE_2 = -4;
	private static final int DIM      = 15;

	public static void main(String[] a)
	{
		/*------------------*/
		/*    VARIABLES     */
		/*------------------*/
		int[][] terrain;
        int ligF=0,colF=0,move;
        char pos ='N';
        Scanner sc = new Scanner(System.in);
		/*------------------*/
		/*  INSTRUCTIONS    */
		/*------------------*/

		// Initialisation du Terrain
		terrain = FourmiliereV3.initTerrain();

        // Recherche de l'entree du parcours
        for(int i=0 ; i<DIM  ; i++) {
            if (terrain[0][i] == ENTREE) colF = i;
        }

        while (tab[i][j]!=SORTIE_1 ||tab[i][j]!=SORTIE_2 ){
            String str = sc.next();
                    switch(pos) {
                        case 'N':
                            colF -= move;
                            break;
                        case 'E':
                            ligF += move;
                            break;
                        case 'W':
                            ligF -= move;
                            break;
                        case 'S':
                            colF += move;
                            break;

                        }


                }
        }
		// Affichage du Terrain
		System.out.println ( FourmiliereV3.tabEnChaine ( terrain, colF, ligF ) );

	}

	private static int[][] initTerrain()
	{
		int[][] tab = new int[DIM][DIM];
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
		                             

		                          
		             
		 // recopie du tableau bloc dans la partie gauche du tableau tab
            for (int i=0 ; i<DIM ; i++)
            {
                for(int j=0 ; j<DIM/2+1 ; j++)
                {
                    tab[i][j]=bloc[i][j];
                }
            }

            // construction de la partie droite du terrain selon la symetrie verticale
            for (int i=0 ; i<DIM ; i++)
            {
                for(int j=DIM/2 ; j>=0 ; j--)
                {
                    tab[i][DIM-1-j]=bloc[i][j];
                }
            }

            return tab;
        }

        private static String tabEnChaine(int[][] tab, int fourmiPosX, int fourmiPosY)
        {
            String sRet="";

            for (int i=0 ; i<DIM ; i++)
            {
                for(int j=0 ; j<DIM ; j++)
                {
                    if(fourmiPosX==j && fourmiPosY==i)
                    {
                        // c'est l'emplacement de la fourmi, on la dessine
                        sRet+= ".";
                    }
                    else
                    {
                        switch(tab[i][j])
                        {
                            case 0 	      : sRet+= " "; break;
                            case MUR      : sRet+= "X"; break;
                            case ENTREE   : sRet+= " "; break;
                            case SORTIE_1 : sRet+= " "; break;
                            case SORTIE_2 : sRet+= " "; break;
                        }
                    }

                }
                sRet+= "\n";
            }


            return sRet;

        }
}
