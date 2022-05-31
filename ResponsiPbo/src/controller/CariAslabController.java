/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author IIN
 */
import Model.CariAslabModel;
import view.CariAslabView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CariAslabController {
    CariAslabModel cariAslabModel;
    CariAslabView cariAslabView;
    public CariAslabController(CariAslabView cariAslabView, CariAslabModel cariAslabModel){
        this.cariAslabModel = cariAslabModel;
        this.cariAslabView = cariAslabView;

        cariAslabView.btn_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = cariAslabView.getcari();
                String[][] hasil = cariAslabModel.cari(cari);
                cariAslabView.setText(hasil[0][1],hasil[0][2],hasil[0][3],hasil[0][4]);
            }
        });

    }
}
