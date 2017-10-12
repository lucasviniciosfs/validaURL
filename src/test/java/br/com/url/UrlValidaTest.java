package br.com.url;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class UrlValidaTest {
	@Test
    public void converteNumeroTest(){
    	UrlValida urlValida = new UrlValida();
    	
    	urlValida.validaURL("http://globoesporte.globo.com/go/futebol/times/goias");
    	urlValida.validaURL("https://outlook.live.com/owa/?realm=hotmail.com&path=/mail/sentitems/rp");
    	urlValida.validaURL("http://www.google.com/mail/user=fulano");
    	urlValida.validaURL("http://www.google");
    }  
}
