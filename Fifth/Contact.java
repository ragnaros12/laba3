package com.company.Fifth;

public class Contact {
    private int Id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;

    public Contact(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{\r\n" + "\tId=" + Id +
                ",\r\n\tfirstName='" + firstName + '\'' +
                ",\r\n\tlastName='" + lastName + '\'' +
                ",\r\n\taddress='" + address + '\'' +
                ",\r\n\tphone='" + phone + '\'' +
                ",\r\n\tnote='" + note + '\'' +
                "\r\n}";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
