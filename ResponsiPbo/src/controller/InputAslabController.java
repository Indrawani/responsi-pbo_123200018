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
import Model.InputAslabModel;
import view.InputAslabView;
import view.InputView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputAslabController {
    InputAslabView inputAslabView;
    InputAslabModel inputAslabModel;
    InputView inputView;
    public InputAslabController(InputAslabModel inputAslabModel , InputAslabView inputAslabView , InputView inputView){
        this.inputAslabView = inputAslabView;
        this.inputAslabModel=inputAslabModel;
        this.inputView = inputView;

        inputAslabView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = inputAslabView.getno_buku();
                String judul = inputAslabView.getTfjudul();
                String penerbit = inputAslabView.getTfpenerbit();
                String penulis = inputAslabView.getTfpenulis();
                inputAslabModel.insertdata(no_buku,judul,penerbit,penulis);

                String[][] dataaslab = inputAslabModel.readbuku();
                inputView.table.setModel((new JTable(dataaslab,inputView.namakolom)).getModel());

            }
        });


    }

}
