/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erikv
 */
public class KassapaateTest {
    
 Kassapaate kassa;
 Maksukortti kortti;
  Maksukortti kortti2;

    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(1000);
        kortti2 = new Maksukortti(0);
    }
    
    @Test
    public void kassassaAlussaTarpeeksiRahaa(){
                assertEquals(100000, kassa.kassassaRahaa());
    }
    
        @Test
    public void nollaMyytaLounasta(){
                assertEquals(0, kassa.maukkaitaLounaitaMyyty()+
                        kassa.edullisiaLounaitaMyyty());
    }
    
        @Test
    public void syoMaukas(){
        kassa.syoMaukkaasti(500);
                assertEquals(100400, kassa.kassassaRahaa());
    }
            @Test
    public void syoEdullinen(){
        kassa.syoEdullisesti(500);
                assertEquals(100240, kassa.kassassaRahaa());
    }
        public void syoMaukasKasvattaaMaaraa(){
        kassa.syoMaukkaasti(500);
                assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
            @Test
    public void syoEdullinenKasvattaaMaaaraa(){
        kassa.syoEdullisesti(500);
                assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
            public void syoMaukasRahatEiKasvataMaaraa(){
        kassa.syoMaukkaasti(100);
                assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
            @Test
    public void syoEdullinenRahatEiKasvataMaaraa(){
        kassa.syoEdullisesti(100);
                assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
     public void syoMaukasRahatEiTuoRahaa(){
        kassa.syoMaukkaasti(100);
                assertEquals(100000, kassa.kassassaRahaa());
    }
            @Test
    public void syoEdullinenRahatEiTuoRahaa(){
        kassa.syoEdullisesti(100);
                assertEquals(100000, kassa.kassassaRahaa());
    }
    
    //KORTTII
    
            @Test
    public void syoMaukasKortilla(){
        kassa.syoMaukkaasti(kortti);
                assertEquals(100000, kassa.kassassaRahaa());
    }
            @Test
    public void syoEdullinenKortilla(){
        kassa.syoEdullisesti(kortti);
                assertEquals(100000, kassa.kassassaRahaa());
    }
    
                @Test
    public void syoMaukasKortillaVahentaa(){
        kassa.syoMaukkaasti(kortti);
                assertEquals("saldo: 6.0", kortti.toString());
    }
            @Test
    public void syoEdullinenKortillaVahentaa(){
        kassa.syoEdullisesti(kortti);
                assertEquals("saldo: 7.60", kortti.toString());
    }
                @Test
    public void syoMaukasKortillaTrue(){
                assertEquals(true, kassa.syoMaukkaasti(kortti));
    }
            @Test
    public void syoEdullinenKortillaTrue(){
                assertEquals(true, kassa.syoMaukkaasti(kortti));
    }
    
    
        public void syoMaukasKasvattaaMaaraaKortilla(){
        kassa.syoMaukkaasti(kortti);
                assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
            @Test
    public void syoEdullinenKasvattaaMaaaraaKortilla(){
        kassa.syoEdullisesti(kortti);
                assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
            public void syoMaukasRahatEiKasvataMaaraaKortilla(){
        kassa.syoMaukkaasti(kortti2);
                assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
            @Test
    public void syoEdullinenRahatEiKasvataMaaraaKortilla(){
        kassa.syoEdullisesti(kortti2);
                assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
     public void syoMaukasRahatEiTuoRahaaKortilla(){
        kassa.syoMaukkaasti(kortti2);
                assertEquals(100000, kassa.kassassaRahaa());
    }
            @Test
    public void syoEdullinenRahatEiTuoRahaaKortilla(){
        kassa.syoEdullisesti(kortti2);
                assertEquals(100000, kassa.kassassaRahaa());
    }
    
    
                    @Test
    public void syoMaukasKortillaEiVahentaa(){
        kassa.syoMaukkaasti(kortti2);
                assertEquals("saldo: 0.0", kortti2.toString());
    }
            @Test
    public void syoEdullinenKortillaEiVahentaa(){
        kassa.syoEdullisesti(kortti2);
                assertEquals("saldo: 0.0", kortti2.toString());
    }
                @Test
    public void syoMaukasKortillaFalse(){
                assertEquals(false, kassa.syoMaukkaasti(kortti2));
    }
            @Test
    public void syoEdullinenKortillaFalse(){
                assertEquals(false, kassa.syoMaukkaasti(kortti2));
    }
    
                @Test
    public void lataaRahaaKortille(){
        kassa.lataaRahaaKortille(kortti, 500);
                assertEquals(100500, kassa.kassassaRahaa());
    }
                    @Test
    public void lataaRahaaKortilleKorttiMuuttuu(){
        kassa.lataaRahaaKortille(kortti, 500);
                assertEquals("saldo: 15.0", kortti.toString());
    }
    @Test
        public void lataaRahaaKortilleKorttieiMuuttuu(){
        kassa.lataaRahaaKortille(kortti, -1);
                assertEquals("saldo: 10.0", kortti.toString());
    }
    
}
