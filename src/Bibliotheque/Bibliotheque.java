package Bibliotheque;

import java.util.ArrayList;
import java.util.List;
import Bibliotheque.Livre;

public class Bibliotheque {
    public ArrayList<Livre> livres = new ArrayList<>();



    public boolean ajouterLivre(Livre livre) {
        if(!this.livres.contains(livre)) {
            livres.add(livre);
        }
        return true;
    }

    public void emprunterLivre(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)) {
                livre.disponible = false;
            }
        }
    }

    public void listerLivresDisponible (List<Livre> livres) {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    };

    public void rechercherParAuteur(String auteur) {
        for (Livre livre : livres) {
            if (livre.getAuteur().equals(auteur)) {
                System.out.println(livre);
            }
        }
    }
}
