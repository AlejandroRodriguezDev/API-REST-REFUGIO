package com.proyecto.api_refugios.Refugio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/refugio")
@RequiredArgsConstructor
public class ControladorRefugio {

    private final RefugioService refugioService;

    @PostMapping
    public void createRefugio(@RequestBody Refugio refugio){

        refugioService.createRefugio(refugio);
    }//fin post

    @PutMapping("/{id}")
    public void updateRefugio(@PathVariable Integer id, @RequestBody Refugio refugio) {
    refugioService.updateRefugio(id, refugio);
    }//fin put

    @GetMapping("/{id}")
    public ResponseEntity<Refugio> getRefugioById(@PathVariable Integer id) {
    Refugio refugio = refugioService.getRefugioById(id);
    
    return ResponseEntity.ok().body(refugio);
    }//fin get



}
