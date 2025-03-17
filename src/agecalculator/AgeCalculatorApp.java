package agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        // Créer un scanner pour l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander la date de naissance et valider l'entrée
        LocalDate birthDate = getValidDateOfBirth(scanner);

        // Calculer l'âge
        Period age = AgeCalculator.calculateAge(birthDate);

        // Afficher l'âge de façon lisible
        System.out.println(AgeCalculator.getAgeString(age));

        scanner.close();
    }

    // Méthode pour obtenir une date valide de la part de l'utilisateur
    private static LocalDate getValidDateOfBirth(Scanner scanner) {
        LocalDate birthDate = null;

        while (birthDate == null) {
            try {
                System.out.print("Entrez votre date de naissance (format: YYYY-MM-DD) : ");
                String input = scanner.nextLine();
                birthDate = LocalDate.parse(input);  // Essayer de convertir l'entrée en LocalDate
            } catch (DateTimeParseException e) {
                System.out.println("Format de date invalide. Veuillez utiliser le format YYYY-MM-DD.");
            }
        }
        return birthDate;
    }
}
