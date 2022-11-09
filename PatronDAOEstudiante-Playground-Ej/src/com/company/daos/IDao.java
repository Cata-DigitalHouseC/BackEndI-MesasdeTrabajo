package com.company.daos;

import java.util.List;

public interface IDao <T> { //T -> generics, puedo traer cualquier tipo de clase y trabajarla en la interfaz

    public T guardar(T t);
    public void eliminar(Long id);
    public T buscar(Long id);
    public List<T> buscarTodos();




}
