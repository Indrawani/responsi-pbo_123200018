/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.InputAslab;
import Model.NilaiAkhirModel;
import view.InputView;
import view.NilaiAkhirView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IIN
 */
public class NilaiAkhirController {
    NilaiAkhirView nilaiAkhirView;
    NilaiAkhirModel nilaiAkhirModel;
    InputView inputView;
    InputAslab inputAslab;

    NilaiAkhirController(NilaiAkhirView nilaiAkhirView, NilaiAkhirModel nilaiAkhirModel, InputView inputView, InputAslab inputAslab) {
        this.nilaiAkhirModel = nilaiAkhirModel;
        this.nilaiAkhirView = nilaiAkhirView;
        this.inputView = inputView;
        this.inputAslab = inputAslab;

        nilaiAkhirView.btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = nilaiAkhirView.getjudul();
                String nilaibaru = nilaiAkhirView.getnilai_baru();
                nilaiAkhirModel.upnilai(judul,nilaibaru);
                String[][] dataaslab = inputAslab.readaslab();
                inputView.table.setModel((new JTable(dataaslab,inputView.namakolom)).getModel());

            }
        });

        nilaiAkhirView.btn_cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = nilaiAkhirView.getjudul();
                String[][] hasil = nilaiAkhirModel.readaslab(judul);
                if (hasil[0][0] != null){
                    nilaiAkhirView.tampil(hasil[0][0],hasil[0][1]);
                    nilaiAkhirView.btn_update.setEnabled(true);
                }
            }
        });
    }
}

