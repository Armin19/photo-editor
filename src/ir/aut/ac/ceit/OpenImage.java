package ir.aut.ac.ceit;


import javax.swing.*;
import java.util.Scanner;

public class OpenImage {
    Scanner scanner = new Scanner(System.in);
    String path = scanner.next();
    ImageIcon imageIcon = new ImageIcon(path);
    JLabel imageLabel = new JLabel(imageIcon);

}
