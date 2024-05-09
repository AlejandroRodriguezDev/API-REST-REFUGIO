package com.proyecto.api_refugios.Refugio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioRefugio extends JpaRepository <Refugio, Integer> {

}
