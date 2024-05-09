package com.proyecto.api_refugios.Refugio;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Refugio {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private Integer id_dueno;
    private Integer id_ciudad;
    private String   direccion;
    private Integer pop_maxima;
    private Integer pop_actual;
    private String   nombre_refugio;
}
