package br.edu.fatecfranca.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.apidb.model.OS;
import br.edu.fatecfranca.apidb.model.repositories.OSRepository;

//informa que a classe responde por requisições restfull
@RestController
public class OSController {
	//característica principal do spring
	//injeção de dependência
	//objeto pode utilizar métodos de sua interface sem ser instanciado
	@Autowired
	OSRepository injecao;
	
	//método get para consultar os OSs na rota/OS
	@GetMapping("/OS")
	@CrossOrigin(origins="*")
	public List<OS>get(){
		//select * from OS
		return injecao.findAll();
	}
	//Método para inserir um pokemón na rota /OS
	@PostMapping("/OS")
	@CrossOrigin(origins="*")
	public OS add(@RequestBody OS ordemserv) {
		OS novoOS = injecao.save(ordemserv);
		return novoOS;
	}	
	
	@DeleteMapping("/OS/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		try {//Tenta remover
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}
		catch(Exception e) {//Pegar erro
			return "OS não encontrado para remoção";
		}
		
	}

	//Método para inserir um pokemón na rota /OS
	@PutMapping("/OS")
	@CrossOrigin(origins="*")
	public OS updates(@RequestBody OS ordemserv) {
		OS alteradoOS = injecao.save(ordemserv);
		return alteradoOS;
}
	
}
