package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public abstract class Nave {

	//Atributos
	@NotNull
	protected String nombre;
	@NotNull
	protected int peso;
	@NotNull
	protected int empuje;
	@NotNull
	protected int motor;
	@NotNull
	protected int alto;
	@NotNull
	protected int ancho;
	@NotNull
	protected String pais;
	@NotNull
	protected int velocidad_maxima;
	@NotNull
	protected Date fecha_inicio;
	protected Date fecha_fin;
	@NotNull
	protected String combustible;
	@NotNull
	protected int tipo;
	@NotNull
	protected int peso_transporte;
	
	public Nave() {
	}
	
	//Costructor
	public Nave(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor, @NotNull int alto,
			@NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima, @NotNull Date fecha_inicio,
			Date fecha_fin, @NotNull String combustible, @NotNull int tipo, @NotNull int peso_transporte) {
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
		this.peso_transporte = peso_transporte;
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
	
	public int getPeso_transporte() {
		return peso_transporte;
	}

	public void setPeso_transporte(int peso_transporte) {
		this.peso_transporte = peso_transporte;
	}

	//Metodos abstractos
	protected abstract void setPotencia(int pot);
	protected abstract void setDes(int des);
	protected abstract void setCap(int cap);
	
}
