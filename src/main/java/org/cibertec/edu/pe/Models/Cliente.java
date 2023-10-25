package org.cibertec.edu.pe.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String Nombres;
    private String Apellidos;
    private char Sexo;
    @Email(message = "Debe ser una dirección de correo electrónico válida")
    @NotEmpty(message = "El correo es obligatorio")
    private String correo;
    @NotEmpty(message = "La contraseña es obligatoria")
    private String password;
	public Cliente(Integer id, String nombres, String apellidos, char sexo, String correo, String password) {
		super();
		this.id = id;
		Nombres = nombres;
		Apellidos = apellidos;
		Sexo = sexo;
		this.correo = correo;
		this.password = password;
	}
	public Cliente() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
	
    
    
}
