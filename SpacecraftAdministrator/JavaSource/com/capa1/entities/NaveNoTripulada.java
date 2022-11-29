package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class NaveNoTripulada extends Nave{

	//Atributos
	@NotNull
	private Long id_nave_no_tripulada;
	@NotNull
	private int desplazamiento;
	
	//Constructores
	public NaveNoTripulada() {
		super();
	}
	public NaveNoTripulada(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor,
			@NotNull int alto, @NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima,
			@NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible, @NotNull int tipo,
			@NotNull int peso_transporte, @NotNull Long id_nave_no_tripulada, @NotNull int desplazamiento) {
		super(nombre, peso, empuje, motor, alto, ancho, pais, velocidad_maxima, fecha_inicio, fecha_fin, combustible, tipo,
				peso_transporte);
		this.id_nave_no_tripulada = id_nave_no_tripulada;
		this.desplazamiento = desplazamiento;
	}


	//Getters y setters
	public Long getId_nave_no_tripulada() {
		return id_nave_no_tripulada;
	}
	public void setId_nave_no_tripulada(Long id_nave_no_tripulada) {
		this.id_nave_no_tripulada = id_nave_no_tripulada;
	}
	public int getDesplazamiento() {
		return desplazamiento;
	}
	public void setDesplazamiento(int desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
	
	//Metodos
	@Override
	public void setPotencia(int pot) {
		
	}
	@Override
	public void setDes(int des) {
		setDesplazamiento(des);
	}
	@Override
	public void setCap(int cap) {
		
	}
}
