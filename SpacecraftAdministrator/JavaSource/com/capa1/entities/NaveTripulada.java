package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class NaveTripulada {

	//Atributos
	@NotNull
	private Long id_nave_tripulada;
	@NotNull
	private String nombre;
	@NotNull
	private int peso;
	@NotNull
	private int empuje;
	@NotNull
	private int motor;
	@NotNull
	private int alto;
	@NotNull
	private int ancho;
	@NotNull
	private String pais;
	@NotNull
	private int velocidad_maxima;
	@NotNull
	private Date fecha_inicio;
	private Date fecha_fin;
	@NotNull
	private String combustible;
	@NotNull
	private int tipo;
	@NotNull
	private int capacidad;
	
	//Getters y setters
	public Long getId_nave_tripulada() {
		return id_nave_tripulada;
	}
	public void setId_nave_tripulada(Long id_nave_tripulada) {
		this.id_nave_tripulada = id_nave_tripulada;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
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
	
	//Constructores
		public NaveTripulada() {
			super();
		}
	public NaveTripulada(@NotNull Long id_nave_tripulada, @NotNull String nombre, @NotNull int peso,
			@NotNull int empuje, @NotNull int motor, @NotNull int alto, @NotNull int ancho, @NotNull String pais,
			@NotNull int velocidad_maxima, @NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible,
			@NotNull int tipo, int capacidad) {
		super();
		this.id_nave_tripulada = id_nave_tripulada;
		this.nombre = nombre;
		this.peso = peso;
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
		this.capacidad = capacidad;
	}
}
