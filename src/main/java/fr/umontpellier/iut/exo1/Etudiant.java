package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

public class Etudiant{

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String mail;
    private String postale;

    public Etudiant(String nom, String prenom, LocalDate date, String mail, String post){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = date;
        this.mail = mail;
        this.postale = post;
    }

    @Override
    public String toString(){
        return "L'étudiant " + this.nom + this.prenom +
                "né le : " + this.dateDeNaissance +
                "mail : " + this.mail +
                "postale : " + this.postale;
    }

    public void setNom(String nom){
        this.nom = nom;
    }


}