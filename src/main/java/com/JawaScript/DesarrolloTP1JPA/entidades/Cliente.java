package com.JawaScript.DesarrolloTP1JPA.entidades;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public final class Cliente extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String apellido;
    private  String nombre;
    private int telefono;
    private String email;

    @Getter
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "cliente")
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();
    @Getter
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,  mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<Pedido>();


    public void addDomicilio(Domicilio domi){
        domicilios.add(domi);
    }
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
}
