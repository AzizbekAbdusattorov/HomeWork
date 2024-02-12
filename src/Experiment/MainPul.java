package Experiment;

import java.util.ArrayList;
import java.util.Collections;

public class MainPul {
    static ArrayList<Pul> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Pul pul = new Pul(20,100_000);
        Pul pul1 = new Pul(50,100_000);
        Pul pul2 = new Pul(200,200_000);
        Pul pul3 = new Pul(10,100_000);
        Pul pul4 = new Pul(2,10_000);
        arrayList.add(pul);
        arrayList.add(pul1);
        arrayList.add(pul2);
        arrayList.add(pul3);
        arrayList.add(pul4);

        for (Pul p : arrayList) {
            System.out.println(p);
        }
        System.out.println();

        ArrayList<Pul> arrayList1 = new ArrayList<>();

        Pul pul0 = new Pul(1,10_000);
        Pul pul01 = new Pul(200,200_000);
        Pul pul02 = new Pul(200,200_000);
        Pul pul03 = new Pul(10,100_000);
        Pul pul04 = new Pul(5,90_000);
        arrayList1.add(pul0);
        arrayList1.add(pul01);
        arrayList1.add(pul02);
        arrayList1.add(pul03);
        arrayList1.add(pul04);

        aVoid(arrayList1);
        Collections.sort(arrayList);
        for (Pul pul5 : arrayList) {
            System.out.println(pul5);
        }
    }
    public  static void aVoid(ArrayList<Pul> arrayList1){
        for (Pul pul : arrayList1) {
            if (arrayList.contains(pul)){
                arrayList.get(arrayList.indexOf(pul)).setAmount(pul.getAmount());
            }else {
                arrayList.add(pul);
            }
        }


    }
}
