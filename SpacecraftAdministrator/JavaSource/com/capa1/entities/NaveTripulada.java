package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class NaveTripulada extends Nave {

	//Atributos
	@NotNull
	private Long id_nave_tripulada;
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
	
	//Constructores
	
	public NaveTripulada() {
		super();
	}
	public NaveTripulada(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor,
			@NotNull int alto, @NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima,
			@NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible, @NotNull int tipo,
			@NotNull int peso_transporte, @NotNull Long id_nave_tripulada, @NotNull int capacidad) {
		super(nombre, peso, empuje, motor, alto, ancho, pais, velocidad_maxima, fecha_inicio, fecha_fin, combustible, tipo,
				peso_transporte);
		this.id_nave_tripulada = id_nave_tripulada;
		this.capacidad = capacidad;
	}
	
	//Metodos
	@Override
	public void setPotencia(int pot) {
		
	}
	@Override
	public void setDes(int des) {
		
	}
	@Override
	public void setCap(int cap) {
		setCapacidad(cap);
	}
}
