package Tests;

import Bibliotheque.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliothequeTest {
    Bibliotheque bibliotheque = new Bibliotheque();


    @BeforeEach
    void setUp() {
        bibliotheque.ajouterLivre(new Livre("1984", "Georges Orwell", "9780140817744", true));
    }

    @Test
    void testAjouterLivre() {
        assertEquals(1, bibliotheque.livres.size());
        bibliotheque.ajouterLivre(new Livre("1984", "Georges Orwell", "9780140817744", true));

    }
}
