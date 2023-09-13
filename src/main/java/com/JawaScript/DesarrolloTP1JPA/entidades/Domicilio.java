package com.JawaScript.DesarrolloTP1JPA.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Domicilio extends BaseEntidad {

    private String calle;
    private int numero;
    private String localidad;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Cliente cliente;
}