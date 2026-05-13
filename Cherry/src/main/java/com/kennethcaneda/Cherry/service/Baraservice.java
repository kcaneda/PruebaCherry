package com.kennethcaneda.Cherry.service;

import java.util.List;

public interface Baraservice {
    List<Clientes> listar();
    Clientes crear(Clientes cliente);
    Clientes actualizar(Long id, Clientes cliente);
    Clientes buscarPorId(Long id);
    void eliminar(Long id);
}
