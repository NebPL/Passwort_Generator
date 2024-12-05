package de.Neb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<Character> CharList = List.of(
            // Kleinbuchstaben
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            // Großbuchstaben
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            // Ziffern
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            // Sonderzeichen
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
            '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
            '_', '`', '{', '|', '}', '~'
    );
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        // Ganzzahl eingeben
        System.out.print("Gib eine ganze Zahl ein: ");
        int Length = scanner.nextInt();

        List<Character> passwort = new ArrayList<>();
        int listecount = 0;
        int currentNumber = -1;
        int LastNumber = -1;

        for (int i = 0;i <= Length-1; i++){

            int randomInt = random.nextInt(CharList.size());
            if (randomInt == LastNumber){
                randomInt = random.nextInt(CharList.size());
            }else {
                passwort.add(CharList.get(randomInt));
            }
        }

        for (int i = 0;i < passwort.size(); i++){
            System.out.print(passwort.get(i));
        }
    }
}