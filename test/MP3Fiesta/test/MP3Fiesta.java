/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MP3Fiesta.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MP3Fiesta {
    
    @Test
    public void MP3FiestaTest(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    }
    
}
