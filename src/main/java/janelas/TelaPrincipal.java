package janelas;

import controllers.SistemaCadastrarController;
import controllers.SistemaConsultaController;
import controllers.SistemaConsultaTratController;
import controllers.SistemaRemoverController;
import sistema.SistemaGerenciadorDoSus;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    JLabel linha1, linha2;
    ImageIcon susImg = new ImageIcon("CadastroDePacientes/imagens/sus.png");

    ImageIcon addImg = new ImageIcon("CadastroDePacientes/imagens/addIcon.png");
    ImageIcon removeImg = new ImageIcon("CadastroDePacientes/imagens/removerIcon.png");
    ImageIcon pesqImg = new ImageIcon("CadastroDePacientes/imagens/pesquisarIcon.png");
    ImageIcon pesqTrarImg = new ImageIcon("CadastroDePacientes/imagens/pesquisarTratIcon.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover,botaoPesquisarTratamento;
    SistemaGerenciadorDoSus sistema = new SistemaGerenciadorDoSus();

    public TelaPrincipal(){
        getContentPane().setLayout(new FlowLayout());
        setTitle("Agenda de Aniversários");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);

      // getContentPane().setLayout(new FlowLayout());

        JPanel pan = new JPanel();
        pan.setPreferredSize(new Dimension(500,400));
        pan.setBackground(Color.BLUE);
        pan.setLayout(new GridLayout(2,3,7,7));
        pan.setVisible(true);


        linha1 = new JLabel("SISTEMA DE CONTROLE DO SUS", JLabel.CENTER);
        linha1.setForeground(Color.BLUE);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        linha2 = new JLabel(susImg, JLabel.CENTER);


        botaoAdicionar = new JButton("Cadastrar",addImg);
        botaoAdicionar.addActionListener(new SistemaCadastrarController(sistema, this));
        botaoPesquisar = new JButton("Pesquisar",pesqImg);
        botaoPesquisar.addActionListener(new SistemaConsultaController(sistema, this));
        botaoRemover = new JButton("Remover",removeImg);
        botaoRemover.addActionListener(new SistemaRemoverController(sistema, this));
        botaoPesquisarTratamento = new JButton("<html>Pacientes em tratamento<br>",pesqTrarImg);
        botaoPesquisarTratamento.addActionListener(new SistemaConsultaTratController(sistema,this));

        pan.add(botaoAdicionar);
        pan.add(botaoRemover);
        pan.add(botaoPesquisar);
        pan.add(botaoPesquisarTratamento);

        getContentPane().add(linha1);
        getContentPane().add(linha2);

        getContentPane().add(pan);

    }
    //...
    public static void main(String [] args){
        JFrame janela = new TelaPrincipal();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
