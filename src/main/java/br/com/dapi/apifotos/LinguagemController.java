package br.com.dapi.apifotos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
	
	@Autowired
	private LinguagemRepository repositorio;
	
	@GetMapping(value = "/oi")
	public String mostraOiNaTela() {
		return "Oi";
	}
	
	@GetMapping(value = "/lista")
	public List<Linguagem> obterImagens() {
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}
	
	@PostMapping(value = "/lista")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		Linguagem linguagemSalva  = repositorio.save(linguagem);
		return linguagemSalva;
	}
}
