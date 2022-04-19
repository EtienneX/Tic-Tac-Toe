package tictactoe;

import javax.swing.*;
import java.awt.*;

import static tictactoe.ImageLoader.*;

public class Draw extends JLabel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent (Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Draw
        g.setColor(new Color(255,230,204));
        g.fillRect(0,0,800,600);
        g.setColor(Color.black);
        //Vertical
        g.drawLine(325,50,325,500);
        g.drawLine(475,50,475,500);
        //Horizontal
        g.drawLine(175,200,625,200);
        g.drawLine(175,350,625,350);

        //Draw Player:
        g.setColor(Color.black);
        if(GUI.Player == 0){
            g.drawString("Player X: ", 25,50);
        }
        else if(GUI.Player == 1){
            g.drawString("Player O: ", 25,50);
        }

        //Draw Winner:
        if(GUI.winner == 1){
            g.drawString("Player X wins!", 25,100);
        }
        else if(GUI.winner == 2){
            g.drawString("Player O wins!",25,100);
        }

        // Row 1
        if (GUI.state[0] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 50, 150, 150, null);
        } else if (GUI.state[0] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 50, 150, 150, null);        }

        if (GUI.state[1] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 50, 150, 150, null);
        } else if (GUI.state[1] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 50, 150, 150, null);
        }

        if (GUI.state[2] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 50, 150, 150, null);
        } else if (GUI.state[2] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 50, 150, 150, null);
        }

        // Row 2

        if (GUI.state[3] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 200, 150, 150, null);
        } else if (GUI.state[3] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 200, 150, 150, null);
        }

        if (GUI.state[4] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 200, 150, 150, null);
        } else if (GUI.state[4] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 200, 150, 150, null);
        }

        if (GUI.state[5] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 200, 150, 150, null);
        } else if (GUI.state[5] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 200, 150, 150, null);
        }

        // Row 3

        if (GUI.state[6] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 350, 150, 150, null);
        } else if (GUI.state[6] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 175, 350, 150, 150, null);
        }

        if (GUI.state[7] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 350, 150, 150, null);
        } else if (GUI.state[7] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 325, 350, 150, 150, null);
        }

        if (GUI.state[8] == 1) {
            g.drawImage(ImgX.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 350, 150, 150, null);
        } else if (GUI.state[8] == 2) {
            g.drawImage(ImgO.getScaledInstance(150,150, Image.SCALE_SMOOTH), 475, 350, 150, 150, null);
        }

        repaint();

    }

}
