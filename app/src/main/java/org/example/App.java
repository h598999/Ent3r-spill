/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Scanner;

public class App {

  public static void main(final String[] args) {
    // Boolean for hele spillet:)
    boolean doNotFinish = false;
    // Starter en scanner, dette lar brukerene skrive input
    Scanner scanner = new Scanner(System.in);
    // Variable for å lagre spillernavnet
    String playerName = null;
    // Boolean for å gå videre til neste spørsmål
    boolean nextQuestion = false;
    // Tom teksstreng for å lagre spilleren sitt valg
    String playerChoice = null;

    // Start spillet
    while (!doNotFinish) {

      while (!nextQuestion) {
        System.out.println("Skriv inn navnet ditt!");
        String input = scanner.nextLine();
        if (input.equals("exit")) {
          System.out.println("Ferdig");
          doNotFinish = true;
          nextQuestion = true;
        } else {
          playerName = input;
          System.out.println("Velkommen, " + playerName + "!");
          nextQuestion = true;
        }
      }
    }
    scanner.close();
  }
}


