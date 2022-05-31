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
import Model.HapusAslabModel;
import Model.InputAslab;
import view.HapusAslabView;
import view.InputView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HapusAslabController {
    InputView inputView;
    HapusAslabModel hapusAslabModel;
    HapusAslabView hapusAslabView;
    InputAslab inputAslab;

    public HapusAslabController(HapusAslabModel hapusAslabModel,HapusAslabView hapusAslabView,InputView inputView ,InputAslab inputAslab){
        this.hapusAslabModel =hapusAslabModel;
        this.hapusAslabView = hapusAslabView;
        this.inputView = inputView;
        this.inputAslab = inputAslab;

        hapusAslabView.btn_cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = hapusAslabView.getjudul();
                String[][] hasil = hapusAslabModel.readbuku(judul);
                if (hasil[0][0] != null){
                    hapusAslabView.tampil(hasil[0][0]);
                    hapusAslabView.btn_hapus.setEnabled(true);
                }
            }
        });

        hapusAslabView.btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = hapusAslabView.getjudul();
                hapusAslabModel.hapus(judul);
                String[][] dataaslab = inputAslab.readaslab();
                inputView.table.setModel((new JTable(dataaslab,inputView.namakolom)).getModel());
            }
        });

    }
}
