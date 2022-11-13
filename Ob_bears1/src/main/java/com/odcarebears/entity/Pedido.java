package com.odcarebears.entity;

import java.util.Calendar;

import javax.persistence.*;


@Entity
@Table(name="pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private Long id_Pedido;
	
	@Column(name="numero_productos")
	private Integer numeroProductos;
	
	@Column(name="direccion_envio" ,length=255)
	private String direccionEnvio;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="fecha_realizado", insertable=false, updatable=false, columnDefinition="timestamp default CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaRealizado;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
}




