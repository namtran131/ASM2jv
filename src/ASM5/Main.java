package ASM5;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook() {
            @Override
            public void insertPhone(String name, String phone) {

            }

            @Override
            public void removePhone(String name) {

            }
        };
        pb.insertPhone("Nam", "0123456789");
        pb.insertPhone("Khác", "0987654321");
        pb.insertPhone("Nam", "0123456789"); // đã có rồi, không thêm
        pb.insertPhone("Nam", "0111111111"); // thêm mới

        pb.searchPhone("Nam");

        pb.updatePhone("Đức", "0999999999");
        pb.searchPhone("Công");

        pb.removePhone("Nam");
        pb.searchPhone("Nam");

        pb.insertPhone("Lực", "0333333333");
        pb.insertPhone("AFGGHH", "0444444444");
        pb.sort();
        pb.printAll();
    }
}
