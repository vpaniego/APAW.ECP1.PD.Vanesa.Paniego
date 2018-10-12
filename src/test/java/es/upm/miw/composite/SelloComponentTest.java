package es.upm.miw.composite;

import es.upm.miw.Sello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SelloComponentTest {

    private SelloComponent selloSonyMusicSpain;
    private SelloComponent selloSonyMusic;
    private SelloComponent selloEpicRecords;

    @BeforeEach
    void before() {
        selloSonyMusic = new SelloComposite("Sony Musica");

        Sello sello = new Sello("1", "Sony Music Spain", "Madrid");
        selloSonyMusicSpain = new SelloLeaf(sello);
        selloSonyMusic.add(selloSonyMusicSpain);

        selloEpicRecords = new SelloComposite("Epic Records");
        selloSonyMusic.add(selloEpicRecords);


    }

    @Test
    void testIsSelloLeaf() {
        assertTrue(!selloSonyMusicSpain.isComposite());
    }

    @Test
    void testIsSelloComposite() {
        assertTrue(selloEpicRecords.isComposite());
    }

    @Test
    void testViewSelloLeaf() {
        assertTrue(!selloSonyMusicSpain.isComposite());
        assertEquals("1", selloSonyMusicSpain.view());
    }

    @Test
    void testViewSelloComposite() {
        assertTrue(selloEpicRecords.isComposite());
        assertEquals("Epic Records", selloEpicRecords.view());
    }

}
