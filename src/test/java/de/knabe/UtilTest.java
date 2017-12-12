package de.knabe;
import static org.junit.Assert.*; 

public class UtilTest {
	
	
	public void test(){
		assertTrue("Fehler bei Jan", Util.istErstesHalbjahr(1));
		assertTrue("Fehler bei Feb", Util.istErstesHalbjahr(2));
		assertTrue("Fehler bei März", Util.istErstesHalbjahr(3));
		assertTrue("Fehler bei April", Util.istErstesHalbjahr(4));
		assertTrue("Fehler bei Mai", Util.istErstesHalbjahr(5));
		assertTrue("Fehler bei Juni", Util.istErstesHalbjahr(6));
		assertTrue("Fehler bei Juli", Util.istErstesHalbjahr(7));	
	}
	
}
