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

public class HapusAslabModel extends InputAslab {
    public String[][] readbuku(String judul){
        String[][] data = new String[1][1];
        int jmlh = 0;
        try {
            String query = "Select * from aslab where judul ="+ judul;
            statement = (Statement) koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("judul");
                jmlh++;
            }
            if (jmlh==0){
                JOptionPane.showMessageDialog(null,"Aslab tidak Terdaftar");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return data;
    }

    public void hapus(String judul){
        try {
            String query = "Delete from judul where judul="+ judul;
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Aslab Berhasil Dihapus");
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }
    
}
