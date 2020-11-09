package com.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadPesan {
    public static PesanRahasia loadPesan() {
        PesanRahasia pesanRahasia = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("persistent_file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            pesanRahasia = (PesanRahasia) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return pesanRahasia;
    }
}
