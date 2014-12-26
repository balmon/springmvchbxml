package com.balmon.SpringMvcHbXml.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.balmon.SpringMvcHbXml.dao.IAlumnoDao;
import com.balmon.SpringMvcHbXml.model.Alumnos;

@Controller
public class HomeController {
     
    @Autowired
    private IAlumnoDao alumnoDao;
     
    @RequestMapping(value="/")
    public ModelAndView home() {
        List<Alumnos> listAlumnos = alumnoDao.list();
        System.out.println("por aqui: "+ listAlumnos.size());
        ModelAndView model = new ModelAndView("home");
        model.addObject("alumnosList", listAlumnos);
        return model;
    }
}
