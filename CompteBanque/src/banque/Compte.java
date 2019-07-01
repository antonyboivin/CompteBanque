package banque;

public class Compte {
    protected int solde;

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
    public void deposerSomme(int somme){
        this.solde+=somme;// équivalent à solde = solde + somme
    }
    public int retirer(int somme){
        return this.solde-=somme;
    }
    public int virer(int somme, Compte compteDestination)
    {
        compteDestination.deposerSomme(somme);
        return this.retirer(somme);
    }
    @Override
    public String toString() {
        return "Solde : "+solde;
    }

    public static void main(String []args)
    {
        Compte c1=new Compte();
        System.out.println("Dépôt de 1000€");
        c1.deposerSomme(1000);
        System.out.println(c1);
        System.out.println("Retrait de 50€");
        c1.retirer(50);
        System.out.println(c1); 
        System.out.println("Virement de c1 vers c2");
        Compte c2=new Compte();
        c1.virer(25, c2);
        System.out.println("c1, "+c1);
        System.out.println("c2, "+c2);
    }
}