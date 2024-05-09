package com.proyecto.api_refugios.Refugio;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor

public class RefugioService {
    private final repositorioRefugio repoRefugio;
    //crear refugio----------------------------------------------------------//
    public void createRefugio(Refugio refugio){

        repoRefugio.save(refugio);
    }//fin crea

    //ACTUALIZAR REFUGIO-------------------------------------------------//
    
    public void updateRefugio(Integer id, Refugio refugio) {

            Refugio existingRefugio = repoRefugio.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontró el refugio: " + id));

    existingRefugio.setId_dueno(refugio.getId_dueno());
    existingRefugio.setId_ciudad(refugio.getId_ciudad());
    existingRefugio.setDireccion(refugio.getDireccion());
    existingRefugio.setPop_maxima(refugio.getPop_maxima());
    existingRefugio.setPop_actual(refugio.getPop_actual());
    existingRefugio.setNombre_refugio(refugio.getNombre_refugio());
    repoRefugio.save(existingRefugio);
    }//fin actualizr

    //Buscar REFUGIO-------------------------------------------------//
    public Refugio getRefugioById(Integer id) {
    return repoRefugio.findById(id).orElseThrow(() -> new NoSuchElementException("Querido usuario. Ese refugio no se encuentra...: " + id));
    }
    



}
