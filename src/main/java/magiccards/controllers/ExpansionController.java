package magiccards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magiccards.entities.Expansion;
import magiccards.repositories.ExpansionRepository;

@RestController
@RequestMapping("expansion")
public class ExpansionController {

	@Autowired
	private ExpansionRepository expansionRepository;

	@GetMapping(value = "{id}")
	public Expansion getExpansionById(@PathVariable("id") String expansionId) {
		return expansionRepository.findOne(expansionId);
	}

	@GetMapping
	public Page<Expansion> getExpansions(@RequestParam(value="page")int pageNumber, 
										 @RequestParam int size) {

		Pageable page = new PageRequest(pageNumber, size);

		return expansionRepository.findAll(page);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Expansion expansion) {
		expansionRepository.save(expansion);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Expansion expansion) {
		expansionRepository.save(expansion);
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable("id")String id) {
		expansionRepository.delete(id);
	}
}