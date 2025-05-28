package ASM5;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public void addPhone(String phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }

    @Override
    public String toString() {
        return name + ": " + phones.toString();
    }

    public void add(String phone) {

    }
}
