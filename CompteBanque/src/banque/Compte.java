package banque;

public class Compte {
    private int solde;

    public Compte()
    {
        this.solde=0;
    }
    public float getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }
    public void deposer(int somme){
        solde+=somme;// équivalent à solde = solde + somme
    }
    public int retirer(int somme){
        return solde-=somme;
    }
    public int virer(int somme, Compte compteDestination)
    {
        compteDestination.deposer(somme);
        return this.retirer(somme);
    }
    @Override
    public String toString() {
        return "Solde : "+solde;
    }
}