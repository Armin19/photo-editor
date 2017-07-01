package ir.aut.ac.ceit;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Photo Editor");
        setSize(300, 300);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        JMenuItem newAction = new JMenuItem("New");
        JMenuItem openAction = new JMenuItem("Open");
        JMenuItem closeAction = new JMenuItem("Close");
        JMenuItem saveAction = new JMenuItem("Save");
        fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.add(closeAction);
        fileMenu.add(saveAction);
        newAction.addActionListener(new MenuActionHandler());
        openAction.addActionListener(new MenuActionHandler());
        closeAction.addActionListener(new MenuActionHandler());
        saveAction.addActionListener(new MenuActionHandler());
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
    }
}

class MenuActionHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {

        System.out.println(event.getActionCommand());
    }

}
