package com.balmon.SpringMvcHbXml.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.balmon.SpringMvcHbXml.model.Alumnos;

public class AlumnoDao implements IAlumnoDao {
	private SessionFactory sessionFactory;
	
	
	public AlumnoDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	@Transactional
	public List<Alumnos> list() {
		@SuppressWarnings("unchecked")
        List<Alumnos> listAlumnos = (List<Alumnos>) sessionFactory.getCurrentSession()
                .createCriteria(Alumnos.class).list();
                //.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("AlumnoDao.list: "+listAlumnos.size());
        return listAlumnos;
	}

}
