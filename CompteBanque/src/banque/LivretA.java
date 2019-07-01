package banque;

public class LivretA extends Compte{
    private void verifierRetrait(int somme)
    {
        if (getSolde()-somme<0)
            throw new IllegalArgumentException("La somme est trop importante");
    }
    @Override
    public int retirer(int somme) {
        assert getSolde()<=0;
        verifierRetrait(somme);
        return super.retirer(somme);
    }

    @Override
    public int virer(int somme, Compte compteDestination) {
        if (getSolde()<0)
            throw new InternalError();
        verifierRetrait(somme);
        return super.virer(somme, compteDestination);
    }

    public static void main(String args[])
    {
        Compte c1=new LivretA();
        System.out.println("Dépôt de 100€");
        c1.deposer(100);
        System.out.println(c1);
        System.out.println("Retrait de 200€");
        c1.retirer(200);
        System.out.println(c1);
        System.out.println("Virement de c1 vers c2");
        Compte c2=new LivretA();
        c1.virer(25, c2);
        System.out.println("c1, "+c1);
        System.out.println("c2, "+c2);
        System.out.println("ne devrait pas s'afficher");
    }
}