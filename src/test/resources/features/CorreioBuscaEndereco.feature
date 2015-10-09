Feature: CorreioBuscaEndereco 
	As a CompreFacil user
  I want to find my adress by CEP
  So that I dont need to type my adress

Scenario: Find adress by CEP 
	Given I am a valid Correios user
 	And Correios knows about the following adress:
 		| CEP       | Rua                      | Bairro         | Cidade | Estado    |
 		| 13310-150 | Regina Maria de Oliveira | Pq. Candelária | Itu    | São Paulo |
    When I send a GET request for "/enderecos/13310150"
    Then the response should be JSON:
   		"""
	    [
	      {"CEP": "13310-150", "Rua": "Regina Maria de Oliveira", "Bairro": "Pq. Candelária", "Cidade": "Itu", "Estado": "SP"}
	    ]
    	"""
    	
Scenario: CEP not found
	Given I am a valid Correios user
	And Correios has the following error messages:
		| Codigo | Mensagem           |
		| 1      | CEP não encontrado |
		| 2      | CEP invalido       |
	When I send a GET request for "/enderecos/11111111"
	Then the response should be JSON:
   		"""
	    [
	      {"Codigo": "1", "Mensagem": "CEP não encontrado"}
	    ]
    	"""
    	
Scenario: Invalid CEP
	Given I am a valid Correios user
	And Correios has the following error messages:
		| Codigo | Mensagem           |
		| 1      | CEP não encontrado |
		| 2      | CEP invalido       |
	When I send a GET request for "/enderecos/abcde"
	Then the response should be JSON:
   		"""
	    [
	      {"Codigo": "2", "Mensagem": "CEP invalido"}
	    ]
    	"""
