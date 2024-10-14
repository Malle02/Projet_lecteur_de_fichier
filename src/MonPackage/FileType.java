package MonPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class FileType implements lecture_fichier {
    protected String filePath;
    protected File file;
    protected FileInputStream fileInputStream;

    public FileType(String filePath) {
        this.filePath = filePath;
        this.file = new File(filePath);
    }

    @Override
    public void openFile() {
        try {
            System.out.println("ouverture du fichier: " + filePath);
            fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("ouverture du fichier: " + filePath);
            e.printStackTrace();  // trace de l'exception
        }
    }

    @Override
    public void closeFile() {
        try {
            if (fileInputStream != null) {
                fileInputStream.close();
                System.out.println("fermeture du fichier: " + filePath);
            }
        } catch (IOException e) {
            System.out.println("fermeture du fichier : " + filePath);
            e.printStackTrace();
        }
    }

    @Override
    public abstract void printContent();

    @Override
    public abstract void printReversed();

    @Override
    public abstract void printPalindromic();
}
