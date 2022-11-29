package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class NaveLanzadera extends Nave{
	
	//Atributos
	@NotNull
	private Long id_nave_lanzadera;
	@NotNull
	private int potencia_propulsion;
	
	//Constructores
	public NaveLanzadera() {
		super();
	}
	
	
	public NaveLanzadera(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor,
			@NotNull int alto, @NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima,
			@NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible, @NotNull int tipo,
			@NotNull int peso_transporte, Long id_nave_lanzadera, int potencia_propulsion) {
		super(nombre, peso, empuje, motor, alto, ancho, pais, velocidad_maxima, fecha_inicio, fecha_fin, combustible, tipo,
				peso_transporte);
		this.id_nave_lanzadera = id_nave_lanzadera;
		this.potencia_propulsion = potencia_propulsion;
	}


	//Getters y setters
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
	
	//Metodos
	@Override
	public void setPotencia(int pot) {
		setPotencia_propulsion(pot);
	}
	@Override
	public void setDes(int des) {
		
	}
	@Override
	public void setCap(int cap) {
		
	}
	
	
}
