package com.capa0.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.capa1.entities.Nave;
import com.capa1.entities.NaveLanzadera;
import com.capa1.entities.NaveNoTripulada;
import com.capa1.entities.NaveTripulada;
import com.capa2.businesslogic.GestionNaveService;
import com.capa3.persistence.exceptions.PersistenceException;


@Named(value="gestionNaves")
@SessionScoped
public class GestionNavesBean implements Serializable{


	private static final long serialVersionUID = 1L;

	@EJB
	GestionNaveService gns;
	
	private List<Nave> navesSeleccionadas;
	private List<NaveLanzadera> navesLanzaderasSeleccionadas;
	private List<NaveTripulada> navesTripuladasSeleccionadas;
	private List<NaveNoTripulada> navesNoTripuladasSeleccionadas;
	private String criterioNombre;
	private String criterioTipo;
	private String criterioCombustible;
	private String criterioPais;
	private String criterioPeso;
	private String criterioMotor;
	private String criterioEmpuje;
	
	public GestionNavesBean() {
		super();
	}
	
	//Acciones
	public String seleccionarNaves() throws PersistenceException {
		navesLanzaderasSeleccionadas = gns.seleccionarNaveLanzadera(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);
		navesNoTripuladasSeleccionadas = gns.seleccionarNaveNoTripulada(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);
		navesTripuladasSeleccionadas = gns.seleccionarNaveTripulada(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);
		navesSeleccionadas = new ArrayList<>();
		navesSeleccionadas.add((Nave) navesLanzaderasSeleccionadas);
		navesSeleccionadas.add((Nave) navesNoTripuladasSeleccionadas);
		navesSeleccionadas.add((Nave) navesTripuladasSeleccionadas);
		return "";
	}
	public String verDatosNave() {
		return "DatosNave";
	}

	//Getters y setters
	public List<Nave> getNavesSeleccionadas() {
		return navesSeleccionadas;
	}

	public void setNavesSeleccionadas(List<Nave> navesSeleccionadas) {
		this.navesSeleccionadas = navesSeleccionadas;
	}

	public List<NaveLanzadera> getNavesLanzaderasSeleccionadas() {
		return navesLanzaderasSeleccionadas;
	}

	public void setNavesLanzaderasSeleccionadas(List<NaveLanzadera> navesLanzaderasSeleccionadas) {
		this.navesLanzaderasSeleccionadas = navesLanzaderasSeleccionadas;
	}

	public List<NaveTripulada> getNavesTripuladasSeleccionadas() {
		return navesTripuladasSeleccionadas;
	}

	public void setNavesTripuladasSeleccionadas(List<NaveTripulada> navesTripuladasSeleccionadas) {
		this.navesTripuladasSeleccionadas = navesTripuladasSeleccionadas;
	}

	public List<NaveNoTripulada> getNavesNoTripuladasSeleccionadas() {
		return navesNoTripuladasSeleccionadas;
	}

	public void setNavesNoTripuladasSeleccionadas(List<NaveNoTripulada> navesNoTripuladasSeleccionadas) {
		this.navesNoTripuladasSeleccionadas = navesNoTripuladasSeleccionadas;
	}

	public String getCriterioNombre() {
		return criterioNombre;
	}

	public void setCriterioNombre(String criterioNombre) {
		this.criterioNombre = criterioNombre;
	}

	public String getCriterioTipo() {
		return criterioTipo;
	}

	public void setCriterioTipo(String criterioTipo) {
		this.criterioTipo = criterioTipo;
	}

	public String getCriterioCombustible() {
		return criterioCombustible;
	}

	public void setCriterioCombustible(String criterioCombustible) {
		this.criterioCombustible = criterioCombustible;
	}

	public String getCriterioPais() {
		return criterioPais;
	}

	public void setCriterioPais(String criterioPais) {
		this.criterioPais = criterioPais;
	}

	public String getCriterioPeso() {
		return criterioPeso;
	}

	public void setCriterioPeso(String criterioPeso) {
		this.criterioPeso = criterioPeso;
	}

	public String getCriterioMotor() {
		return criterioMotor;
	}

	public void setCriterioMotor(String criterioMotor) {
		this.criterioMotor = criterioMotor;
	}

	public String getCriterioEmpuje() {
		return criterioEmpuje;
	}

	public void setCriterioEmpuje(String criterioEmpuje) {
		this.criterioEmpuje = criterioEmpuje;
	}
	
}
