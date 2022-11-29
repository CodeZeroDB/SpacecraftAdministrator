package com.capa0.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.capa1.entities.Nave;
import com.capa1.entities.NaveLanzadera;
import com.capa1.entities.NaveNoTripulada;
import com.capa1.entities.NaveTripulada;
import com.capa2.businesslogic.GestionNaveService;

@Named(value="gestionNave")
@SessionScoped
public class GestionNaveBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@EJB
	GestionNaveService gns;
	
	private Nave naveSeleccionada;
	private String tipo;
	private int des;
	private int pot;
	private int cap;
	private int pesoTr;
	private NaveLanzadera a;
	private NaveTripulada c;
	private NaveNoTripulada b;
	
	@PostConstruct
	public void init() {
	}
	
	public GestionNaveBean() {
		super();
	}
	
	//Accion que se ejecuta antes de desplegar la vista
	public void preRenderViewListener() {
		if (tipo == null) {
			tipo = new String();
		}
		if (tipo.equals("Lanzadera")) {
			naveSeleccionada = new NaveLanzadera();
			a = new NaveLanzadera();
			a = (NaveLanzadera) naveSeleccionada;
		}else if (tipo.equals("No tripulada")) {
			naveSeleccionada = new NaveNoTripulada();
			b = new NaveNoTripulada();
			b = (NaveNoTripulada) naveSeleccionada;
		} else if (tipo.equals("Tripulada")) {
			naveSeleccionada = new NaveTripulada();
			c = new NaveTripulada();
			c = (NaveTripulada) naveSeleccionada;
		}
	}
	
	//Acciones principales
	public String salvarCambios() {
		if (tipo.equals("Lanzadera")) {
			a.setCap(cap);
			gns.agregarNaveLanzadera(a);
		}else if (tipo.equals("No tripulada")) {
			b.setDes(des);
			gns.agregarNaveNoTripulada(b);
		} else if (tipo.equals("Tripulada")) {
			c.setCap(cap);
			gns.agregarNaveTripulada(c);
		}
		return "";
	}
	
	//Getters y setters
	public Nave getNaveSeleccionada() {
		return naveSeleccionada;
	}

	public void setNaveSeleccionada(Nave naveSeleccionada) {
		this.naveSeleccionada = naveSeleccionada;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDes() {
		return des;
	}

	public void setDes(int des) {
		this.des = des;
	}

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}
	
	public int getPesoTr() {
		return pesoTr;
	}

	public void setPesoTr(int pesoTr) {
		this.pesoTr = pesoTr;
	}
	
}
