package FFSSM;
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pmassias
 */

public class Tests {

    public Club c1;
    public Moniteur m1;
    public Plongee p1;
    public Plongeur pr1;
    public Licence l1;
    
    
    
    @BeforeEach
    public void setUp(){
        
        LocalDate d1= LocalDate.of(2021,1,1);
        c1 = new Club(null,"FFSSM4ever",null);
        m1= new Moniteur("F140M",null,null,null,null,null,0);
        p1= new Plongee(null,null,d1,0,0);
        pr1= new Plongeur("M150F",null,null,null,null,null);
        l1= new Licence(pr1,"10",d1,null);
        m1.nouvelleEmbauche(c1, d1);
        c1.organisePlongee(p1);
    }
    
    
    
    @Test
    public void testLicenceEstValide(){
        assertEquals(true,l1.estValide(LocalDate.now()),"La licence est censé être valide a cette date");
        
    }
    
    
    
    @Test
    public void plongeeEstConforme(){
        pr1.ajouterLicence(l1);
        p1.ajouteParticipant(pr1);
        assertEquals(true,p1.estConforme(),"la plongee doit être conforme a cette date");
    }
    
    
    @Test
    public void moniteurEmployeurActuel(){
        assertEquals(Optional.ofNullable(c1),m1.employeurActuel(),"Doit retourner la même valeur");
    }
    
    @Test
    public void clubPlongeesNonConformes(){
        Set res =c1.plongeesNonConformes();
        assertEquals(true,res.isEmpty(),"La liste doit être vide");
    }
}

