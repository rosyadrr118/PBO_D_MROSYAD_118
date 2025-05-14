package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        User user1 = new Admin("rosyad", "118", "admin118", "rosyad118");
        User user2 = new Mahasiswa("rosyad", "202410370110118");

        while (true) {
            System.out.println("--------------------");
            System.out.println("Pilih Jenis Login: ");
            System.out.println("1. com.praktikum.users.Admin");
            System.out.println("2. com.praktikum.users.Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Username: ");
                String username = scan.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scan.nextLine();

                if (user1.login(username, password)) {
                    user1.displayInfo();
                } else {
                    System.out.println("Login com.praktikum.users.Admin Gagal Mas!! Kayaknya Username atau Password salah. ");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan Username: ");
                String nama = scan.nextLine();
                System.out.print("Masukkan Password: ");
                String nim = scan.nextLine();

                if (user2.login(nama, nim)) {
                    user2.displayInfo();
                } else {
                    System.out.println("Login com.praktikum.users.Mahasiswa Gagal!! Nama atau Nim salah. ");
                }

            } else if (pilihan == 3) {
                System.out.println("Keluar dari sistem. Terimakasih!");
                break;
            } else {
                System.out.println("Inputan tidak valid! Pilih antara (1//3)");
            }

        }
    }
}