package com.example.csv;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class LerLinhasComoObjetosOpenCsv {

    public static void main(String[] args) throws IOException {

		Reader reader = Files.newBufferedReader(Paths.get("C:" + File.separator + "desafio" + File.separator + "uberair.csv"));

		CsvToBean<CsvVoo> csvToBean = new CsvToBeanBuilder(reader)
                .withType(CsvVoo.class)
                .build();

        List<CsvVoo> voos = csvToBean.parse();

        for (CsvVoo voo : voos)
            System.out.println(voo);

    }
}