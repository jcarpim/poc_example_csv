package com.example.csv;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class LerLinhasOpenCsv {

    public static void main(String[] args) throws IOException, CsvException {

    	Reader reader = Files.newBufferedReader(Paths.get("C:" + File.separator + "desafio" + File.separator + "uberair.csv"));

        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        
        		
        CsvVoo csvVoo = new CsvVoo("Acre", "Guarulhos", "saida", "chegada");
        CsvVoo csvVoo2 = new CsvVoo("New York", "Santorini", "saida", "chegada");
        
        List <CsvVoo> voos = new ArrayList<CsvVoo>();
     
        /*System.out.println("Origem: " + csvVoo.getOrigem());
        System.out.println("Destino: " + csvVoo.getDestino());
        System.out.println("Origem 2: " + csvVoo2.getOrigem());
        System.out.println("Destino 2: " + csvVoo2.getDestino());*/
     
        
       /* List<String[]> voos = csvReader.readAll();   
        for (String[] voo : voos)
            System.out.println("Origem : " + voo[0] +
                            " - Destino : " + voo[1] +
                            " - Saida : " + voo[2] +
                            " - Chegada : " + voo[3] );*/

    
        List<String[]> voosClasse = csvReader.readAll();
        for (String[] voo : voosClasse) {
        	 csvVoo = new CsvVoo(voo[0], voo[1], voo[2], voo[3]);
        	 voos.add(csvVoo);
        	/* System.out.println("Origem : " + csvVoo.getOrigem()+
                     " - Destino : " + csvVoo.getDestino() +
                     " - Saida : " + csvVoo.getSaida() +
                     " - Chegada : " + csvVoo.getChegada());*/
        	System.out.println(csvVoo);
        }
        
      //  System.out.println("Origem: "+csvVoo.getOrigem());
      // System.out.println("Origem: "+csvVoo.toString());
    }
}