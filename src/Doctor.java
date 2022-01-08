public class Doctor {
    //Atributos de la clase
    static int id = 0;//Auto increment
    String name;
    String email;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo un doctor");
    }
    Doctor(String name,String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(this.name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
