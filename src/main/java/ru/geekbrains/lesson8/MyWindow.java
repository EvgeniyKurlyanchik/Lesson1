package ru.geekbrains.lesson8;

import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My Simple Window");
        setBounds(600, 300, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }
}