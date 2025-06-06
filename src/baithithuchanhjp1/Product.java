package baithithuchanhjp1;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    // Constructor mặc định
    public Product() {
        this.id = 0;
        this.name = "";
        this.thumbnail = "";
        this.price = 0.0;
        this.qty = 0;
        this.description = "";
    }

    // Getters và Setters
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Hiển thị thông tin sản phẩm
    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Thumbnail path: " + thumbnail);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + qty);
        System.out.println("Description: " + description);
    }

    // Kiểm tra số lượng có đủ để đặt hàng hay không
    public boolean checkAvailability(int orderQty) {
        return orderQty <= qty;
    }

    // Đặt hàng: giảm số lượng tồn kho, trả về tổng tiền đơn hàng
    public double placeOrder(int orderQty) {
        if (checkAvailability(orderQty)) {
            qty -= orderQty;
            return orderQty * price;
        } else {
            return -1;  // hoặc có thể ném ngoại lệ nếu muốn
        }
    }

}
