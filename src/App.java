import java.util.Scanner;

import facilities.Facility;
import facilities.FacilityFactory;
import healthworkers.Doctor;
import healthworkers.HealthWorker;
import healthworkers.Nurse;
import patients.Patient;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter facility type: ");
        Integer facilityType = scanner.nextInt();

        Facility facility = FacilityFactory.createFacility(facilityType,"Mulago","Kampala");
        if (facility != null) {
            facility.printDetails();
            Nurse jen = new Nurse("Jeniffer", "Muk", "77777", "456789456");
            facility.addHealthWorker(jen);
            facility.addHealthWorker(new Doctor("Jjumba", "Kikoni", "045245245", "jjumba@jjumba"));
            jen.registerPatient(new Patient("John", "Doe", "123456789", 25));
        } else {
            System.out.println("Invalid facility type");
        }
    }
}