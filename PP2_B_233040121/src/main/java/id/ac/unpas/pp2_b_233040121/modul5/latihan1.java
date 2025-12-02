/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_b_233040121.modul5;

import javax.swing.*;


/**
 *
 * @author azmirahmatullah
 */
public class latihan1 {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable (){
           public void run() {
               // 1. Buat objek JFrame
               JFrame frame = new JFrame("INI BINGKAI");
               
               // 2. Atur ukuran Jendela
               frame.setSize(400,300);
               
               // 3. Atur aksi saat tombol (X) ditekan
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
               // 4. Buat jendela terlihat
               frame.setVisible(true);
        }
           
        });
    }
    
}
