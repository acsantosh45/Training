package day1;

public class Laptop {

    //States
    short yearOfManufacture;
    String companyOfManufacture;
    int screenSize;
    short hardDiskMemoryGB;

    //Behavior
    void isTouchScreen() {
    }

    void isItFlip() {
    }

    void isItAffordable() {
    }

    public static void main(String[] args) {
        Laptop dell = new Laptop();
        Laptop macbook = new Laptop();

        dell.yearOfManufacture = 2020;
        dell.companyOfManufacture = "inspiron";
        dell.screenSize = 14;
        dell.hardDiskMemoryGB = 500;


        macbook.yearOfManufacture = 2021;
        macbook.companyOfManufacture = "apple";
        macbook.screenSize = 13;
        macbook.hardDiskMemoryGB = 1024;


    }
}


