package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private  static List<ClienteModel> clientes = new ArrayList<>();

    public void adiciona(ClienteModel clienteModel){
        ListaClientes.clientes.add(clienteModel);
    }

    public List<ClienteModel> buscaClientes(){
        return ListaClientes.clientes;
    }
}
