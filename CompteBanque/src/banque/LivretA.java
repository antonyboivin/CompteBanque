package banque;

public class LivretA extends Compte{
    @Override
    public int retirer(int somme) {
        if (getSolde()-somme<0)
            throw new IllegalArgumentException("La somme est trop importante");
        return super.retirer(somme);
    }
}