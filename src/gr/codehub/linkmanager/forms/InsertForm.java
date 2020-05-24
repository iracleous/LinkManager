package gr.codehub.linkmanager.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertForm {
    private JPanel insertPanel;
    private JButton button1;
    private JTextField textField1;

    public InsertForm() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public JPanel getInsertPanel() {
        return insertPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
