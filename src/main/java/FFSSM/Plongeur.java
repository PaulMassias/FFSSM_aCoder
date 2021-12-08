package FFSSM;

import java.time.LocalDate;

public class Plongeur extends Personne {
	private int niveau;
        private GroupeSanguin gs;
        private Licence maLicence;
        
        
        
        public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance){
            super(numeroINSEE,nom,prenom,adresse,telephone,naissance);
        }
        
        
        public Licence getLicence(){
            return maLicence;
        }
        
        
        public void ajouterLicence(Licence l){
            this.maLicence=l;
        }
        //ajouterLicence
                
        //dernièreLicence
}
