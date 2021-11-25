package com.company;

public class Comedy implements film{
    public String nazvanie_comedy;
    public String imya_rezhissera = "Aqan";
    public Comedy(String nazvanie_comedy){
        this.nazvanie_comedy = nazvanie_comedy;
    }
    public void komediya(){
        System.out.println(this.nazvanie_comedy + " this comedy");
    }
    public void showZhanr(){
        System.out.println("zarubezhniy film -" + this.nazvanie_comedy);
    }
    public void Rezhisser(){
        System.out.println("Rezhisser etogo filma - " + this.imya_rezhissera);
    }
}