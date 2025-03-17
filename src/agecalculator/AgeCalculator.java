package agecalculator;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    // Méthode pour calculer l'âge en années, mois et jours
    public static Period calculateAge(LocalDate birthDate) {
        // Récupère la date actuelle
        LocalDate today = LocalDate.now();
        // Calcule la différence entre la date de naissance et la date actuelle
        return Period.between(birthDate, today);
    }

    // Méthode pour afficher l'âge de façon lisible
    public static String getAgeString(Period age) {
        return "Vous avez " + age.getYears() + " ans, " + age.getMonths() + " mois et " + age.getDays() + " jours.";
    }
}
