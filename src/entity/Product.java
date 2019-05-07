package entity;

public class Product {
    /***
     * `id` varchar (100) primary key ,
     *   `name` varchar (40),
     *   `price` double,
     *   `category` varchar(40),
     *   `pnum` int ,
     * 	`imgurl` varchar(100),
     * 	`description` varchar(255)
     */
    private int id;
    private String name;
    private String category;
    private int pnum;
    private String imgurl;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
