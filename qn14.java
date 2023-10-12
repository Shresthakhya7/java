package filehandling;
import java.io.*;
public class qn14{
 public static void main(String[] args) {
 String sourceFileName = "C:\\Users\\Administrator\\eclipse-workspace\\project1\\src\\filehandling\\source.txt";
 String destinationFileName = "C:\\Users\\Administrator\\eclipse-workspace\\project1\\src\\filehandling\\destination.txt";
 try (FileReader reader = new FileReader(sourceFileName);
 FileWriter writer = new FileWriter(destinationFileName)) {
 int character;
 while ((character = reader.read()) != -1) {
 writer.write(character);
 }
 System.out.println("File copied successfully!");
 } catch (IOException e) {
 System.err.println("An error occurred: " + e.getMessage());
 }
 }
}