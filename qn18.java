package filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class qn18 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 String fileName = "C:\\Users\\Administrator\\eclipse-workspace\\project1\\src\\filehandling\\destination.txt";
 boolean continueWriting = true;
 try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
 System.out.println("Enter lines to write to the file. Type 'quit' to exit.");
 while (continueWriting) {
 String line = scanner.nextLine();
 if ("quit".equalsIgnoreCase(line.trim())) {
 continueWriting = false;
 } else {
 writer.write(line);
 writer.newLine();
 }
 }
 System.out.println("File writing completed.");
 } catch (IOException e) {
 System.err.println("An error occurred: " + e.getMessage());
 } finally {
 scanner.close();
 }
 }
} 
