package es.upm.miw.composite;

import es.upm.miw.Sello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SelloComponentTest {

    private SelloLeaf selloLeaf;
    private SelloComposite selloComposite;

    @BeforeEach
    void before() {
        Sello sello = new Sello("1", "EMI", "Santa Monica");
        selloLeaf = new SelloLeaf(sello);

        selloComposite = new SelloComposite("Epic Records");
    }

    @Test
    void testIsSelloLeaf() {
        assertTrue(!selloLeaf.isComposite());
    }

    @Test
    void testIsSelloComposite() {
        assertTrue(selloComposite.isComposite());
    }

    @Test
    void testViewSelloLeaf() {
        assertTrue(!selloLeaf.isComposite());
        assertEquals("1", selloLeaf.view());
    }

    @Test
    void testViewSelloComposite() {
        assertTrue(selloComposite.isComposite());
        assertNull(selloComposite.view());
    }


    @Test
    void testNameSelloComposite() {
        assertTrue(selloComposite.isComposite());
        selloComposite.name("Capital Records");
        assertNotEquals("Epic Records", selloComposite.getName());
    }

}
