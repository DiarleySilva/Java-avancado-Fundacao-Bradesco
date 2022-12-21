package projeto.java;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author diarley
 */
public class Layouts extends JFrame {

    public Layouts() {

        super("Meu layout");
        
        Container container = getContentPane();
        
        /*
        container.add(BorderLayout.NORTH, new JButton("Botão norte"));
        container.add(BorderLayout.SOUTH, new JButton("Botão sul"));
        */
        
        container.add(BorderLayout.NORTH, new JButton("Botão norte"));
        container.add(BorderLayout.SOUTH, new JButton("Botão sul"));
        container.add(BorderLayout.CENTER, new JButton("Botão central"));
        container.add(BorderLayout.EAST, new JButton("Botão leste"));
        container.add(BorderLayout.WEST, new JButton("Botão oeste"));

        //getContentPane().add(new JButton("Botão centralizado"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    
    /*
    public static void main(String[] args) {
        new Layouts();
    }
    */
}
