$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CorreioBuscaEndereco.feature");
formatter.feature({
  "id": "correiobuscaendereco",
  "description": "As a CompreFacil user\nI want to find my adress by CEP\nSo that I dont need to type my adress",
  "name": "CorreioBuscaEndereco",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 9230966,
  "status": "passed"
});
formatter.scenario({
  "id": "correiobuscaendereco;find-adress-by-cep",
  "description": "",
  "name": "Find adress by CEP",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am a valid Correios user",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "Correios knows about the following adress:",
  "keyword": "And ",
  "line": 8,
  "rows": [
    {
      "cells": [
        "CEP",
        "Rua",
        "Bairro",
        "Cidade",
        "Estado"
      ],
      "line": 9
    },
    {
      "cells": [
        "13310-150",
        "Regina Maria de Oliveira",
        "Pq. Candelária",
        "Itu",
        "São Paulo"
      ],
      "line": 10
    }
  ]
});
formatter.step({
  "name": "I send a GET request for \"/enderecos/13310150\"",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "the response should be JSON:",
  "keyword": "Then ",
  "line": 12,
  "doc_string": {
    "value": "[\n  {\"CEP\": \"13310-150\", \"Rua\": \"Regina Maria de Oliveira\", \"Bairro\": \"Pq. Candelária\", \"Cidade\": \"Itu\", \"Estado\": \"SP\"}\n]",
    "line": 13,
    "content_type": ""
  }
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 110944,
  "status": "passed"
});
formatter.scenario({
  "id": "correiobuscaendereco;cep-not-found",
  "description": "",
  "name": "CEP not found",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "I am a valid Correios user",
  "keyword": "Given ",
  "line": 20
});
formatter.step({
  "name": "Correios has the following error messages:",
  "keyword": "And ",
  "line": 21,
  "rows": [
    {
      "cells": [
        "Codigo",
        "Mensagem"
      ],
      "line": 22
    },
    {
      "cells": [
        "1",
        "CEP não encontrado"
      ],
      "line": 23
    },
    {
      "cells": [
        "2",
        "CEP invalido"
      ],
      "line": 24
    }
  ]
});
formatter.step({
  "name": "I send a GET request for \"/enderecos/11111111\"",
  "keyword": "When ",
  "line": 25
});
formatter.step({
  "name": "the response should be JSON:",
  "keyword": "Then ",
  "line": 26,
  "doc_string": {
    "value": "[\n  {\"Codigo\": \"1\", \"Mensagem\": \"CEP não encontrado\"}\n]",
    "line": 27,
    "content_type": ""
  }
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 100668,
  "status": "passed"
});
formatter.scenario({
  "id": "correiobuscaendereco;invalid-cep",
  "description": "",
  "name": "Invalid CEP",
  "keyword": "Scenario",
  "line": 33,
  "type": "scenario"
});
formatter.step({
  "name": "I am a valid Correios user",
  "keyword": "Given ",
  "line": 34
});
formatter.step({
  "name": "Correios has the following error messages:",
  "keyword": "And ",
  "line": 35,
  "rows": [
    {
      "cells": [
        "Codigo",
        "Mensagem"
      ],
      "line": 36
    },
    {
      "cells": [
        "1",
        "CEP não encontrado"
      ],
      "line": 37
    },
    {
      "cells": [
        "2",
        "CEP invalido"
      ],
      "line": 38
    }
  ]
});
formatter.step({
  "name": "I send a GET request for \"/enderecos/abcde\"",
  "keyword": "When ",
  "line": 39
});
formatter.step({
  "name": "the response should be JSON:",
  "keyword": "Then ",
  "line": 40,
  "doc_string": {
    "value": "[\n  {\"Codigo\": \"2\", \"Mensagem\": \"CEP invalido\"}\n]",
    "line": 41,
    "content_type": ""
  }
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});