package com.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavePesan implements Serializable {
    private PesanRahasia pesanRahasia;
    public SavePesan(String pesanBaru) {
        if (pesanBaru == null) {
            pesanRahasia = null;
        } else {
            pesanRahasia = new PesanRahasia(pesanBaru);
        }
    }

    public void eksekusi() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("persistent_file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.pesanRahasia);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
