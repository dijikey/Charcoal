package main.GUI;


import javax.swing.*;
import javax.swing.table.JTableHeader;
public class BetaFrame extends JFrame{
    private JPanel Panel;
    private JTable table;
    private JLabel label;

    public BetaFrame(){
        setContentPane(Panel);
        JTableHeader header = new JTableHeader();
        header.add(label);

        table.setTableHeader(header);

        setTitle("Charcoal: Beta frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 640);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}
