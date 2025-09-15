package Bibliotheque;

public class LivreNumerique extends Livre{
    private double tailleFichier;

    public LivreNumerique(String titre, String auteur, String isbn, boolean disponible, double tailleFichier) {
        super(titre, auteur, isbn, disponible);
    }

    public double getTailleFichier() {
        return tailleFichier;
    }

    public void setTailleFichier(double tailleFichier) {
        this.tailleFichier = tailleFichier;
    }

    @Override
    public void emprunter() {
        getTitre();
        getAuteur();
        getIsbn();
        getTailleFichier();

    }


    @Override
    public String toString() {
        return "";
    }
}
