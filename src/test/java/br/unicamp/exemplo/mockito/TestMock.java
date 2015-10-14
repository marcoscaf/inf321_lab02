package br.unicamp.exemplo.mockito;

import junit.framework.TestCase;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;



public class TestMock extends TestCase {
	
	//Anota a interface que ser� mockada
	@Mock
	MockedClass mock;
	
	//Instancia o mock
	public TestMock(){
		mock = Mockito.mock(MockedClass.class);
		
		// Quando o m�todo testMock for chamado, retorne "Mockito OKK"
		Mockito.when(mock.testMock()).thenReturn("Mock ok");
	
		// Quando o m�todo getName for chamado, retorne "Me chamo Moises !"
		Mockito.when(mock.getName()).thenReturn("Me chamo Moises !");
	}
	
	
	
	@Test
	public void test(){
		
		
		assertEquals(mock.testMock(), "Mock ok");
		assertEquals(mock.getName(), "Me chamo Moises !");
	}
	

}
