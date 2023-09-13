package com.JawaScript.DesarrolloTP1JPA.entidades;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido extends BaseEntidad{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String estado;
    private String tipoEnvio;

    @OneToOne(cascade = CascadeType.ALL)
    private Factura factura;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "pedido")
    private List<DetallePedido> detallesPedido = new ArrayList<DetallePedido>();
    @ManyToOne
    @JoinColumn(name="client_id")
    private Cliente cliente;

    public void addDetallePedido(DetallePedido detalle){
        detallesPedido.add(detalle);
    }
}
