package com.JawaScript.DesarrolloTP1JPA.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rubro extends BaseEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String denominacion;
    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "rubro")
    private List<Producto> productos = new ArrayList<Producto>();
    public void addProducto(Producto prod){
        productos.add(prod);
    }
}