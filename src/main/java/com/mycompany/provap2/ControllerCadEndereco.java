/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provap2;


import com.mycompany.provap2.backend.Endereco;
import com.mycompany.provap2.backend.MenuBack;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author marin
 */
public class ControllerCadEndereco {
    
    @FXML
    public TextField txtRua;
    
    @FXML
    public TextField txtNumero;
    
    @FXML
    public TextField txtBairro;
    
    @FXML
    public TextField txtCidade;
    
    @FXML
    public TextField txtEstado;
    
    @FXML
    public TextField txtCep;
    
    @FXML
    public void SalvarEndereco() {
        try {
        String rua = txtRua.getText();
        String numero = txtNumero.getText();
        int numeroI = Integer.parseInt(numero);
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        String cep = txtCep.getText();
        int cepI = Integer.parseInt(cep);
        
         Endereco endereco = new Endereco(rua, numeroI, bairro, cidade, estado, cepI);
    
         // Adiciona o endereço à lista de endereços na tela Menu
         MenuBack.adicionarEndereco(endereco);
         javax.swing.JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");
     }catch(NumberFormatException exs) {
         javax.swing.JOptionPane.showMessageDialog(null, "o campo de cep e número não podem ser vazios");
     }catch(IllegalArgumentException exs) {
         javax.swing.JOptionPane.showMessageDialog(null, "o campo de Rua não pode ser vazio");
     }catch(Exception exs) {
         exs.getMessage();
     }
    }
}
