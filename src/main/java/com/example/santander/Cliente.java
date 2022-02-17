package com.example.santander;

import com.example.santander.model.ClienteModel;
import com.example.santander.model.ListaClientes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {

    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente");
        ClienteModel cliente = new ClienteModel();
        cliente.setNome(nomeCliente);

        listaClientes.adiciona(cliente);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("clienteCadastrado.jsp");
        request.setAttribute("cliente", cliente.getNome());
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ClienteModel> clientes = listaClientes.buscaClientes();

        request.setAttribute("clientes", clientes);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaClientes.jsp");
        requestDispatcher.forward(request, response);

    }

}
