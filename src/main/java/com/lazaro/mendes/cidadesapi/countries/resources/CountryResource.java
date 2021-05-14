package com.lazaro.mendes.cidadesapi.countries.resources;


import com.lazaro.mendes.cidadesapi.countries.entities.Country;
import com.lazaro.mendes.cidadesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired //injeção de dependencia
    private CountryRepository repository;


    @GetMapping
    public Page<Country> countries(Pageable page){// para não trazer tudo embolado na tela utilizamos o tipo page que faz no formato de página
        return repository.findAll(page);

    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }
}
