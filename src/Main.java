public class Main {
    public static void main(String[] args)
    {

        Product products = new Product();
        // boş Constructor oluşturmazsak Product altını çizer.
        ProductManager productManager = new ProductManager();

        products.setId(1);
        products.setName("Notebook");
        products.setDetail("16 Gb Ram");
        products.setInitPrice(10000);
        products.setDiscont(10);

        productManager.Add(products);
        System.out.println(products.getDiscontSalePrice());

    }
}