package com.capa2.businesslogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.capa1.entities.NaveLanzadera;
import com.capa1.entities.NaveNoTripulada;
import com.capa1.entities.NaveTripulada;
import com.capa3.persistence.dao.NaveDAO;
import com.capa3.persistence.entities.NaveLanzaderaE;
import com.capa3.persistence.entities.NaveNoTripuladaE;
import com.capa3.persistence.entities.NaveTripuladaE;
import com.capa3.persistence.exceptions.PersistenceException;

@Stateless
@LocalBean
public class GestionNaveService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//Definicion de ejb
	@EJB
	NaveDAO nDAO;
	
	//Parseo de las entidades
	public NaveLanzaderaE toNaveLanzaderaE(NaveLanzadera a) {
		NaveLanzaderaE b = new NaveLanzaderaE();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_lanzadera(a.getId_nave_lanzadera()!=null?a.getId_nave_lanzadera().longValue():null);
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setPotencia_propulsion(a.getPotencia_propulsion());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}
	public NaveLanzadera fromNaveLanzaderaE(NaveLanzaderaE a) {
		NaveLanzadera b = new NaveLanzadera();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_lanzadera(a.getId_nave_lanzadera());
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setPotencia_propulsion(a.getPotencia_propulsion());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}
	
	public NaveNoTripuladaE toNaveNoTripuladaE(NaveNoTripulada a) {
		NaveNoTripuladaE b = new NaveNoTripuladaE();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_no_tripulada(a.getId_nave_no_tripulada()!=null?a.getId_nave_no_tripulada().longValue():null);
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setDesplazamiento(a.getDesplazamiento());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}
	public NaveNoTripulada fromNaveNoTripuladaE(NaveNoTripuladaE a) {
		NaveNoTripulada b = new NaveNoTripulada();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_no_tripulada(a.getId_nave_no_tripulada());
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setDesplazamiento(a.getDesplazamiento());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}
	
	public NaveTripuladaE toNaveTripuladaE(NaveTripulada a) {
		NaveTripuladaE b = new NaveTripuladaE();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_tripulada(a.getId_nave_tripulada()!=null?a.getId_nave_tripulada().longValue():null);
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setCapacidad(a.getCapacidad());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}
	public NaveTripulada fromNaveTripuladaE(NaveTripuladaE a) {
		NaveTripulada b = new NaveTripulada();
		b.setAlto(a.getAlto());
		b.setAncho(a.getAncho());
		b.setCombustible(a.getCombustible());
		b.setEmpuje(a.getEmpuje());
		b.setFecha_fin(a.getFecha_fin());
		b.setFecha_inicio(a.getFecha_inicio());
		b.setId_nave_tripulada(a.getId_nave_tripulada());
		b.setMotor(a.getMotor());
		b.setNombre(a.getNombre());
		b.setPais(a.getPais());
		b.setPeso(a.getPeso());
		b.setCapacidad(a.getCapacidad());
		b.setTipo(a.getTipo());
		b.setVelocidad_maxima(a.getVelocidad_maxima());
		return b;
	}

	//Acciones de llamada del service
	public List<NaveTripulada> seleccionarNaveTripulada(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {

		List<NaveTripuladaE> listaNaveTripulada = nDAO.seleccionarNaveTripulada(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);

		List<NaveTripulada> listaNavesTripuladas=new ArrayList<NaveTripulada>();

		for (NaveTripuladaE naveE : listaNaveTripulada) {
			listaNavesTripuladas.add(fromNaveTripuladaE(naveE));
		}
		return listaNavesTripuladas;
		
	}
	public List<NaveNoTripulada> seleccionarNaveNoTripulada(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {

		List<NaveNoTripuladaE> listaNave = nDAO.seleccionarNaveNoTripulada(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);

		List<NaveNoTripulada> listaNaves=new ArrayList<NaveNoTripulada>();

		for (NaveNoTripuladaE naveE : listaNave) {
			listaNaves.add(fromNaveNoTripuladaE(naveE));
		}
		return listaNaves;
		
	}
	public List<NaveLanzadera> seleccionarNaveLanzadera(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {

		List<NaveLanzaderaE> listaNave = nDAO.seleccionarNaveLanzadera(criterioNombre,criterioTipo,criterioCombustible,criterioPais,criterioPeso,criterioMotor,criterioEmpuje);

		List<NaveLanzadera> listaNaves=new ArrayList<NaveLanzadera>();

		for (NaveLanzaderaE naveE : listaNave) {
			listaNaves.add(fromNaveLanzaderaE(naveE));
		}
		return listaNaves;
	}
	
	//Acciones de dada de alta del service
	public NaveTripulada agregarNaveTripulada(NaveTripulada a) {
		NaveTripuladaE b = nDAO.agregarNaveTripulada(toNaveTripuladaE(a));
		return fromNaveTripuladaE(b);
	}
	public NaveLanzadera agregarNaveLanzadera(NaveLanzadera a) {
		NaveLanzaderaE b = nDAO.agregarNaveLazadera(toNaveLanzaderaE(a));
		return fromNaveLanzaderaE(b);
	}
	public NaveNoTripulada agregarNaveNoTripulada(NaveNoTripulada a) {
		NaveNoTripuladaE b = nDAO.agregarNaveNaveNoTripulada(toNaveNoTripuladaE(a));
		return fromNaveNoTripuladaE(b);
	}

}
