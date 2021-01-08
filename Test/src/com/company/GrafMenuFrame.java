package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrafMenuFrame extends JFrame{
    JLabel label1 = new JLabel("Выберите тип детали: ");
    JLabel label2 = new JLabel("Выберите материал: ");
    JButton showAll = new JButton("Показать детали");
    public GrafMenuFrame(String title){
        super(title);


        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        String detailNames[] = {"Привод поршня", "Salnik", "Шайба", "Фланец"};
        String materials[] = {"Metal", "Сталь", "Дерево", "Пластмасса"};
        JComboBox detailBox = new JComboBox(detailNames);
        JComboBox materialBox = new JComboBox(materials);
        DetailDb dDb = new DetailDb();
        Detail[] details = dDb.get_details();

        Container c = getContentPane();
        c.setLayout(new GridLayout(2,1));
        row1.add(label1);
        row1.add(detailBox);
        row2.add(label2);
        row2.add(materialBox);
        row2.add(showAll);
        showAll.addActionListener(e -> {
            for (Detail d:details) {
                if (d.get_material() == materialBox.getSelectedItem()
                        && d.get_type() == DetailType.valueOf(detailBox.getSelectedItem().toString()))
                {
                    System.out.println(d.get_material());
                }
            }
        });

        c.add(row1);
        c.add(row2);

        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
