

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
		/*    VARIABLES     */
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
	{
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

        int[][] tab = new int[][] { {-1,-1,-1,-1,-1,-1,-1,-2,-1,-1,-1,-1,-1,-1,-1 },
                {-1, 0,-1, 0,-1, 0, 0, 0, 0, 0,-1, 0, -1, 0,-1 },
                {-1, 0, 0, 0, 0, 0, 0,-1, 0, 0, 0, 0, 0, 0,-1 },
                {-1, 0,-1, 0,-1, 0, 0,-1, 0, 0,-1, 0,-1, 0,-1 },
                {-1, 0, 0, 0,-1, 0, 0, 0, 0, 0,-1, 0, 0, 0,-1 },
                {-1, 0, 0, 0,-1, 0, 0,-1, 0, 0,-1, 0, 0, 0,-1 },
                {-1,-1,-1, 0,-1,-1,-1,-1,-1,-1,-1, 0,-1,-1,-1 },
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,-1 },
                {-1, 0, 0,-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 0,-1 },
                {-1, 0,-1, 0, 0, 0, 0,-1, 0, 0, 0, 0,-1, 0,-1 },
                {-1, 0, 0, 0,-1, 0, 0, 0, 0, 0,-1, 0, 0, 0,-1 },
                {-1, 0,-1, 0,-1, 0,-1,-1,-1, 0,-1, 0,-1, 0,-1 },
                {-1, 0, 0, 0,-1, 0, 0,-1, 0, 0,-1, 0, 0, 0,-1 },
                {-1, 0, 0, 0, 0, 0, 0,-1,-0, 0, 0, 0, 0, 0,-1 },
                {-1,-1,-1,-3,-1,-1,-1,-1, -1,-1,-1,-3,-1,-1,-1 }  };

		// remplissage des cases du futur terrain (tab) à partir des cases du bloc

		// A compléter



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
