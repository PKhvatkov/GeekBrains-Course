package ru.geekbrains.lesson4.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Application");
        setBounds(200, 200, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JTextArea messagesArea = new JTextArea();
        messagesArea.setLineWrap(true);
        messagesArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(messagesArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll, BorderLayout.CENTER);

        JPanel sendMessagePanel = new JPanel();
        sendMessagePanel.setLayout(new BorderLayout());

        JTextField messageField = new JTextField();
        messageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!messageField.getText().equals("")) {
                    messagesArea.append(messageField.getText() + "\n");
                    messageField.setText("");
                }
            }
        });

        sendMessagePanel.add(messageField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Отправить");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!messageField.getText().equals("")) {
                    messagesArea.append(messageField.getText() + "\n");
                    messageField.setText("");
                }
            }
        });

        sendMessagePanel.add(sendButton, BorderLayout.EAST);


        add(sendMessagePanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}