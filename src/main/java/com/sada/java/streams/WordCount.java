package com.sada.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/words.txt");
        Files.lines(path);


    }
}
