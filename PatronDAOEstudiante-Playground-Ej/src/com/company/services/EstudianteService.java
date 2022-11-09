package com.company.services;

import com.company.daos.IDao;
import com.company.entities.Estudiante;

import java.util.List;

public class EstudianteService {

    private IDao<Estudiante> estudianteIDao;

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e){
        //delegar la responsabilidad de guardar al DAO -pasamanos
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id){
        //delegar la responsabilidad de eliminar al DAO -pasamanos
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        //delegar la responsabilidad de buscarEstudiante al DAO -pasamanos
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        //delegar la responsabilidad de buscarTodos al DAO -pasamanos
        return estudianteIDao.buscarTodos();
    }




}
