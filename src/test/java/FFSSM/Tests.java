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
    Club c1;
    Moniteur m1;
    Plongee p1;
    Plongeur pr1;
    Licence l1;
    
    
    
    @BeforeEach
    public void setUp(){
        static LocalDate
        c1 = new Club(null,null,null);
        m1= new Moniteur(null,null,null,null,null,null,0);
        p1= new Plongee(null,null,null,0,0);
        pr1= new Plongeur(null,null,null,null,null,null);
        l1= new Licence(pr1,"10",,null);
    }
    
    
    
    @Test
    public void testGettersLicence(){
        
    }
}
