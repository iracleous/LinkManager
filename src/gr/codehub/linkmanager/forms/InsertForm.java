package gr.codehub.linkmanager.forms;

import gr.codehub.linkmanager.entities.Link;
import gr.codehub.linkmanager.entities.LinkCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InsertForm {
    private JPanel insertPanel;
    private JButton button1;
    private JTextField textField1;
    private LinkCollection urlList  ;



    public InsertForm(   LinkCollection list) {

        urlList = list;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Link newLink=   new Link(textField1.getText(),"", null, new Date(),"theo", false,0 )  ;

                list.addLink(newLink);

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
