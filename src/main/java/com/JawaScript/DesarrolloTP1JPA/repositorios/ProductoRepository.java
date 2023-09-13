package com.JawaScript.DesarrolloTP1JPA.repositorios;

import com.JawaScript.DesarrolloTP1JPA.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {


}
