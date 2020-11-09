package com.main;

import java.io.Serializable;

public class PesanRahasia implements Serializable {
    private String isiPesan;

    public PesanRahasia(String isiPesan) {
        this.isiPesan = isiPesan;
    }

    public String getIsiPesan() {
        return isiPesan;
    }
}
