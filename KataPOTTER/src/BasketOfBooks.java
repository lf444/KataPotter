
public class BasketOfBooks {

	private int[] tab;
	private double[] tauxReduction = { 0.0F, 0.0F, 0.05F, 0.10F, 0.20F, 0.25F };

	public BasketOfBooks(int NbLivre) {

		this.tab = new int[NbLivre];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = 0;
		}
	}

	public void add(int i, int j) {
		tab[i] += j;
	}

	public int GetTotalBook() {
		int max = 0;
		for (int i = 0; i < tab.length; i++) {
			if (this.tab[i] > 0) {
				max += this.tab[i];
			}
		}
		return max;
	}

	public float GetPrix() {
		int TotalLivre = GetTotalBook();
		float PrixTotal = 0.0F;
		do  {
			PrixTotal += GetMontant(TotalLivre);
		}while(!IsEmpty(tab));
		return PrixTotal;
	}


	private float GetMontant(int TotalLivre) {
		int CompteurLivre = 0;
		float prix = 0.0F;
		for (int i = 0; i < tab.length; i++) {
			if (this.tab[i] > 0) {
				prix += 8;
				CompteurLivre++;
				this.tab[i]--;
			}
		}
		if (TotalLivre %8==0)
			CompteurLivre = 4;
		return (float) (prix - prix * tauxReduction[CompteurLivre]);

	}
	
	private boolean IsEmpty(int[] tab2) {
		for (int i = 0; i < tab2.length; i++) {
			if(tab2[i]!=0) {
				return false;
			}
		}
		return true;
	}


}
