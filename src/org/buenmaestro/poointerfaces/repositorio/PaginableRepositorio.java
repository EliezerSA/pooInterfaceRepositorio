package org.buenmaestro.poointerfaces.repositorio;

import org.buenmaestro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
