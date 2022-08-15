public class Product
{
    private int  id;
    private String name;
    private double initPrice;
    private String detail;
    private double discont;
    private double discontSalePrice;

    public  Product(){

    }
    public Product (int id, String name, double initPrice, String detail, double discont, double discontSalePrice){
        super();
        this.id = id;
        this.name= name;
        this.initPrice=initPrice;
        this.detail=detail;
        this.discont=discont;
        this.discontSalePrice=discontSalePrice;
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

    public double getInitPrice() {
        return initPrice;
    }

    public void setInitPrice(double initPrice) {
        this.initPrice = initPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscont() {
        return discont;
    }

    public void setDiscont(double discont) {
        this.discont = discont;
    }

    public double getDiscontSalePrice() {

        return initPrice-(initPrice*discont/100);
    }

}
