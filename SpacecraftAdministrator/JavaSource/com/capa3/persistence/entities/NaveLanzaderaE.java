package com.capa3.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name =  "NAVES_LANZADERAS")
public class NaveLanzaderaE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLanz")
	@SequenceGenerator(name="seqLanz", sequenceName = "SEQ_ID_NAVES")
	private Long id_nave_lanzadera;
	private int potencia_propulsion;
	@Column(unique=true)
	private String nombre;
	private int peso;
	private int peso_transporte;
	private int empuje;
	private int motor;
	private int alto;
	private int ancho;
	private String pais;
	private int velocidad_maxima;
	private Date fecha_inicio;
	private Date fecha_fin;
	private String combustible;
	private int tipo;
	
	//Constructores
	public NaveLanzaderaE() {
		super();
	}
	public NaveLanzaderaE(int potencia_propulsion, String nombre, int peso, int peso_transporte, int empuje, int motor,
			int alto, int ancho, String pais, int velocidad_maxima, Date fecha_inicio, Date fecha_fin,
			String combustible, int tipo) {
		super();
		this.potencia_propulsion = potencia_propulsion;
		this.nombre = nombre;
		this.peso = peso;
		this.peso_transporte = peso_transporte;
		this.empuje = empuje;
		this.motor = motor;
		this.alto = alto;
		this.ancho = ancho;
		this.pais = pais;
		this.velocidad_maxima = velocidad_maxima;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.combustible = combustible;
		this.tipo = tipo;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEmpuje() {
		return empuje;
	}
	public void setEmpuje(int empuje) {
		this.empuje = empuje;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
	this.alto = alto;
		}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getVelocidad_maxima() {
		return velocidad_maxima;
	}
	public void setVelocidad_maxima(int velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
			return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
		}
	public Long getId_nave_lanzadera() {
		return id_nave_lanzadera;
	}
	public void setId_nave_lanzadera(Long id_nave_lanzadera) {
		this.id_nave_lanzadera = id_nave_lanzadera;
	}
	public int getPotencia_propulsion() {
		return potencia_propulsion;
	}
	public void setPotencia_propulsion(int potencia_propulsion) {
		this.potencia_propulsion = potencia_propulsion;
	}
	public int getPeso_transporte() {
		return peso_transporte;
	}

	public void setPeso_transporte(int peso_transporte) {
		this.peso_transporte = peso_transporte;
	}

}
