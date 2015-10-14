package br.unicamp.comprefacil.wiremock;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.*;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

public class WireMockStub {

	private static WireMockRule wireMock;
	static {
		wireMock = new WireMockRule(wireMockConfig().port(9090));
		configureFor(9090);
		wireMock.start();

		stubFor(get(urlMatching("/some/thing")).willReturn(
				aResponse().withHeader("Content-Type", "text/plain").withBody(
						"Hello world!")));

		stubFor(get(urlMatching("/correios/cep/13044100")).willReturn(
				aResponse().withHeader("Content-Type", "text/plain").withBody(
						"Rua Francisco Prado Filho - Jardim dos Oliveiras - Campinas ")));
		
		stubFor(get(urlMatching("/correios/cep/130100231")).willReturn(
				aResponse().withHeader("Content-Type", "text/plain").withBody(
						"Rua Serra do Navio - Jardim São Fernando - Campinas ")));

		// Mapear aqui todos os contextos da URL

		// stubFor(get(urlMatching("/some/teste")).willReturn(
		// aResponse().withHeader("Content-Type", "text/plain")
		// .withBody("Teste")));

	}

	public static String getEndereco(String cep) {
		return HttpClientHelper.sendGet("http://localhost:9090/correios/cep/"+cep);
	}

	public static String getResponse(String url) {
		return HttpClientHelper.sendGet(url);
	}
}
