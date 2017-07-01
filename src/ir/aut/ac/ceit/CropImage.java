package ir.aut.ac.ceit;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class CropImage extends JComponent implements MouseListener, MouseMotionListener {
    private BufferedImage img;
    private int x1, x2, y1, y2;

    public CropImage(BufferedImage img) {
        this.img = img;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setImage(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage getImage() {
        return this;
    }

    public void paintComponent(Graphics graphics) {
        graphics.drawImage(img, 0, 0, this);
        if (cropping) {
            graphics.setColor(Color.RED);
            graphics.drawRect(Math.max(x1, x2), Math.min(y1, y2), Math.max(x1, x2), Math.max(y1, y2));
        }

    public void mousePressed(MouseEvent evt) {
        this.x1 = evt.getX();
        this.y1 = evt.getY();
    }

    public void mouseReleased(MouseEvent evt) {
        this.cropping = false;
        BufferedImage cropped = crop(new Rectangle(Math.min(x1, x2), Math.min(y1, y2), Math.max(x1, x2), Math.max(y1, y2)));
        this.img = cropped;
    }

    public void mouseDragged(MouseEvent evt) {
        cropping = true;
        this.x2 = evt.getX();
        this.y2 = evt.getY();
    }
}
}
