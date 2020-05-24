package gr.codehub.linkmanager;

import gr.codehub.linkmanager.forms.InsertForm;
import gr.codehub.linkmanager.forms.SearchForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui {

  private   JFrame frame = new JFrame("LinkManager");


    public Gui(  ){

        frame.setLayout(new FlowLayout());
        createMenuBar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,300));
        frame.setVisible(true);
    }


    public  void addInsertPanel( ActionEvent e){
            InsertForm form = new InsertForm();
        JPanel panel = form.getInsertPanel();



        frame.setContentPane(panel);
        frame.repaint();
        frame.setVisible(true);
    }

    public  void addSearchPanel( ){

            SearchForm searchForm = new SearchForm();
        JPanel panel = searchForm.getSearchPanel();

        frame.setContentPane(panel);
        frame.repaint();
        frame.setVisible(true);
    }


    private  void createMenuBar() {
        var menuBar = new JMenuBar();
        var fileMenu = new JMenu("File");
        var addMenuItem = new JMenuItem("Add link" );
        var searchMenuItem = new JMenuItem("Search link" );
        var eMenuItem = new JMenuItem("Exit" );


        eMenuItem.addActionListener((event) -> System.exit(0));
        addMenuItem.addActionListener((event) -> addInsertPanel( event));
        searchMenuItem.addActionListener((event) -> addSearchPanel( ));

        fileMenu.add(addMenuItem);
        fileMenu.add(searchMenuItem);
        fileMenu.add(eMenuItem);

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    }





}
