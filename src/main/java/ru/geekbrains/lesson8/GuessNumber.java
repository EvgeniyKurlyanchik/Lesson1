package ru.geekbrains.lesson8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class GuessNumber extends JFrame {
    private static int count = 0;
    private int randomNumber;
    private JTextField textField;

    public GuessNumber() {
        randomNumber = (int) (Math.random() * 10) + 1;
        //create Window
        setTitle("Угадай число");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        // текстовое поле
        textField = new JTextField();
        add(textField, BorderLayout.SOUTH);
        textField.setText(" Отдагайте число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("ArialBlack", Font.ITALIC, 16);
        textField.setFont(font);
        //панель кнопок
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;

            setVisible(false);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    tryToAnswer(buttonIndex, button);

                }
            });
        }


        JButton button11 = new JButton();
        add(button11, BorderLayout.NORTH);
        button11.setText("Restart");
        button11.setFont(font);
        setResizable(false);
        setVisible(true);

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new GuessNumber();
                count = 0;

            }

        });
    }

    public void tryToAnswer(int answer, JButton button) {
        int maxCount = 3;
        for (int j = 0; j < 3; j++) {


            if (answer == randomNumber) {
                textField.setText("Вы угадали! Ответ: " + randomNumber);
                button.setBackground(Color.GREEN);
            } else if (answer > randomNumber) {
                textField.setText("Не угадали! Загадонное число меньше");
            } else {
                textField.setText("Не угадали! Загадонное число больше");
            }

            if (count >= maxCount) {
                textField.setText("Конец игры!! Закончились 3 попытки!");

            }
            count++;
            break;
        }

    }

}



