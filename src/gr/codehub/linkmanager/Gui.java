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


    public  void addInsertPanel(  ){
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
        var linkMenu = new JMenu("Links");
        var linkInsertMenuItem = new JMenuItem("Insert link" );
        var linkChangeMenuItem = new JMenuItem("Change link" );

        var searchMenu = new JMenu("Search");
        var searchMenuItem = new JMenuItem("Search");

        var helpMenu = new JMenu("Help");
        var helpAboutMenuItem = new JMenuItem("About");
        var helpExitMenuItem = new JMenuItem("Exit");

        linkInsertMenuItem.addActionListener((event) -> addInsertPanel( ));
        //    linkChangeMenuItem.
        searchMenuItem.addActionListener((event) -> addSearchPanel( ));
       // helpAboutMenuItem
        helpExitMenuItem.addActionListener((event) ->askToExit());

        linkMenu.add(linkInsertMenuItem);linkMenu.add(linkChangeMenuItem);
        searchMenu.add(searchMenuItem);
        helpMenu.add(helpAboutMenuItem);helpMenu.add(helpExitMenuItem);

        menuBar.add(linkMenu); menuBar.add(searchMenu); menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
    }


    private void askToExit()
    {
         var choice = JOptionPane.showConfirmDialog(null, "Are you sure to exit?", "WARNING",
                JOptionPane.YES_NO_OPTION);
        if (    choice== JOptionPane.YES_OPTION) {
            System.exit(0);
         }
     }
}
