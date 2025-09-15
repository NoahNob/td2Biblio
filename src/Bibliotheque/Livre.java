package Bibliotheque;

import Exceptions.LivreIndisponibleException;

public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    boolean disponible;



    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
        this.isbn = isbn;


    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void emprunter() {
        try {
            getTitre();
            getAuteur();
            getIsbn();
            this.disponible = false;
        } catch(LivreIndisponibleException e) {
            System.out.println(e.getMessage());
        }
    }

    public void retourner() {
        getTitre();
        getAuteur();
        getIsbn();
        if (!isDisponible()) {
            this.disponible = true;
        }
    }

    @Override
    public String toString() {
        if (isDisponible()) {
            return "Le livre" + getTitre() + "de l'auteur" + getAuteur() + "numéroté " + getIsbn() + "a l'ISBN, est disponible";
        } else {
            return "Le livre " + getTitre() + " de l'auteur " + getAuteur() + " numéroté " + getIsbn() + " a l'ISBN, est indisponible  ";
        }
    }
}

