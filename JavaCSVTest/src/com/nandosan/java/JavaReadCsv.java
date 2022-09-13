package com.nandosan.java;

import java.nio.file.Paths;
import java.util.Scanner;

public class JavaReadCsv {
    public static void main(String[] args) {
        try {
            Scanner records = new Scanner(Paths.get("access-code.csv").toFile());
            records.useDelimiter(",");

            while (records.hasNext()){
                System.out.print(records.next()+" ");
            }

            records.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
