import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, moi, c'est Calculateur age!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une année de naissance : ");
        int anneNaissance = scanner.nextInt();

        System.out.println("Entrez une année de naissance : ");
        int moisNaissance = scanner.nextInt();

        System.out.println("Entrez une année de naissance : ");
        int jourNaissance = scanner.nextInt();

        LocalDate dateNaissance = LocalDate.of(anneNaissance, moisNaissance, jourNaissance);

        LocalDate dateAjourdhui = LocalDate.now();

        Period age = Period.between(dateNaissance, dateAjourdhui);

        System.out.println("Vous avez " + age.getYears() + "ans, " + age.getMonths()+" mois et " + age.getDays() + " jours.");

    }
}