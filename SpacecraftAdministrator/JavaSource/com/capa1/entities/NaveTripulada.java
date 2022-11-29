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
	public NaveTripulada(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor,
			@NotNull int alto, @NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima,
			@NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible, @NotNull int tipo,
			@NotNull Long id_nave_tripulada, @NotNull int capacidad) {
		super(nombre, peso, empuje, motor, alto, ancho, pais, velocidad_maxima, fecha_inicio, fecha_fin, combustible, tipo);
		this.id_nave_tripulada = id_nave_tripulada;
		this.capacidad = capacidad;
	}
	public NaveTripulada() {
		super();
	}
	@Override
	protected String getTIPO() {
		String nomTipo = "";
		if (this.tipo==1) {
			nomTipo = "Lanzadera";
		}else if (this.tipo==2) {
			nomTipo = "No tripulada";
		}else if (this.tipo==3) {
			nomTipo = "Tripulada";
		}
		return nomTipo;
	}
}
