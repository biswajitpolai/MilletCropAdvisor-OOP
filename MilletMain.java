
import java.util.ArrayList;
import java.util.Scanner;

public class MilletMain 
{
    public static void main(String[] args) 
    {
        ArrayList<Millet> millets = new ArrayList<>();
        millets.add(new Jowar());
        millets.add(new PearlMillet());
        millets.add(new FoxtailMillet());
        millets.add(new KodoMillet());
        millets.add(new BrowntopMillet());
        millets.add(new ProsoMillet());
        millets.add(new LittleMillet());
        millets.add(new RagiMillet());
        millets.add(new BarnyardMillet());

Scanner scanner = new Scanner(System.in);

        System.out.print("Enter soil pH:");
        double ph = scanner.nextDouble();
        System.out.print("Enter soil type: ");
        String soilType = scanner.next();
        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();
        System.out.print("Is the land irrigated? (true/false): ");
        boolean isIrrigated = scanner.nextBoolean();

        boolean milletFound = false;
        for (Millet millet : millets)
            {
            if (millet.matches(ph, soilType, temperature, isIrrigated))
            {
                millet.displayInfo();
                ((Recommender) millet).recommend();
                milletFound = true;
                System.out.println();
            }
        }

        if (!milletFound)
        {
            System.out.println("No suitable millet found for the provided conditions.");
        }
    }
}

