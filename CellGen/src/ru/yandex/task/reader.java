package ru.yandex.task;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class reader {
    public static void print(int[][] matrix) {
        String txt = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                txt += Integer.toString(matrix[i][j]) + " ";
            }
            txt += "\n";
        }

        final JOptionPane pane = new JOptionPane(txt, JOptionPane.OK_CANCEL_OPTION);
        final JDialog dialog = pane.createDialog("Matrix");
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dialog.dispose();
            }
        });
        timer.start();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    /*file reader*/
    public static void readFile(String path) {
        int l = 0;
        try {
           l = checkHeight(path);
           File file = new File(path);
           FileReader fr = new FileReader(file);
           BufferedReader reader = new BufferedReader(fr);
           String line = reader.readLine();
            while (line != null) {
                stringToAr(line, l);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void stringToAr(String line, int x) {
        String strArr[] = line.split(" ");
        int y = strArr.length;
        int[][] matrix = new int[x][y];
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        print(matrix);
        gen.counter(matrix);
    }
    public static int checkHeight(String path) {
        int l = 0;
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                l++;
                line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (l);
    }
}

