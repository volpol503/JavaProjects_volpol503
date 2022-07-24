package ToolBars;

import AD4A.Main;
import AD4A.TextPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar_2_Расчет_обмотки_статора extends JPanel implements ActionListener {
    public TextPanel Panel;
    private JButton a,h_ш_СТТР,w_1,β;

    public ToolBar_2_Расчет_обмотки_статора(){
        a = new JButton("a");
        h_ш_СТТР = new JButton("h_ш_СТТР");

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(a);
        add(h_ш_СТТР);
    }

    public void setTextPanel(TextPanel Panel){
        this.Panel = Panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Main();
    }
}
