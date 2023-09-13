package com.JawaScript.DesarrolloTP1JPA.repositorios;

import com.JawaScript.DesarrolloTP1JPA.entidades.BaseEntidad;
import com.JawaScript.DesarrolloTP1JPA.entidades.Cliente;
import com.JawaScript.DesarrolloTP1JPA.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio, Long> {


}
