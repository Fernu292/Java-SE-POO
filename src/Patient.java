public class Patient {

    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;

    private String blood;
    private double weight;
    private double height;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    //Setters and Getters

    //Weight
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight+" Kg.";
    }

    //Height
    public String getHeight() {
        return height+" Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Blood
    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //PhoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe tener 8 digitos maximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    //BirthDay
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
