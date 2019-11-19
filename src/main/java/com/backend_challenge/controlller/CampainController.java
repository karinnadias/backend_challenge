package com.backend_challenge.controlller;


import com.backend_challenge.model.Campain;
import com.backend_challenge.response.Response;
import com.backend_challenge.services.CampainService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/campain")
public class CampainController  {

    private CampainService campainService;


    @GetMapping
    public ResponseEntity<Response<List<Campain>>> listAllCampains() {
        return ResponseEntity.ok(new Response<>(this.campainService.listAll()));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Response<Optional<Campain>>> listById(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(new Response<>(this.campainService.listById(id)));
    }


    @PostMapping
    public ResponseEntity<Response<Campain>> create(@Valid @RequestBody Campain complain, BindingResult result) {

        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Campain>(erros));
        }

        List<Campain> campanhas = campainService.findEndDate(complain.getDateEnd());
        if(!campanhas.isEmpty()){
            	//Campain stream = campanhas.stream().forEach(campain1 -> campain1.plusDateEnd());
          // 	this.campainService.update(stream);
        }
        return ResponseEntity.ok(new Response<Campain>(this.campainService.create(complain)));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Response<Campain>> update(@PathVariable(name = "id") String id, @Valid @RequestBody Campain complain, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Campain>(erros));
        }
        complain.setId(id);
        return ResponseEntity.ok(new Response<Campain>(this.campainService.update(complain)));
    }


    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<Response<Integer>> removeCampain(@PathVariable (name ="id") String id){
        this.campainService.remove(id);
        return ResponseEntity.ok(new Response<Integer>(1));

    }

}
