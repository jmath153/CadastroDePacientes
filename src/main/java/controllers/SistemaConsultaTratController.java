package controllers;

import entidades.Paciente;
import entidades.Tratamentos;
import excecoes.PacienteJaCadastradoException;
import janelas.TelaListaDeTratamentos;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class SistemaConsultaTratController implements ActionListener {
    private SistemaGerenciadorDoSus sistema;
    private JFrame janela;

    public SistemaConsultaTratController (SistemaGerenciadorDoSus sistema,JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){

        TelaListaDeTratamentos telaTrat = new TelaListaDeTratamentos();
        telaTrat.setTitle("Selecione os tratamentos que deseja buscar:");

        telaTrat.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                List<Tratamentos> t = telaTrat.getTratSelecionados();
                System.out.println(t.get(0 ));
                String pacientesTratandoDe = "";
                for(Paciente p : sistema.getPacientes().values()){
                    System.out.println(p.getNome() );
                    if(p.getTratamento().containsAll(t)){
                        pacientesTratandoDe+=(p.getNome())+"\n";
                    }
                }
                JOptionPane.showMessageDialog(janela,pacientesTratandoDe);
            }
        });
    }
}
