package com.odcarebears.entity;


import javax.persistence.*;


@Entity
@Table(name="custumer")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	@Column(name="full_name", length=150)
	private String fullName;
	@Column(name="email", length=150)
	private String email;	
	@Column(name="password", length=150)
	private String password;
	@Column(name="telephone", length=10)
	private String telephone;

	
}