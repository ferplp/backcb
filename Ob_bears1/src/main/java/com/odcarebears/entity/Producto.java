package com.odcarebears.entity;

import java.util.Calendar;
import javax.persistence.*;


@Entity
@Table(name="producto")
public class Producto {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long idProducto
	;
	
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
	
	@Column(name="foto1")
	private Long foto;
	
	@Column(name="foto2")
	private Long foto2;
	
	@Column(name="foto3")
	private Long foto3;

	@ManyToOne
	@JoinColumn(name="id_categoria",nullable=false, updatable=false)
	private Categoria idCategoria;
	
	
	public Long getIdCategoria() {
	return this.idCategoria.getIdCategoria();
}

public void setIdCategoria(Categoria idCategoria) {
	this.idCategoria = idCategoria;
}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNumeroProductos() {
		return numeroProductos;
	}

	public void setNumeroProductos(String numeroProductos) {
		this.numeroProductos = numeroProductos;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Calendar fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public Long getFoto() {
		return foto;
	}

	public void setFoto(Long foto) {
		this.foto = foto;
	}

	public Long getFoto2() {
		return foto2;
	}

	public void setFoto2(Long foto2) {
		this.foto2 = foto2;
	}

	public Long getFoto3() {
		return foto3;
	}

	public void setFoto3(Long foto3) {
		this.foto3 = foto3;
	}
	
	//uno a muchos con (imagenes>id_producto)
	//uno a muchos con (detalles pedido>id_producto)  
	
	
	


}



