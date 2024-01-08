/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poogym;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class InterfaceCliente extends JFrame {
     
 
     public InterfaceCliente() {
         super("Cadastro de Clientes");
        setSize(1200,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        
        
        
        getContentPane().add(new JLabel("Nome:"));
        final JTextField nome = new JTextField(20);
        getContentPane().add(nome);
        
        getContentPane().add(new JLabel("CPF:",SwingConstants.RIGHT));
        final JTextField cpf = new JTextField(20);
        getContentPane().add(cpf);

        

        getContentPane().add(new JLabel("Telefone:"));
      final JTextField idade = new JTextField(20);
        getContentPane().add(idade);

        getContentPane().add(new JLabel("Endereço:"));
        final JTextField curso = new JTextField(20);
        getContentPane().add(curso);

        JTextArea info = new JTextArea(5, 20);
        info.setEditable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);

        JPanel panel = new JPanel(new FlowLayout());

        final JButton btCadastrar = new JButton("Cadastrar");
        btCadastrar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent arg0) {
                info.setText(
                    nome.getText() +
                    ", com CPF numero " +
                    cpf.getText() +
                    ", com " +
                    idade.getText() +
                    " anos, se encontra devidamente matriculado no curso " +
                    curso.getText()
                );
            }            
        });
        panel.add(btCadastrar);

        final JButton btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cpf.setText("");
                nome.setText("");
                idade.setText("");
                curso.setText("");
                info.setText("");
            }
        });
       panel.add(btCancelar);
       getContentPane().add(panel);
       
        getContentPane().add(new JScrollPane(info));
        
        pack();
        setVisible(true);
    }

    public static void main(String [] args) {
        new InterfaceCliente();
    }
}
