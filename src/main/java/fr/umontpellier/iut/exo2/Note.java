package fr.umontpellier.iut.exo2;

public class Note {
    private Matiere matiere;
    private float note;

    public Note(float note, Matiere matiere){
        this.note = note;
        this.matiere = matiere;


    }
    public float getNote(){
        return this.note;
    }
    public Matiere getMatiere(){
        return this.matiere;
    }


}