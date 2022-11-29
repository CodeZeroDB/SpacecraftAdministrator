package com.capa1.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class NaveLanzadera extends Nave{
	
	//Atributos
	@NotNull
	private Long id_nave_lanzadera;
	@NotNull
	private int potencia_propulcion;
	
	//Constructores
	public NaveLanzadera() {
		super();
	}
	public NaveLanzadera(@NotNull String nombre, @NotNull int peso, @NotNull int empuje, @NotNull int motor,
			@NotNull int alto, @NotNull int ancho, @NotNull String pais, @NotNull int velocidad_maxima,
			@NotNull Date fecha_inicio, Date fecha_fin, @NotNull String combustible, @NotNull int tipo,
			@NotNull Long id_nave_lanzadera, @NotNull int potencia_propulcion) {
		super(nombre, peso, empuje, motor, alto, ancho, pais, velocidad_maxima, fecha_inicio, fecha_fin, combustible, tipo);
		this.id_nave_lanzadera = id_nave_lanzadera;
		this.potencia_propulcion = potencia_propulcion;
	}
	
	//Getters y setters
	public Long getId_nave_lanzadera() {
		return id_nave_lanzadera;
	}
	public void setId_nave_lanzadera(Long id_nave_lanzadera) {
		this.id_nave_lanzadera = id_nave_lanzadera;
	}
	public int getPotencia_propulcion() {
		return potencia_propulcion;
	}
	public void setPotencia_propulcion(int potencia_propulcion) {
		this.potencia_propulcion = potencia_propulcion;
	}

	//Metodos
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
