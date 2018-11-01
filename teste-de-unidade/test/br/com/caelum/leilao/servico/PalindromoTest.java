package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {
	 	@Test
	    public void deveIdentificarPalindromoEFiltrarCaracteresInvalidos() {
	        Palindromo p = new Palindromo();

	        boolean resultado = p.ehPalindromo(
	            "Socorram-me subi no onibus em Marrocos");
	        assertTrue(resultado);
	    }

	    @Test
	    public void deveIdentificarPalindromo() {
	        Palindromo p = new Palindromo();

	        boolean resultado = p.ehPalindromo("Anotaram a data da maratona");
	        assertTrue(resultado);
	    }

	    @Test
	    public void deveIdentificarSeNaoEhPalindromo() {
	        Palindromo p = new Palindromo();

	        boolean resultado = p.ehPalindromo("E preciso amar as pessoas como se nao houvesse amanha");
	        assertFalse(resultado);
	    }

}
