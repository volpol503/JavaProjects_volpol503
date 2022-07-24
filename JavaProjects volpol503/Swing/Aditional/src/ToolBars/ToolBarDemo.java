package ToolBars;

import AD4A.Main;
import AD4A.TextPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarDemo extends JPanel implements ActionListener {

    private JButton Edit,Save;
    public TextPanel Panel;


    public ToolBarDemo() {
        Edit = new JButton("Редактировать");
        Save = new JButton("Сохранить");
        Edit.addActionListener(this);
        Save.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(Save);
        add(Edit);
    }

    public void setTextPanel(TextPanel Panel) {
        this.Panel = Panel  ;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == Edit) {
            Panel.appendText("S_Кор");
        System.out.println("S_Кор");
        }
        if (clicked == Save) {
            Panel.appendText("Δϑ_[В.ВОЗД]");
            System.out.println("Δϑ_[В.ВОЗД]");
        }

    }



    public static void main(String[] args) {
        new Main();
    }
}
