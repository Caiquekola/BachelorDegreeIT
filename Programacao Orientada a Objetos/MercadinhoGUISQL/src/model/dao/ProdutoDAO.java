/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.dao;

import connection.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
    //CRUD, Create, Read, Update, Delete
    
        public void create(Produto p) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try {
                stmt = con.prepareStatement("INSERT INTO produto (descricao,qtd,valor,categoria_id)VALUES(?,?,?,?)");
                stmt.setString(1, p.getDescricao());
                stmt.setInt(2, p.getQtd());
                stmt.setDouble(3, p.getPreco());
                stmt.setInt(4, 2);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao salvar!"+ex);
            }finally{
                ConnectionFactory.closeConnection(con,stmt);
            }
            
        }
        
        public List<Produto> read(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Produto> produtos = new ArrayList<>();
            
            try {
                stmt = con.prepareStatement("SELECT * from produto");
                rs = stmt.executeQuery();
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setQtd(rs.getInt("qtd"));
                    produto.setPreco(rs.getDouble("valor"));
                    produto.setCategoriaId(rs.getInt("categoria_id"));
                    produtos.add(produto);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return produtos;
            
        }
        public void update(Produto p) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try {
                stmt = con.prepareStatement("UPDATE produto SET descricao = ?, qtd = ?, valor = ? WHERE id = ?");
                stmt.setString(1, p.getDescricao());
                stmt.setInt(2, p.getQtd());
                stmt.setDouble(3, p.getPreco());
                stmt.setInt(4, p.getId());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao atualizar!"+ex);
            }finally{
                ConnectionFactory.closeConnection(con,stmt);
            }
            
        }
        public void delete(Produto p) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try {
                stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
                stmt.setInt(1, p.getId());
                
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Excluído com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir!"+ex);
            }finally{
                ConnectionFactory.closeConnection(con,stmt);
            }
            
        }
        
}
