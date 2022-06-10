package br.ucsal.algoritimomonolitico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.algoritimomonolitico.model.ListModel;
import br.ucsal.algoritimomonolitico.service.SomatorioService;
import br.ucsal.algoritimomonolitico.util.Erro;

@RestController
@RequestMapping(value = "/sum")
public class SomatorioController {

	@Autowired
	private SomatorioService somatorioService;
	
	@PostMapping("/getvalorsomatorio")
	public ResponseEntity<?> getValorSomatorio(@RequestBody ListModel parametros) {
		
		long start  = System.currentTimeMillis();
		
		try {
			
			return new ResponseEntity<List<Integer>>(somatorioService.getValorSomatorio(parametros, start), HttpStatus.OK);
		}   
		catch (Exception e) {

			e.printStackTrace();

			String mensagem = e.getMessage() != null ? e.getMessage() : "Falha no endpoint sum/getvalortotalsomatorio";

			return new ResponseEntity<Erro>(new Erro(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensagem), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
