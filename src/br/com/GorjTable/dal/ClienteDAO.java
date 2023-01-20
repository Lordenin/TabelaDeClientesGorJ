/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.GorjTable.dal;

import Beans.Clientesgorj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jarvis
 */
public class ClienteDAO {

    public Clientesgorj getClientes(int id) {
        String sqla = "SELECT * FROM clientesgorj WHERE id = ?";
        try {
            PreparedStatement stmt = ConnectionModule.conector().prepareStatement(sqla);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Clientesgorj clientesgorj = new Clientesgorj();

            rs.first();
            clientesgorj.setId(id);
            clientesgorj.setNome(rs.getString("nome"));
            clientesgorj.setComercio(rs.getString("comercio"));
            clientesgorj.setCidade(rs.getString("cidade"));
            clientesgorj.setEndereco(rs.getString("endereco"));
            clientesgorj.setCnpj(rs.getString("cnpj"));
            clientesgorj.setStatus_cl(rs.getString("status_cl"));
            clientesgorj.setTelefone(rs.getString("telefone"));
            return clientesgorj;

        } catch (Exception e) {
            return null;
        }
    }

    public List<Clientesgorj> getClientes() {
        String sql = "SELECT * FROM clientesgorj";
        try {
            PreparedStatement stmt = ConnectionModule.conector().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Clientesgorj> listaclientes = new ArrayList<>();

            while (rs.next()) {
                Clientesgorj clientesgorj = new Clientesgorj();
                clientesgorj.setId(rs.getInt("Id"));
                clientesgorj.setNome(rs.getString("nome"));
                clientesgorj.setComercio(rs.getString("comercio"));
                clientesgorj.setCidade(rs.getString("cidade"));
                clientesgorj.setEndereco(rs.getString("endereco"));
                clientesgorj.setCnpj(rs.getString("cnpj"));
                clientesgorj.setStatus_cl(rs.getString("status_cl"));
                clientesgorj.setTelefone(rs.getString("telefone"));
                listaclientes.add(clientesgorj);
            }
            return listaclientes;

        } catch (Exception e) {
            return null;
        }
    }

}
//id, nome, comercio, cidade, endereco, cnpj(int) status_cl, telefone(int)
