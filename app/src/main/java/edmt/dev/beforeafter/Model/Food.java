package edmt.dev.beforeafter.Model;

/**
 * Created by ADMIN on 12-Apr-18.
 */

public class Food {
    private String Name,Image,Description,Price,Discount,MenuId;

    public Food() {
    }

    public Food(String name, String menuId, String discount, String price, String description, String image) {
        Name = name;
        MenuId = menuId;
        Discount = discount;
        Price = price;
        Description = description;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
