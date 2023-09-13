package com.JawaScript.DesarrolloTP1JPA;

import com.JawaScript.DesarrolloTP1JPA.entidades.*;
import com.JawaScript.DesarrolloTP1JPA.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DesarrolloTp1JpaApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesarrolloTp1JpaApplication.class, args);

	}
	@Bean
	CommandLineRunner init(ClienteRepository clienteRepo,RubroRepository rubroRepo, DomicilioRepository domicilioRepo, PedidoRepository pedidoRepo, FacturaRepository facturaRepo, DetallePedidoRepository detallePedidoRepo, ProductoRepository productoRepo){
		return args -> {
			System.out.println("aaaaaaaaaaaaaaaaaaaa");

			Cliente cliente1 = new Cliente();
			cliente1.setNombre("Joaquin");
			cliente1.setApellido("Cortez");
			cliente1.setTelefono(123456);
			cliente1.setEmail("aaa@email.com");

			Domicilio domicilio1 = new Domicilio();
			domicilio1.setCalle("Pueyrredon");
			domicilio1.setLocalidad("Mendoza");
			domicilio1.setNumero(781);
			domicilio1.setCliente(cliente1);

			Pedido pedido1 = new Pedido();
			pedido1.setEstado("en cocina");
			pedido1.setTipoEnvio("Delivery");
			pedido1.setCliente(cliente1);

			Factura factura1 = new Factura();
			factura1.setNumero(132);
			factura1.setFecha(new Date(5 - 4 -2001));
			factura1.setDescuento(0);
			factura1.setFormaPago("Efectivo");
			factura1.setTotal(3500);

			Producto producto1 = new Producto();
			producto1.setDenominacion("Hamburguesa");
			producto1.setReceta("carnita carnita god panceta");
			producto1.setTipo("Manufacturado");
			producto1.setTiempoEstimadoCocina(30);
			producto1.setPrecioVenta(2500);
			producto1.setStockActual(20);
			producto1.setStockMinimo(5);
			producto1.setUnidadMedida("Unid");

			DetallePedido detalle1 = new DetallePedido();
			detalle1.setCantidad(2);
			detalle1.setSubtotal(5000);

			Rubro rubro1 = new Rubro();
			rubro1.setDenominacion("Carnes");

			rubro1.addProducto(producto1);
			producto1.setRubro(rubro1);
			cliente1.addDomicilio(domicilio1);
			cliente1.addPedido(pedido1);
			pedido1.setFactura(factura1);
			pedido1.addDetallePedido(detalle1);
			detalle1.setPedido(pedido1);
			detalle1.setProducto(producto1);

			rubroRepository.save(rubro1);
			productoRepository.save(producto1);
			clienteRepository.save(cliente1);
			facturaRepository.save(factura1);
			detallePedidoRepository.save(detalle1);

		};
	}

}
