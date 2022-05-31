/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author IIN
 */
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CariAslabModel extends InputAslab{
    public String[][] cari(String cari){
        String[][] data = new String[1][5];
        int jmlh = 0;
        try {
            String query = "Select * from aslab where judul ="+ cari;
            statement = (Statement) koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("judul");
                data[0][1] = resultSet.getString("portofolio");
                data[0][2] = resultSet.getString("microteaching");
                data[0][3] = resultSet.getString("wawancara");
                data[0][4] = resultSet.getString("nilai");
                jmlh++;
            }
            if (jmlh==0){
                JOptionPane.showMessageDialog(null,"Asisten Tidak Terdaftar");
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
        return data;
    }
    
}
