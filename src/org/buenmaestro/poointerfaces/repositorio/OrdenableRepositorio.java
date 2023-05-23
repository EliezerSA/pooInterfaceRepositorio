package org.buenmaestro.poointerfaces.repositorio;

import org.buenmaestro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
