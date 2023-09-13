package com.JawaScript.DesarrolloTP1JPA.entidades;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto extends BaseEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tipo;
    private int tiempoEstimadoCocina;
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private int stockActual;
    private int stockMinimo;
    private String unidadMedida;
    private String receta;
    @ManyToOne
    @JoinColumn(name="rubro_id")
    private Rubro rubro;
}