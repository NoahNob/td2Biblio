public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;



    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
        if (isbn.isBlank() || isbn.length() != 13) {

        }
    }



}

