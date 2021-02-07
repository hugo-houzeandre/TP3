package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant{

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String mail;
    private String postale;
    private ArrayList<Note> ListeNote;

    public Etudiant(String nom, String prenom, LocalDate date, String mail, String post){
        ListeNote = new ArrayList<>();
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

    public void noter(Matiere matiere, float valeur){
        Note note1 = new Note(valeur, matiere);
        ListeNote.add(note1);
    }

    public float calculermoyenne(){
        float somme = 0;
        float sommeCoef = 0;

        if (ListeNote.size()==0){
            return 0;
        }

        for(int i=0;i<ListeNote.size();i++){
            somme = somme + ListeNote.get(i).getNote()*ListeNote.get(i).getMatiere().getCoefficient();
            sommeCoef = sommeCoef + ListeNote.get(i).getMatiere().getCoefficient();
        }


        return somme/sommeCoef;
    }
}