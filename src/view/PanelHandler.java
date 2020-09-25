package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private JPanel panel;
    private JButton button1;
    private JLabel output;
    private JButton button2;
    private JButton employee3Button;
    private JButton employee6Button;
    private JButton employee4Button;
    private JButton employee5Button;

    private MainController mainController;


    public PanelHandler(MainController mainController) {
        this.mainController = mainController;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setS("Blaaaaaaaa");
                output.setText(mainController.getS());

            }
        });

        output.setText(mainController.getS());

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainController.setS("n");
                output.setText(mainController.getS());

            }
        });

        output.setText(mainController.getS());
    }

    private void createButtons(){}

    private void updateGUI(){
        output.setText(mainController.getS());
    }

    public JPanel getPanel () {
        return panel;
    }
}
