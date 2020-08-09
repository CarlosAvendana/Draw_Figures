package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {

    private ArrayList figureList;
    private String path;
    private String allData;
    private int contadorFiguras;

    public ReadFile(String path) {
        this.path = path;
    }

    public String allData() {

        try (Scanner scanner = new Scanner(new File(this.path));) {
            scanner.useDelimiter("\\A");
            this.allData = scanner.next();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.allData;
    }

}
