package com.odcarebears.entity;

import java.util.Calendar;
import javax.persistence.*;


@Entity
@Table(name="producto")
public class Producto {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long id_Producto;
	
	@Column(name="nombre_producto")
	private String numeroProductos;
	
	@Column(name="precio" )
	private Double precio;
	
	@Column(name="descripcion", length=255)
	private String descripcion;
	
	@Column(name="fecha_creacion", insertable=false, updatable=false, columnDefinition="timestamp default CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaCreacion;
	
	@Column(name="existencias")
	private Long estado;
	
	//uno a muchos con (imagenes>id_producto)
	//uno a muchos con (detalles pedido>id_producto)  
	
	/*
	@ManyToMany
	@JoinColumn(name="id_categoria")
	private Categoria idCategoria
	 */
	;


}



