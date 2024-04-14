package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Ajeng");
        nama.add("Miranti");
        nama.add("Safitri");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Safitri");

        boolean adaAjeng = nama.contains("Ajeng");

        System.out.println("Apakah ada Ajeng? " + adaAjeng;)

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
