package fr.iut.editeur;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testAjouter(){
        Document d = new Document();
        d.ajouter("hi");
        assertEquals("hi",d.toString());
    }
}
