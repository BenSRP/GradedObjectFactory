

import java.sql.SQLOutput;

public class Canada {


    public boolean isCold;
    public int MedianHomePrice;
    public String PM;

    public Canada(boolean CisCold, int CMedianHomePrice, String CPM){
        isCold = CisCold;
        MedianHomePrice = CMedianHomePrice;
        PM = CPM;
    }

    public Canada () {
        isCold = true;
        MedianHomePrice = 1000000;
        PM = "Mark Carney";
    }


    public void Printinfo (){
        System.out.println("Welcome to Canada Buddy");
        System.out.println(isCold + ", It is cold");
        System.out.println(MedianHomePrice + " Loonies");
        System.out.println(PM + " is the prime minister");
    }

    public void Season (boolean Weather){
        isCold = Weather;
    }
    public void Affordability (int housePrice){
        MedianHomePrice = housePrice;

    }

    public void election (String Leader){
        PM = Leader;
    }




}

