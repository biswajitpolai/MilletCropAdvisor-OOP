import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class Millet
abstract class Millet {
    private String name;
    private double phMin;
    private double phMax;
    private String soilType;
    private int temperatureMin;
    private int temperatureMax;
    private boolean irrigated;
    private String fertilizerRecommendation;
    private String sowingMethod;
    private String pestManagement;

    // Constructor
    public Millet(String name, double phMin, double phMax, String soilType,
                  int temperatureMin, int temperatureMax, boolean irrigated,
                  String fertilizerRecommendation, String sowingMethod,
                  String pestManagement) {
        this.name = name;
        this.phMin = phMin;
        this.phMax = phMax;
        this.soilType = soilType;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.irrigated = irrigated;
        this.fertilizerRecommendation = fertilizerRecommendation;
        this.sowingMethod = sowingMethod;
        this.pestManagement = pestManagement;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // Method to check if millet matches given conditions
    public boolean matches(double ph, String soilType, int temperature, boolean isIrrigated) {
        return this.phMin <= ph && ph <= this.phMax &&
               this.soilType.equalsIgnoreCase(soilType) &&
               this.temperatureMin <= temperature && temperature <= this.temperatureMax &&
               this.irrigated == isIrrigated;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFertilizerRecommendation() {
        return fertilizerRecommendation;
    }

    public String getSowingMethod() {
        return sowingMethod;
    }

    public String getPestManagement() {
        return pestManagement;
    }
}

// Interface for recommendation
interface Recommender {
    void recommend();
}

// Subclass for different millet types
class Jowar extends Millet implements Recommender {
    public Jowar() {
        super("Jowar (Sorghum)", 6.0, 7.0, "Sandy loam", 25, 35, true,
              "Nitrogenous and phosphatic fertilizers in small quantities.", "Seed drill",
              "Minimal or no requirement for pesticides.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Jowar is a cereal grain known for its drought tolerance.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class PearlMillet extends Millet implements Recommender {
    public PearlMillet() {
        super("Pearl Millet (Bajra)", 5.5, 7.5, "Sandy soil", 28, 38, true,
              "Phosphatic fertilizers", "Seed drill or Transplanting",
              "Minimal pest issues; occasional pesticides.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Pearl Millet is rich in iron and can grow in harsh conditions.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

// Additional Millet Subclasses
class FoxtailMillet extends Millet implements Recommender {
    public FoxtailMillet() {
        super("Foxtail Millet", 5.5, 7.5, "Loamy soil", 20, 30, true,
              "Balanced NPK fertilizers", "Broadcasting", "Minimal pest issues.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Foxtail Millet is known for its short growing season and drought resistance.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class KodoMillet extends Millet implements Recommender {
    public KodoMillet() {
        super("Kodo Millet", 6.0, 7.5, "Clay loam", 25, 35, true,
              "Organic manures", "Drilling", "Crop rotation to manage pests.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Kodo Millet is a hardy crop that can grow in poor soils.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class BrowntopMillet extends Millet implements Recommender {
    public BrowntopMillet() {
        super("Browntop Millet", 5.5, 7.0, "Well-drained soil", 20, 35, true,
              "Balanced fertilizers", "Broadcasting", "Minimal pest issues.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Browntop Millet is known for its quick maturity and nutritious value.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class ProsoMillet extends Millet implements Recommender {
    public ProsoMillet() {
        super("Proso Millet", 6.0, 7.5, "Loamy soil", 18, 28, false,
              "Balanced NPK fertilizers", "Broadcasting", "Minimal pest issues.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Proso Millet is known for its short growing season and low water requirement.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class LittleMillet extends Millet implements Recommender {
    public LittleMillet() {
        super("Little Millet", 5.5, 7.0, "Loamy soil", 20, 30, true,
              "Organic manures", "Drilling", "Minimal pest issues.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Little Millet is a small-seeded crop that can grow in diverse conditions.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class RagiMillet extends Millet implements Recommender {
    public RagiMillet() {
        super("Finger Millet (Ragi)", 5.0, 8.0, "Loamy soil", 20, 30, true,
              "Balanced fertilizers", "Broadcasting", "Crop rotation to manage pests.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Finger Millet is known for its high calcium content.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}

class BarnyardMillet extends Millet implements Recommender {
    public BarnyardMillet() {
        super("Barnyard Millet", 5.5, 7.5, "Well-drained soil", 18, 28, true,
              "Balanced fertilizers", "Broadcasting", "Minimal pest issues.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Barnyard Millet is known for its quick growing season and nutritious value.");
    }

    @Override
    public void recommend() {
        System.out.println("Recommended Millet: " + getName());
        System.out.println("Recommended Fertilizer: " + getFertilizerRecommendation());
        System.out.println("Recommended Sowing Method: " + getSowingMethod());
        System.out.println("Pest Management: " + getPestManagement());
    }
}