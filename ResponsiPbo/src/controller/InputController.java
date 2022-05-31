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
import Model.*;
import view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputController {
    InputAslab InputAslab;
    InputView inputView;
    public InputController(InputView inputView , InputAslab inputAslab){
        this.inputView =inputView;
        this.InputAslab = inputAslab;

        if(inputAslab.getbannyakdata() != 0){
            String dataaslab[][] = inputAslab.readaslab();
            inputView.table.setModel((new JTable(dataaslab,inputView.namakolom).getModel()));
        }

        inputView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputAslabView inputAslabView = new InputAslabView();
                InputAslabModel inputAslabModel = new InputAslabModel();
                new InputAslabController(inputAslabModel,inputAslabView,inputView);
            }
        });

        inputView.btn_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CariAslabView cariAslabView = new CariAslabView();
                CariAslabModel cariAslabModel = new CariAslabModel();
                new CariAslabController(cariAslabView,cariAslabModel);
            }
        });

        inputView.btn_stok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NilaiAkhirModel nilaiAkhirModel = new NilaiAkhirModel();
                NilaiAkhirView nilaiAkhirView = new NilaiAkhirView();
                new NilaiAkhirController(nilaiAkhirView, nilaiAkhirModel, inputView,inputAslab);
            }
        });

        inputView.btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusAslabView hapusAslabView = new HapusAslabView();
                HapusAslabModel hapusAslabModel = new HapusAslabModel();
                new HapusAslabController(hapusAslabModel,hapusAslabView,inputView,inputAslab);
            }
        });
    }
}
