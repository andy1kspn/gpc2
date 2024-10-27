package com.example.bestidea.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChartDataService {
    public List<String> readDataFromFile(String filePath) {
        List<String> dataLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                dataLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataLines;
    }
}