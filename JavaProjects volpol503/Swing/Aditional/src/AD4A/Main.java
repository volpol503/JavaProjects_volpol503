package AD4A;

import ToolBars.ToolBarDemo;
import ToolBars.ToolBar_1_Определение_главных_размеров;
import ToolBars.ToolBar_2_Расчет_обмотки_статора;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private TextPanel Panel;
    private JButton button;
    private ToolBarDemo toolBarDemo;
    private ToolBar_1_Определение_главных_размеров toolBar1;
    private ToolBar_2_Расчет_обмотки_статора toolBar2;
    public Main() {
        super("AD4A Formul");
        setLayout(new BorderLayout());
        // FlowLayout - Монолитная область
        //

        button = new JButton("Добавить");
        Panel = new TextPanel();


        toolBarDemo = new ToolBarDemo();
        toolBar1 = new ToolBar_1_Определение_главных_размеров();
        toolBar2 =  new ToolBar_2_Расчет_обмотки_статора();

        // Присвоение единой текстовой панели от классов кнопочнх постов
        // каждый кнопочный пост это набор кнопок под название переменных
        toolBar1.setTextPanel(Panel);
        toolBarDemo.setTextPanel(Panel);



        add(toolBarDemo, BorderLayout.NORTH);
        add(toolBar1, BorderLayout.EAST);
        add(toolBar2,BorderLayout.WEST);
        add(Panel,BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

//        Edit.setStringListener(new StringListener(){
//            public void Text(String text){
//                System.out.println(text);
//            }
//        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel.appendText("Δϑ_[В.ВОЗД]");
                System.out.println("Δϑ_[В.ВОЗД]");
            }
        });


         setSize(500,500);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);

    }


    public static void main(String[] args) {
        new Main();
    }
}

