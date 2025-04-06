package org.hometask10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Splitter {
    public static void main(String[] args) {

        String inputFile = "play.txt";
        String romeoFile = "Romeo.txt";
        String gulietaFile = "Gulieta.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter romeoWriter = new BufferedWriter(new FileWriter(romeoFile));
             BufferedWriter gulietaWriter = new BufferedWriter(new FileWriter(gulietaFile))) {

            String line;
            BufferedWriter currentWriter = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Romeo:")) {
                    currentWriter = romeoWriter;
                } else if (line.startsWith("Gulieta:")) {
                    currentWriter = gulietaWriter;
                }
                if (currentWriter != null) {
                    currentWriter.write(line);
                    currentWriter.newLine();
                }
            }
            System.out.println("The file has been successfully split!");
        } catch (IOException e) {
            System.err.println("File processing error: " + e.getMessage());
        }
    }
}
