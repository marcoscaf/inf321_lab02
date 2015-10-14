package br.unicamp.exemplo.wiremock;

import junit.framework.TestCase;

import org.junit.Test;

import br.unicamp.comprefacil.wiremock.WireMockStub;

public class WireMockExample extends TestCase {
	
	@Test
	public void test() {
		System.out.println(WireMockStub.getEndereco("13044100"));
		System.out.println(WireMockStub.getEndereco("130100231"));
	}

}
