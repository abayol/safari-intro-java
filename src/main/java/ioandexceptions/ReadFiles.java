package ioandexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFiles {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean success = false;
    while (!success) {
      System.out.print("Enter filename: ");
      String fileName = sc.nextLine();
      try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName));) {
        String line;
        while ((line = br.readLine()) != null) {
          System.out.println(">> " + line);
        }
        success = true;
//        br.close();
      } catch (IOException ioe) {
        System.out.println("Ooops, try again");
      }
    }
  }
}
