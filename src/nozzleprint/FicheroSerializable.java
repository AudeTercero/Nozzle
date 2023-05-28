/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nozzleprint;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class FicheroSerializable <E> {
       public void guardar(HashMap<String,E> coleccion, String fichero) {
        FileOutputStream fileOut = null;
        BufferedOutputStream bufOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream(fichero);
            bufOut = new BufferedOutputStream(fileOut);
            out = new ObjectOutputStream(bufOut);
            out.writeObject(coleccion);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                out.close();
                bufOut.close();
                fileOut.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public HashMap<String,E> leer(String fichero) {
        FileInputStream fileIn = null;
        BufferedInputStream bufIn = null;
        ObjectInputStream in = null;
        HashMap<String, E> partidas = null;
        try {
            fileIn = new FileInputStream(fichero);
            bufIn = new BufferedInputStream(fileIn);
            in = new ObjectInputStream(bufIn);
            partidas = (HashMap) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                in.close();
                bufIn.close();
                fileIn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return partidas;
    }
}
