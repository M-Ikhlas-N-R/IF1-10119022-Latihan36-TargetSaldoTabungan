package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Target Saldo Tabungan (OO) Latihan 36
 *
 */
public class Main extends Tabungan{
    public static void main(String[] args) {
        Main nasabah = new Main();
        nasabah.setSaldoAwal(3500000);
        nasabah.setSaldoTarget(6000000);
        nasabah.getResult();
    }
}
