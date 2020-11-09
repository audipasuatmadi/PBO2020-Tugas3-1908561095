package com.main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int userMenu;
        do {
            userMenu = this.getIntegerInput("MENU\n1. Cek Pesan Rahasia\n2. Ganti Pesan Rahasia\n3. Reset Pesan Rahasia\n4. Quit\nPilihan: ");
            this.processMenu(userMenu);
        } while(userMenu != 4);
    }

    private void processMenu(int menu) {
        switch (menu) {
            case 1:
                PesanRahasia pesanRahasia = LoadPesan.loadPesan();
                if (pesanRahasia != null) {
                    System.out.println("Pesan Rahasia: " + pesanRahasia.getIsiPesan());
                } else {
                    System.out.println("Pesan kosong, mohon buat pesan terlebih dahulu!");
                }
                break;
            case 2:
                SavePesan savePesan = new SavePesan(getPesanInput("Masukkan pesan rahasia baru: "));
                savePesan.eksekusi();
                break;
            case 3:
                SavePesan savePesan1 = new SavePesan(null);
                savePesan1.eksekusi();
                break;
            case 4:
                break;
            default:
                System.out.println("bangsat");
                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getPesanInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
