/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author IIN
 */
import javax.swing.*;
import java.awt.*;

public class CariAslabView extends JFrame{

    JLabel ltitle = new JLabel("Cari aslab", SwingConstants.CENTER);
    JLabel ljudul = new JLabel("Nama");
    JLabel lportofolio = new JLabel("Nilai Portofolio");
    JLabel lmicroteaching = new JLabel("Nilai microteaching ");
    JLabel lwawancara = new JLabel("Nilai wawancara");
    JLabel lnilai = new JLabel("nilai");
    JLabel ljudulaslab = new JLabel();
    JLabel lportofolioaslab = new JLabel();
    JLabel lmicroteachingaslab = new JLabel();
    JLabel lwawancaraaslab = new JLabel();
    JLabel lnilaiaslab = new JLabel();

    JTextField tfjudul = new JTextField();

    public JButton btn_cari = new JButton("Cari");

    public CariAslabView(){
        setTitle("Cari Aslab");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(ljudul); add(tfjudul);
        add(lportofolio);add(lportofolioaslab);
        add(lmicroteaching); add(lmicroteachingaslab);
        add(lwawancara); add(lwawancaraaslab);
        add(lnilai); add(lnilaiaslab);
        add(btn_cari);

        btn_cari.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        ljudul.setBounds(100,80,60,30); tfjudul.setBounds(230,80,200,30);
        lportofolio.setBounds(100,140,60,30); lportofolioaslab.setBounds(230,140,200,30);
        lmicroteaching.setBounds(100,200,60,30); lmicroteachingaslab.setBounds(230,200,200,30);
        lwawancara.setBounds(100,260,60,30); lwawancaraaslab.setBounds(230,260,200,30);
        lnilai.setBounds(100,320,60,30);lnilaiaslab.setBounds(230,320,200,30);
        btn_cari.setBounds(200,380,100,30);
    }

    public String getcari(){
        return tfjudul.getText();
    }

    public void setText(String hjudul , String hportofolio , String hmicroteaching , String hnilai){
        ljudulaslab.setText(hjudul);
        lportofolioaslab.setText(hportofolio);
        lmicroteachingaslab.setText(hmicroteaching);
        lnilaiaslab.setText(hnilai);
    }
    
}
