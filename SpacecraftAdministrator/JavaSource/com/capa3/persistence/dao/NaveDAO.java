package com.capa3.persistence.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.capa3.persistence.entities.NaveLanzaderaE;
import com.capa3.persistence.entities.NaveNoTripuladaE;
import com.capa3.persistence.entities.NaveTripuladaE;

@Stateless
@LocalBean
public class NaveDAO {

	private EntityManager em;
	
	//Metodos para dar de alta nuevas naves
	public NaveLanzaderaE agregarNaveLazadera(NaveLanzaderaE a) {
		NaveLanzaderaE b = em.merge(a);
		em.flush();
		return b;
	}
	
	public NaveNoTripuladaE agregarNaveNaveNoTripulada(NaveNoTripuladaE a) {
		NaveNoTripuladaE b = em.merge(a);
		em.flush();
		return b;
	}
	
	public NaveTripuladaE agregarNaveTripulada(NaveTripuladaE a) {
		NaveTripuladaE b = em.merge(a);
		em.flush();
		return b;
	}
	
	//Metodos para visualizar las naves
	public List<NaveTripuladaE> seleccionarNaveTripulada(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {
		try {
			
			String query= 	"Select u from NaveTripuladaE u";
			String queryCriterio="";
			if (criterioNombre!=null && ! criterioNombre.contentEquals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+ " lower(u.nombre) like '%"+criterioNombre.toLowerCase() +"%' ";
			} 
			if (criterioTipo!=null && ! criterioTipo.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.tipo='"+criterioTipo+"'  " ;
			}
			if (criterioCombustible!=null && ! criterioCombustible.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.combustible='"+criterioCombustible+"'  " ;
			}
			if (criterioPais!=null && ! criterioPais.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.pais='"+criterioPais+"'  " ;
			}
			if (criterioPeso!=null && ! criterioPeso.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.peso='"+criterioPeso+"'  " ;
			}
			if (criterioMotor!=null && ! criterioMotor.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.motor='"+criterioMotor+"'  " ;
			}
			if (criterioEmpuje!=null && ! criterioEmpuje.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.empuje='"+criterioEmpuje+"'  " ;
			}
			if (!queryCriterio.contentEquals("")) {
				query+=" where "+queryCriterio;
			}
			List<NaveTripuladaE> resultList = (List<NaveTripuladaE>) em.createQuery(query,NaveTripuladaE.class)
								 .getResultList();
				return  resultList;
		}catch(PersistenceException e) {
			throw new PersistenceException("No se pudo hacer la consulta." + e.getMessage(),e);
		}
	}
	public List<NaveNoTripuladaE> seleccionarNaveNoTripulada(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {
		try {
			
			String query= 	"Select u from NaveNoTripuladaE u";
			String queryCriterio="";
			if (criterioNombre!=null && ! criterioNombre.contentEquals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+ " lower(u.nombre) like '%"+criterioNombre.toLowerCase() +"%' ";
			} 
			if (criterioTipo!=null && ! criterioTipo.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.tipo='"+criterioTipo+"'  " ;
			}
			if (criterioCombustible!=null && ! criterioCombustible.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.combustible='"+criterioCombustible+"'  " ;
			}
			if (criterioPais!=null && ! criterioPais.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.pais='"+criterioPais+"'  " ;
			}
			if (criterioPeso!=null && ! criterioPeso.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.peso='"+criterioPeso+"'  " ;
			}
			if (criterioMotor!=null && ! criterioMotor.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.motor='"+criterioMotor+"'  " ;
			}
			if (criterioEmpuje!=null && ! criterioEmpuje.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.empuje='"+criterioEmpuje+"'  " ;
			}
			if (!queryCriterio.contentEquals("")) {
				query+=" where "+queryCriterio;
			}
			List<NaveNoTripuladaE> resultList = (List<NaveNoTripuladaE>) em.createQuery(query,NaveNoTripuladaE.class)
								 .getResultList();
				return  resultList;
		}catch(PersistenceException e) {
			throw new PersistenceException("No se pudo hacer la consulta." + e.getMessage(),e);
		}
	}
	public List<NaveLanzaderaE> seleccionarNaveLanzadera(String criterioNombre,String criterioTipo, String criterioCombustible, 
			String criterioPais, String criterioPeso, String criterioMotor, String criterioEmpuje) throws PersistenceException {
		try {
			
			String query= 	"Select u from NaveLanzaderaE u";
			String queryCriterio="";
			if (criterioNombre!=null && ! criterioNombre.contentEquals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+ " lower(u.nombre) like '%"+criterioNombre.toLowerCase() +"%' ";
			} 
			if (criterioTipo!=null && ! criterioTipo.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.tipo='"+criterioTipo+"'  " ;
			}
			if (criterioCombustible!=null && ! criterioCombustible.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.combustible='"+criterioCombustible+"'  " ;
			}
			if (criterioPais!=null && ! criterioPais.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.pais='"+criterioPais+"'  " ;
			}
			if (criterioPeso!=null && ! criterioPeso.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.peso='"+criterioPeso+"'  " ;
			}
			if (criterioMotor!=null && ! criterioMotor.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.motor='"+criterioMotor+"'  " ;
			}
			if (criterioEmpuje!=null && ! criterioEmpuje.equals("")) {
				queryCriterio+=(!queryCriterio.isEmpty()?" and ":"")+" u.empuje='"+criterioEmpuje+"'  " ;
			}
			if (!queryCriterio.contentEquals("")) {
				query+=" where "+queryCriterio;
			}
			List<NaveLanzaderaE> resultList = (List<NaveLanzaderaE>) em.createQuery(query,NaveLanzaderaE.class)
								 .getResultList();
				return  resultList;
		}catch(PersistenceException e) {
			throw new PersistenceException("No se pudo hacer la consulta." + e.getMessage(),e);
		}
	}
}
