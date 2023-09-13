package com.JawaScript.DesarrolloTP1JPA.repositorios;

import com.JawaScript.DesarrolloTP1JPA.entidades.BaseEntidad;
import com.JawaScript.DesarrolloTP1JPA.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository <DetallePedido, Long> {


}
