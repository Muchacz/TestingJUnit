/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testovano;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivo Hanuš
 */
public class MyHistory {

    List<String> arr;
    Path filePath;

    public MyHistory(String fileName) {
        filePath = Paths.get(fileName);
    }

    public MyHistory(Path p) {
        filePath = p;
    }

    public void read() throws IOException {
        for (String s : Files.readAllLines(filePath)) {
            arr.add(s);
        }
    }

    public void save() throws IOException {
        Files.write(filePath, arr);
    }

    public void addLine(String str) {
        if (arr == null) {
            arr = new ArrayList<>();
        }
        arr.add(str);
    }
}
