package com.minr;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Tabungan {
    private double saldoAwal, saldoTarget;

    public void setSaldoAwal(double saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public void setSaldoTarget(double saldoTarget) {
        this.saldoTarget = saldoTarget;
    }

    private double getBunga(){
        return this.saldoAwal * 0.08;
    }

    private String getFormatingCurrency(double currency){
        String saldo; // Variabelbantuan untuk format currency

        // Formating Currency Start
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        // Formating Currency END

        saldo = kursIndonesia.format(currency);
        String[] parts = saldo.split(",");
        saldo = parts[0];
        return saldo;
    }

    public void getResult(){
        int i = 1; // variabel bantuan untuk menghitung bulan
        while (saldoAwal < saldoTarget || saldoAwal > 7000000) {
            saldoAwal = Math.floor(saldoAwal + this.getBunga());
            System.out.println("Saldo di bulan ke-" + i + " " + this.getFormatingCurrency(saldoAwal));
            i++;
        }
    }

}
