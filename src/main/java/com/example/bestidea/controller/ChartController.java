package com.example.bestidea.controller;

import com.example.bestidea.service.ChartDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class ChartController {
    private final ChartDataService chartDataService;

    public ChartController(ChartDataService chartDataService) {
        this.chartDataService = chartDataService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<String> dataLines;

        try {
            dataLines = Files.readAllLines(Paths.get("C:\\Users\\Spinu Andrei\\Desktop\\Java\\BestIdea\\date.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("dataLines", dataLines);
        System.out.println(dataLines);
        return "index";
    }
    @GetMapping("/b")
    public String beta(Model model) {
        List<String> dataLines;

        try {
            dataLines = Files.readAllLines(Paths.get("C:\\Users\\Spinu Andrei\\Desktop\\Java\\BestIdea\\date.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("dataLines", dataLines);
        System.out.println(dataLines);
        return "beta";
    }
}