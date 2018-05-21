package genericss;

import java.util.ArrayList;
import java.util.List;

public class CoContraVariances {

    public static void main(String... args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Train> trains = new ArrayList<>();
        operate(vehicles);
        //the below won't be valid
        // as Vehicle is not a subtype of Train
        //but why does this happen on Kotlin???
        //operate(trains);
    }

    static void operate(List<Vehicle> vehicles) {

    }
}
