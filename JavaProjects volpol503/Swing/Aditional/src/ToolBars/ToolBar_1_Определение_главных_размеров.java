package ToolBars;

import AD4A.Main;
import AD4A.TextPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar_1_Определение_главных_размеров extends JPanel implements ActionListener {

    private JButton _2p,A,B_δ,cosφ,D,P_расч,K_E, K_об, K_Б;
    public TextPanel Panel;

    public ToolBar_1_Определение_главных_размеров(){
        _2p = new JButton("2p");
         A = new JButton("A");
        B_δ = new JButton("B_δ");
        cosφ = new JButton("cosφ");
        D = new JButton();
        JButton Var[] = {cosφ,_2p,A,B_δ,cosφ,D};

         for( int i = 0;i < 6; i++ ){add(Var[i]);}

        setLayout(new FlowLayout(FlowLayout.LEFT));
    }
    public void setTextPanel(TextPanel panel) {
        Panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new Main();
    }

}




