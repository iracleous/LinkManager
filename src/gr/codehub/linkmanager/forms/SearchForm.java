package gr.codehub.linkmanager.forms;

import gr.codehub.linkmanager.entities.Link;
import gr.codehub.linkmanager.entities.LinkCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchForm {
    private JPanel searchPanel;
    private JButton button1;
    private JTextField textField1;
    private LinkCollection urlList  ;



    public SearchForm(LinkCollection list) {
        urlList = list;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Link link=null;
                try {
                     link = list.getLinkById(Integer.parseInt(textField1.getText()));
                } catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "link not found");
                }


              if (link == null)
                  JOptionPane.showMessageDialog(null, "link not found");
              else
              JOptionPane.showMessageDialog(null, link.getUrl());

            }
        });
    }

    public JPanel getSearchPanel() {
        return searchPanel;
    }
}
