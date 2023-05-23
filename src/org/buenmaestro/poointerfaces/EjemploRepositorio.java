package org.buenmaestro.poointerfaces;

import org.buenmaestro.poointerfaces.modelo.Cliente;
import org.buenmaestro.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Ezequiel","Sanchez"));
        repo.crear(new Cliente("Nahum", "Badillo"));
        repo.crear(new Cliente("Pedro", "Castro"));
        repo.crear(new Cliente("Marcos", "Hernandez"));


        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("========= paginable =========");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);


        System.out.println("======= Ordenar =========");
        List<Cliente> clienteOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
        for (Cliente c: clienteOrdenAsc){
            System.out.println(c);
        }


        System.out.println("======= editar ========");
        Cliente peActulizar = new Cliente("Pedro","Jimenez");
        peActulizar.setId(3);
        repo.editar(peActulizar);
        Cliente pe = repo.porId(3);
        System.out.println(pe);
    }

}
