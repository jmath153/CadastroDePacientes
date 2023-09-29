package controllers;

import entidades.Tratamentos;
import janelas.TelaListaDeTratamentos;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SistemaCadastrarController implements ActionListener {

    private SistemaGerenciadorDoSus sistema;
    private JFrame janela;

    public SistemaCadastrarController (SistemaGerenciadorDoSus sistema,JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(janela,"Para começar informe alguns dados pessoais do paciente");
        String nome =  JOptionPane.showInputDialog(janela,"Informe o nome do paciente: ");
        String cpf =  JOptionPane.showInputDialog(janela,"Informe o CPF do paciente: ");
        String rg =  JOptionPane.showInputDialog(janela,"Informe o RG do paciente: ");
        String dataNasc =  JOptionPane.showInputDialog(janela,"Informe a Data de nascimento do paciente: ");
        String email =  JOptionPane.showInputDialog(janela,"Informe o Email do paciente: ");
        String telefone =  JOptionPane.showInputDialog(janela,"Informe o Telefone do paciente: ");
        JOptionPane.showMessageDialog(janela,"Estamos quase finalizando, preciso de algumas informações de endereço");
        String rua =  JOptionPane.showInputDialog(janela,"Informe o nome da rua do paciente: ");
        String bairro =  JOptionPane.showInputDialog(janela,"Informe bairro do paciente: ");
        String cidade =  JOptionPane.showInputDialog(janela,"Informe a cidade  do paciente: ");
        String estado =  JOptionPane.showInputDialog(janela,"Informe o estado do paciente: ");
        JOptionPane.showMessageDialog(janela,"Por último, selecione quais tratamentos serão realizados");

        class controllerLista implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }

       // sistema.salvarDados();
    }
}
