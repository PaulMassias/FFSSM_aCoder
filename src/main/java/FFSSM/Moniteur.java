/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.*;


public class Moniteur extends Plongeur {

    public int numeroDiplome;
    
    public HashMap<Club,Embauche> emplois;
    
    

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
        this.emplois= new HashMap();
    }

    /**
     * Si ce moniteur n'a pas d'embauche, ou si sa dernière embauche est terminée,
     * ce moniteur n'a pas d'employeur.
     * @return l'employeur actuel de ce moniteur sous la forme d'un Optional
     */
    public Optional<Club> employeurActuel() {
        Club employeur = new Club(null,null,null);
        for(Embauche e : emplois.values()){
            if(e.estTerminee()==false){
                return Optional.ofNullable(e.getEmployeur());
            }
        }
        return Optional.ofNullable(employeur);
    }
    
    /**
     * Enregistrer une nouvelle embauche pour cet employeur
     * @param employeur le club employeur
     * @param debutNouvelle la date de début de l'embauche
     */
    public void nouvelleEmbauche(Club employeur, LocalDate debutNouvelle) {
        Embauche e = new Embauche(debutNouvelle, this,employeur);
        emplois.put(employeur,e);	    
    }

    public List<Embauche> emplois() {
        List<Embauche> listeEmbauche = new ArrayList();
        for(Embauche e : emplois.values()){
            listeEmbauche.add(e);
        }
        return listeEmbauche;
    }

}
