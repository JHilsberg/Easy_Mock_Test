package subtrahiererTest;

import static org.easymock.EasyMock.*;
import junit.framework.TestCase;

public class SubtrahiererTest extends TestCase {
	
	private Datenbank mock;
	private Subtrahierer sub;

	protected void setUp() {
		mock = createMock(Datenbank.class);
		sub = new Subtrahierer(mock);
	}

	public void testSubtrahiereZahlAusDB() {
		expect(mock.getLetzteZahlInDB()).andReturn(2).once();
		replay(mock);
		
		int result = sub.subtrahiereZahlAusDB();
		
		assertEquals(3, result);
		
		verify(mock);
	}

}
