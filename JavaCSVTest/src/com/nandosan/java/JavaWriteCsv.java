package com.nandosan.java;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JavaWriteCsv {
    public static void main(String[] args) {
        // DataDummy

        try{
            List<List<String>> dataDummy = Arrays.asList(
                    Arrays.asList("1","Semangka","bagus"),
                    Arrays.asList("2","Jeruk","kurang bagus"),
                    Arrays.asList("3","Pepaya","sangat bagus")
            );

            BufferedWriter writer = Files.newBufferedWriter(Paths.get("test-writer-1.csv"));

            writer.write("no,name,status");
            writer.newLine();

            for (List<String> data : dataDummy){
//                System.out.println(data.toString());
                writer.write(String.join(",",data));
                writer.newLine();
            }

            writer.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
