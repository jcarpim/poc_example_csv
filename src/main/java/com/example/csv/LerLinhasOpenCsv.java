package com.example.csv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class LerLinhasOpenCsv {

    public static void main(String[] args) throws IOException, CsvException {

        Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        List<String[]> voos = csvReader.readAll();
        for (String[] voo : voos)
            System.out.println("Origem : " + voo[0] +
                            " - Destino : " + voo[1] +
                            " - Saida : " + voo[2] +
                            " - Chegada : " + voo[3] );

    }

}