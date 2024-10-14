package MonPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCsv extends FileType {

    public FileCsv(String filePath) {
        super(filePath);
    }

    @Override
    public void printContent() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("le contenue de mon fichier CSV:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("erreur lors du lecture du fichier csv: " + filePath);
            e.printStackTrace();
        }
    }

    @Override
    public void printReversed() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.insert(0, line + "\n");
            }
            System.out.println("Affichage a l'envers du fichier CSV:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("erreur de lecture csv: " + filePath);
            e.printStackTrace();
        }
    }

    @Override
    public void printPalindromic() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
            System.out.println("Affichage plalindromique:");
            System.out.println(content.reverse().toString());
        } catch (IOException e) {
            System.out.println("erreur de lecture csv: " + filePath);
            e.printStackTrace();
        }
    }
}
