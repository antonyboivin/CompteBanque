package banque;

public class Compte {
    private float solde;

    public Compte()
    {
        this.solde=0.0f;
    }
    public float getSolde() {
        return solde;
    }
    public void setSolde(float solde) {
        this.solde = solde;
    }
}