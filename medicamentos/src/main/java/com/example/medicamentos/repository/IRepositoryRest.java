package com.example.medicamentos.repository;

public interface IRepositoryRest<T> {
    public T guardar(T t);
    public T actualizar(T t);
    public String eliminar(Integer param);
    public T buscar(Integer param);
}
