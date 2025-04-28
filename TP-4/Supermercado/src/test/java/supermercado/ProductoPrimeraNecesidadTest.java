package supermercado;

import com.models.ProductoPrimeraNecesidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,0.9);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
}
