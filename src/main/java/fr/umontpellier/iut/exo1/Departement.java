package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> lesEtudiantsDuDepartement;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        lesEtudiantsDuDepartement = new ArrayList<>();
    }

    @Override
    public String toString() {
        String resultat = new String("Voici la liste des etudiants du departement "
                + specialite + ":"+ "\n");
        resultat += lesEtudiantsDuDepartement ;
//        Avec une mise en forme:
//        String listeEtudiant= new String();
//        for (Etudiant e : lesEtudiantsDuDepartement)
//            resultat += e ;
        return resultat;
    }

    public void inscrire (Etudiant e){
        lesEtudiantsDuDepartement.add(e);
    }

    public void desinscrire(Etudiant e){
        lesEtudiantsDuDepartement.remove(e);
    }
}