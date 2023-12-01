package main.java.com.ojiraphers.understand;

public enum HType {

    벌크업(100,-40),
    감량(70,-20),
    다이어트(50,-10),
    요가(30,20),
    유령(30,0);


    int cashe;
    int damege;

    HType(int cashe, int damege) {
        this.cashe = cashe;
        this.damege = damege;
    }

}

