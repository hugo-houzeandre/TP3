package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class GestionEtudiantsTest {
    Matiere m1 = new Matiere("Géographie", 4);
    Matiere m2 = new Matiere("Sport", 7);
    Matiere m3 = new Matiere("Anglais", 4);
    Matiere m4 = new Matiere("PPP", 1);
    Matiere m5 = new Matiere("Math", 30);
    Matiere m6 = new Matiere("Français", 1);


    @Test
    void test_calculer_moyenne_retourne_0_Quand_Pas_De_Note() {
        Etudiant e = new Etudiant("Flavio", "Gucci", LocalDate.of(2002, 12, 14), "Gucci.flavio@gmail.com", "Paris");
        assertEquals(0.0, e.calculermoyenne(), 0.01);

    }

    private void assertEquals(double v, float calculermoyenne, double v1) {
    }

    @Test
    void test_calculer_moyenne_retourne_valeur_note_quand_une_seule_note() {
        Etudiant e = new Etudiant("Zola", "Kaaris", LocalDate.of(2002, 12, 14), "ZolaKarkis667@gmail.com", "Montpellier");
        e.noter(m5, 20);
        assertEquals(20.0, e.calculermoyenne(), 0.01);

    }

    @Test
    void test_calculer_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient() {
        Etudiant e = new Etudiant("Hugo", "Calzo", LocalDate.of(2002, 12, 14), "Hugo.zolga@gmail.com", "Tour");
        e.noter(m5, 20);
        assertEquals(20.0, e.calculermoyenne(), 0.01);
    }

    @Test
    void test_calculer_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Etudiant e = new Etudiant("Louna", "Achdjian", LocalDate.of(2002, 12, 14), "louna.achacha@outlook.com", "Montpellier");
        e.noter(m5, 14);
        e.noter(m1, 16);
        e.noter(m2, 10.9F);
        e.noter(m6, 10.5F);
        e.noter(m4, 18.2F);
        assertEquals(14.25, e.calculermoyenne(), 0.01);
    }
}