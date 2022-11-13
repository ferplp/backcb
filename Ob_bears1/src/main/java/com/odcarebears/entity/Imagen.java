package com.odcarebears.entity;
import javax.persistence.*;


@Entity
@Table(name="imagen")
public class Imagen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="imagen_id") //llave compuesta (imagen id /producto id)
	private Long idImagen;
	@Column(name="enlace", length=150)
	private String enlace;

	
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto idProducto;
}
