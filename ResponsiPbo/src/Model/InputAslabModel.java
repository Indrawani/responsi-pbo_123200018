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
import java.sql.SQLException;
import java.sql.Statement;

public class InputAslabModel extends InputAslab{
    public void insertdata(String judul, String portofolio, String microteaching, String nilai){
        try {
            String query = "Insert into aslab Values ('" + judul + "','" + portofolio + "','" + microteaching + "','" + nilai + "',0)";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan");

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Pastikan judul Tidak Sama dengan yang lain dan data yang diimasukan sudah betul");
        }
    }
}
