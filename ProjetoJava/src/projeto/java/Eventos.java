package projeto.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author diarley
 */
public class Eventos extends JFrame implements ActionListener{
    
    public Eventos(){
        
        JButton botao = new JButton("Clique!");
        botao.addActionListener(this);
        
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Você clicou!");
    }
}