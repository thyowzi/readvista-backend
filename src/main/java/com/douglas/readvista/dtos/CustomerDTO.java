package com.douglas.readvista.dtos;

import java.io.Serializable;

import com.douglas.readvista.entities.Customer;

import jakarta.validation.constraints.NotNull;

public class CustomerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotNull(message = "Field NAME is required")
	private String name;
	
	@NotNull(message = "Field CPF is required")
	private String cpf;
	
	@NotNull(message = "Field EMAIL is required")
	private String email;
	
	@NotNull(message = "Field PASSWORD is required")
	private String password;

	public CustomerDTO() {
	}

	public CustomerDTO(Customer obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.cpf = obj.getCpf();
		this.email = obj.getEmail();
		this.password = obj.getPassword();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
