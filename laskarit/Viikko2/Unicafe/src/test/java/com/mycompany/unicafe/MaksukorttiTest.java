package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
        @Test
    public void konstruktoriAsettaaSaldonOikein() {
        assertEquals("saldo: 0.10", kortti.toString());
    }
    @Test
    public void kortilleVoiLadataRahaa() {
    kortti.lataaRahaa(25);
    assertEquals("saldo: 0.35", kortti.toString());
}
    
        @Test
    public void kortiltaVoiOttaaRahaa() {
    kortti.otaRahaa(10);
    assertEquals("saldo: 0.0", kortti.toString());
}
            @Test
    public void korttiEiMeneMiinukselle() {
    kortti.otaRahaa(25);
    assertEquals("saldo: 0.10", kortti.toString());
}
                @Test
    public void korttiPalauttaaFalse() {
    
    assertEquals(false, kortti.otaRahaa(25));
}
                    @Test
    public void korttiPalauttaaTrue() {
    
    assertEquals(true, kortti.otaRahaa(1));
}
}
