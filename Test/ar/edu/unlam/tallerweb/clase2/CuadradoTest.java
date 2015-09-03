package ar.edu.unlam.tallerweb.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	

		@Test
		public void test() {
			Cuadrado p=new Cuadrado(2);
			assertNotNull(p);
		}

		@Test
		public void testPerimetro(){
			
			Cuadrado cuadrado = new Cuadrado(2);
			
			cuadrado.perimetro();
			
			
			assertEquals(8, cuadrado.perimetro().intValue());
		}
		
		@Test
		public void testSuperficie(){
			
			Cuadrado cuadrado = new Cuadrado(2);
			
			cuadrado.superficie();
			
			
			assertEquals(4, cuadrado.superficie().intValue());
		}
		
		
}
