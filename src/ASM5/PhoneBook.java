package ASM5;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class PhoneBook extends Phone {
    private ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    private  void setPhoneList(ArrayList<PhoneNumber> PhoneList) {
        String phone = null;
        String name = null;
        for (PhoneNumber entry : PhoneList) {
            name = "";
            if (entry.getName().equalsIgnoreCase(name)) {
                phone = "";
                if (!entry.getPhones().contains(phone)) {
                    entry.add(phone);
                }
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name, phone));
    }
    public void updatePhoneList(ArrayList<PhoneNumber> PhoneList) {
        ArrayList<String> name = null;
        PhoneList.removeIf(entry -> entry.getPhones().equals(name));
    }
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber entry : PhoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                ArrayList<String> phones = new ArrayList<>();
                phones.add(newphone);
                entry.setPhones(phones);
                return;
            }
        }
        System.out.println("Không tìm thấy tên: " + name);
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber entry : PhoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Không tìm thấy tên: " + name);
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, Comparator.comparing(PhoneNumber::getName));
    }

    // Optional: In danh bạ
    public void printAll() {
        for (PhoneNumber entry : PhoneList) {
            System.out.println(entry);
        }
    }


    public void insertPhone(String nam, String number) {

    }

    public void removePhone(String nam) {

    }
}
