package MonPackage;

public class FileReader {
    public static void main(String[] args) {
        // Test avec un fichier texte
        FileTxt txtFile = new FileTxt("C:\\Users\\malle\\OneDrive\\Bureau\\Licence_pro_sorbonne\\Java_Poo\\cours\\fichier_ts\\texte_file.txt");
        txtFile.openFile();
        txtFile.printContent();
        txtFile.printReversed();
        txtFile.printPalindromic();
        txtFile.closeFile();

        // Test avec un fichier CSV
        FileCsv csvFile = new FileCsv("C:\\Users\\malle\\OneDrive\\Bureau\\Licence_pro_sorbonne\\Java_Poo\\cours\\fichier_ts\\csvFile.csv");
        csvFile.openFile();
        csvFile.printContent();
        csvFile.printReversed();
        csvFile.printPalindromic();
        csvFile.closeFile();
    }
}
