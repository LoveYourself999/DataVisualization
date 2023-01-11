package Login;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

import Data_fetcher.Data_Fetcher;
import GetData.GetCountryList;
import GetData.GetMethodList;
import GetData.GetRejectedCountryList;

public class MainUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private static MainUI instance;

    public static MainUI getInstance() {
        if (instance == null)
            instance = new MainUI();
        return instance;
    }

    MainUI() {
        // Set window title
        super("Country Statistics");

        // Set top bar
        JLabel chooseCountryLabel = new JLabel("Choose a country: ");
        Vector<String> countriesNames = GetCountryList.getInstance().getCountriesNames();
        countriesNames.sort(null);
        JComboBox<String> countriesList = new JComboBox<String>(countriesNames);
        final Data_Fetcher[] df = {Data_Fetcher.getInstance()};


        countriesList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<String> RejectedcountriesNames = GetRejectedCountryList.getInstance().getCountriesNames();
                String selected_country = countriesList.getSelectedItem().toString();
                if(RejectedcountriesNames.contains(selected_country))
                {
                    JOptionPane.showMessageDialog(null, "data fetching and or processing is not available for the selected country at this point");
                    countriesList.setSelectedIndex(0);

                }
            }
        });

        JLabel from = new JLabel("From");
        JLabel to = new JLabel("To");
        Vector<String> years = new Vector<String>();
        for (int i = 2020; i >= 2010; i--) {
            years.add("" + i);
        }
        JComboBox<String> fromList = new JComboBox<String>(years);
        JComboBox<String> toList = new JComboBox<String>(years);

        toList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fromList.getSelectedItem().toString().compareTo(toList.getSelectedItem().toString())>0)
                {
                    JOptionPane.showMessageDialog(null, "date is wrong!");
                    toList.setSelectedIndex(fromList.getSelectedIndex());

                }
            }
        });

        fromList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fromList.getSelectedItem().toString().compareTo(toList.getSelectedItem().toString())>0)
                {
                    JOptionPane.showMessageDialog(null, "date is wrong!");
                    fromList.setSelectedIndex(toList.getSelectedIndex());
                }
            }
        });

        JPanel north = new JPanel();
        north.add(chooseCountryLabel);
        north.add(countriesList);
        north.add(from);
        north.add(fromList);
        north.add(to);
        north.add(toList);

        // Set bottom bar
        JButton recalculate = new JButton("Recalculate");

        JLabel viewsLabel = new JLabel("Available Views: ");

        Vector<String> viewsNames = new Vector<String>();
        viewsNames.add("Pie Chart");
        viewsNames.add("Line Chart");
        viewsNames.add("Bar Chart");
        viewsNames.add("Scatter Chart");
        viewsNames.add("Report");
        JComboBox<String> viewsList = new JComboBox<String>(viewsNames);
        JButton addView = new JButton("+");


        JButton removeView = new JButton("-");

        JLabel methodLabel = new JLabel("        Choose analysis method: ");

        Vector<String> methodsNames = GetMethodList.getInstance().getMethodList();

        JComboBox<String> methodsList = new JComboBox<String>(methodsNames);

        JPanel south = new JPanel();
        south.add(viewsLabel);
        south.add(viewsList);
        south.add(addView);
        south.add(removeView);

        south.add(methodLabel);
        south.add(methodsList);
        south.add(recalculate);

        JPanel east = new JPanel();

        // Set charts region
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(2, 3));
        createCharts(west);
        getContentPane().add(north, BorderLayout.NORTH);
        getContentPane().add(east, BorderLayout.EAST);
        getContentPane().add(south, BorderLayout.SOUTH);
        getContentPane().add(west, BorderLayout.WEST);
        addView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(df[0].getMethod()!= null) {
                    String viewChoice = viewsList.getSelectedItem().toString();
                    df[0].add_new_chart(viewChoice);
                    df[0].getMethod().returnPanel(west);
                    west.revalidate();
                    west.repaint();
                    getContentPane().revalidate();
                    getContentPane().repaint();
                }
                else
                    JOptionPane.showMessageDialog(null, "Please calculate first!");
            }
        });

        removeView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(df[0].getMethod()!= null) {
                    String viewChoice = viewsList.getSelectedItem().toString();
                    df[0].remove_chart(viewChoice);
                    df[0].getMethod().returnPanel(west);
                    west.revalidate();
                    west.repaint();
                    getContentPane().revalidate();
                    getContentPane().repaint();
                }
                else
                    JOptionPane.showMessageDialog(null, "Please calculate first!");            }
        });
        recalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String countryname = GetCountryList.getInstance().findCountryCode(countriesList.getSelectedItem().toString());
                int startYear = Integer.parseInt(fromList.getSelectedItem().toString());
                int endYear = Integer.parseInt(toList.getSelectedItem().toString());
                String view = viewsList.getSelectedItem().toString();
                String method= methodsList.getSelectedItem().toString();
                df[0] = new Data_Fetcher(countryname,startYear,endYear,method,view);
                df[0].getMethod().returnPanel(west);
                west.revalidate();
                west.repaint();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
    }

    private void createCharts(JPanel west) {
        createReport(west);
    }

    private void createReport(JPanel west) {
        JTextArea report = new JTextArea();
        report.setEditable(false);
        report.setPreferredSize(new Dimension(400, 300));
        report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        report.setBackground(Color.white);
        String reportMessage;

        reportMessage = "Please select specific years , country , view\nand analysis method \n" +
                "Our app will automatically generate the view for you";

        report.setText(reportMessage);
        JScrollPane outputScrollPane = new JScrollPane(report);
        west.add(outputScrollPane);
    }

    public static void main(String[] args) {

        JFrame frame = MainUI.getInstance();
        frame.setSize(900, 600);
        frame.pack();
        frame.setVisible(true);
    }
    // TODO Auto-generated method stub

}
