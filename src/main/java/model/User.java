package model;

public abstract class User {

    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe tener maximo 10 dígitos");
        } else if (phoneNumber.length() < 8) {
            System.out.println("El numero telefonico debe tener minimo 10 dígitos");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nEmail: " + email +
                "\nAddress: " + address + "\nPhone: " + phoneNumber;
    }

    public abstract void showDataUser();
}
