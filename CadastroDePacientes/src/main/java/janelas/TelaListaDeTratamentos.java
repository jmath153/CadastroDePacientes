package janelas;


import controllers.SistemaCadastrarController;
import entidades.Tratamentos;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TelaListaDeTratamentos extends JFrame {

    private Tratamentos[] tratamentos = {Tratamentos.CARDIOVASCULAR,Tratamentos.MUSCULAR,Tratamentos.OFTALMO,Tratamentos.NEUROLOGICO,Tratamentos.PEDIATRIA,Tratamentos.PSICOLOGICO};
    private JList lista = new JList(tratamentos);

    private ArrayList<Tratamentos> tratSelecionados = new ArrayList<>();
    Button botaoOk = new Button("ok");
    public TelaListaDeTratamentos(){
        configurarFrame();
        add(BorderLayout.NORTH,lista);
        add(BorderLayout.CENTER,botaoOk);
        lista.setVisibleRowCount(6);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        /*botaoOk.addActionListener(e->{
            for(Object o : lista.getSelectedValues()){
                tratSelecionados.add((Tratamentos) o);
            }
            this.setVisible(false);
        });
        */


    }
    public void configurarFrame(){

        setTitle("Selecione os tratamentos");
        setSize(350,250);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        botaoOk.setSize(100,100);
    }

    public ArrayList<Tratamentos> getTratSelecionados() {
        return tratSelecionados;
    }

    public static void main(String[] args) {
        TelaListaDeTratamentos tela = new TelaListaDeTratamentos();
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
