package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        LocalDate dateDeNaissance = LocalDate.of(1996, Month.FEBRUARY, 7);
        Etudiant lolo = new Etudiant("LOLO", "lolo",dateDeNaissance,"lolo@mail.com","30700" );
        System.out.println(lolo);

        Etudiant toto = lolo;
//                new Etudiant("LOLO", "lolo",dateDeNaissance,"lolo@mail.com","30700");
        System.out.println(lolo==toto);
        //Faux si on crée un nouvel etudiant avec les même attributs car il ne compare pas le contenue mais il compare les references
        //Vraie si on dit que toto= lolo car ils ont la même reference;
        toto.setNom("LILO");
        System.out.println(lolo); //on change toto et cela change aussi lolo

        Etudiant lili = new Etudiant("LILI", "lili",dateDeNaissance,"lili@mail.com","Montpellier" );
        Etudiant lulu = new Etudiant("LULU", "lulu",dateDeNaissance,"lulu@mail.com","Nimes" );



        Departement monDepInfo = new Departement("informatique","Montpellier");
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(lili);
        monDepInfo.inscrire(lulu);
        System.out.println(monDepInfo);
        monDepInfo.desinscrire(toto);
        System.out.println(monDepInfo);

        // si on desincrit TOTO ça enleve toto du departement mais pas lolo

    }

}