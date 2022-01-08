
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args){
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");

        myDoctor.showName();
        myDoctor.showId();

        Patient patient = new Patient("Fernando", "fernu292@gmail.com");
        patient.setWeight(62.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

    }

}

