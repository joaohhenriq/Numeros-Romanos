package br.com.numerosRomanos;

import org.junit.Assert;
import org.junit.Test;

public class NumerosRomanosTest {
    
	@Test
    public void main(){
    	NumerosRomanos numerosRomanos = new NumerosRomanos();
    	
    	Assert.assertEquals(0, numerosRomanos.numRomano("MMMMM"));
    	Assert.assertEquals(4999, numerosRomanos.numRomano("MMMMDCCCCLXXXXVIIII"));
    	Assert.assertEquals(1, numerosRomanos.numRomano("I"));
    	Assert.assertEquals(0, numerosRomanos.numRomano(""));
    }
}
