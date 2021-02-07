package fr.umontpellier.iut.exo2;

public class Matiere {
    private String intitule;
    private float coefficient;


    public Matiere(String intitule , float coefficient){
        this.intitule = intitule;
        this.coefficient = coefficient;

    }
    public float getCoefficient(){
        return this.coefficient;
    }
}