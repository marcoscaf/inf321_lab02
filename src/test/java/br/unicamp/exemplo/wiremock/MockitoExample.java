package br.unicamp.exemplo.wiremock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.unicamp.comprefacil.mockito.MockedClass;

public class MockitoExample {
	//Anota a interface que será mockada
	@Mock
	MockedClass mock;
	
	//Instancia o mock
	public MockitoExample(){
		mock = Mockito.mock(MockedClass.class);
		
		// Quando o método testMock for chamado, retorne "Mockito OKK"
		Mockito.when(mock.testMock()).thenReturn("Mock ok");
	
		// Quando o método getName for chamado, retorne "Me chamo Moises !"
		Mockito.when(mock.getName()).thenReturn("Me chamo Moises !");
	}
	
	
	
	@Test
	public void test(){
		assertEquals(mock.testMock(), "Mock ok");
		System.out.println(mock.testMock());
		
		assertEquals(mock.getName(), "Me chamo Moises !");
		System.out.println(mock.getName());
	}
}
