package com.curso.spring.persistencia.dao.hibernate;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.curso.spring.persistencia.dao.PersonaDao;
import com.curso.spring.persistencia.entidades.Persona;

@Repository
public class HibernatePersonaDao extends HibernateDao implements PersonaDao {
	
	/* (non-Javadoc)
	 * @see com.curso.spring.persistencia.dao.PersonaDao#insertarPersona(com.curso.spring.persistencia.entidades.Persona)
	 */
	@Override
	public void insertarPersona(Persona persona){
		//Lo instancia el TransactionManager
		Session session = sf.getCurrentSession();
		
		session.persist(persona);//Hibernate se encarga de construir la consulta de INSERT
		session.flush();
	}
	
}
