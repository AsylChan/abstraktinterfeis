package com.company;

public class otech_film implements film {
    public String nazvanie_otech;
    public String Rezhisser_imya = "Aqan Sataev";
    public otech_film(String nazvanie_otech){
        this.nazvanie_otech = nazvanie_otech;
    }

    public void Otechfilm(){
        System.out.println(this.nazvanie_otech + " no comedy");
    }
    @Override
    public void showZhanr(){
        System.out.println("no zarubezhniy film -" + this.nazvanie_otech);
    }
    public void Rezhisser(){
        System.out.println("Rezhisser " + this.Rezhisser_imya);
    }
}
