package studio.model;

public class Equipment {
    private String id;
    private String name;
    private String category;
    private int quantity;
    private String condition;

    public Equipment(String id, String name, String category, int quantity, String condition) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.condition = condition;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public String getCondition() { return condition; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setCondition(String condition) { this.condition = condition; }
}
