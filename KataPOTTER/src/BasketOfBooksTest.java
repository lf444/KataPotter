import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasketOfBooksTest {
	
	private BasketOfBooks bob;

	@Before
	public void setUp() throws Exception {
		this.bob = new BasketOfBooks(5);
	}

	@After
	public void tearDown() throws Exception {
		this.bob=null;
	}

	@Test
	public void testLivreVide() {
		assertEquals(0.0F, this.bob.GetPrix(),0.0F);
	}
	
	@Test
	public void testLivreUnLivre() {
		this.bob.add(0,1);
		assertEquals(8.0F, this.bob.GetPrix(),0.0F);
	}
	
	
	@Test
	public void testLivreIdentique() {
		this.bob.add(0,1);
		this.bob.add(0,1);
		assertEquals(16.0F, this.bob.GetPrix(),0.0F);
	}
	

	@Test
	public void testLivreReduc5() {
		this.bob.add(0,1);
		this.bob.add(1,1);
		assertEquals(15.2F, this.bob.GetPrix(),0.0F);
	}
	
	@Test
	public void testLivreReduc10() {
		this.bob.add(0,1);
		this.bob.add(1,1);
		this.bob.add(2,1);
		assertEquals(21.6F, this.bob.GetPrix(),0.1F);
	}
	
	@Test
	public void testLivreReduc20() {
		this.bob.add(0,1);
		this.bob.add(1,1);
		this.bob.add(2,1);
		this.bob.add(3,1);
		assertEquals(25.6F, this.bob.GetPrix(),0.1F);
	}
	
	@Test
	public void testLivreReduc50() {
		this.bob.add(0,1);
		this.bob.add(1,1);
		this.bob.add(2,1);
		this.bob.add(3,1);
		this.bob.add(4,1);
		assertEquals(30.0F, this.bob.GetPrix(),0.1F);
	}
	
	@Test
	public void testLivreReduc3Diff1Identique() {
		this.bob.add(0,2);
		this.bob.add(1,1);
		this.bob.add(2,1);
		assertEquals(29.6F, this.bob.GetPrix(),0.1F);
	}
	
	
	@Test
	public void testLivreFinal() {
		this.bob.add(0,2);
		this.bob.add(1,2);
		this.bob.add(2,2);
		this.bob.add(3,1);
		this.bob.add(4,1);
		assertEquals(51.2F, this.bob.GetPrix(),0.1F);
	}
	
	

}
