package ru.yandex.task;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class Main {
    static final JFrame frame = new JFrame();
    public static void setDefaultWindowProperties(JFrame window){
        window.setBounds(300,300,320,240);
        window.setPreferredSize(new Dimension(320, 240));
        window.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        window.setVisible(true);
        window.setResizable(true);
        window.setTitle("Press X to exit.");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static String showFileDialog(){
        FileDialog fdlg = new FileDialog(frame, "Open file...", FileDialog.LOAD);
        fdlg.setPreferredSize(new Dimension(400,400));
        fdlg.setSize(400, 400);
        fdlg.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        fdlg.setResizable(true);
        fdlg.setVisible(true);
        fdlg.pack();
        String path = new File(fdlg.getFile()).getAbsolutePath();
        return path;
    }
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Scanner sc = new Scanner(System.in);
        String answer = JOptionPane.showInputDialog(null,
                "Write \"f\" for file or \"g\" for generator.",
                "What kind of map will be?(file, generator)", JOptionPane.QUESTION_MESSAGE);
        switch(answer) {
            case "g":
                String height_s = JOptionPane.showInputDialog(null,
                        "Write height (the min height is 3)", "Height", JOptionPane.QUESTION_MESSAGE);
                int height = Integer.parseInt(height_s);
                if (height < 3){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect height", "Error!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                String length_s = JOptionPane.showInputDialog(null,
                        "Write length (the min length is 3)", "Length", JOptionPane.QUESTION_MESSAGE);
                int length = Integer.parseInt(length_s);
                if (length < 3) {
                    JOptionPane.showMessageDialog(null,
                            "Incorrect length", "Error!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                gen.map_gen(height, length); //generates new field and start to work
                break;
            case "f":
                int res = showConfirmDialog(null,
                        "Choose file?",
                        "File chooser.",
                        YES_NO_OPTION,
                        QUESTION_MESSAGE);
                if (res != YES_OPTION){
                    System.exit(0);
                }else {
                    setDefaultWindowProperties(frame);
                    reader.readFile(showFileDialog());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Wrong answer!",
                        "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}