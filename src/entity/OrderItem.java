package entity;

public class OrderItem {
    //订单项id
    private String itemid;
    //商品个数
    private int count;
    //金额小计
    private Double subMoney;
    //订单项中商品
    private Product product;
    //订单项所属订单
    private Order order;


    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getSubMoney() {
        return subMoney;
    }

    public void setSubMoney(Double subMoney) {
        this.subMoney = subMoney;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
