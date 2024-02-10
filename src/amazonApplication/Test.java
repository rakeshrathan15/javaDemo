package amazonApplication;

public class Test {

    public static void main(String[] args) {
        AmazonLogin amazonLogin = new AmazonLogin();
        AmazonLoginServices amazonLoginServices = new AmazonLoginServices();
        amazonLogin.email="rakesh@gmail.com";
        amazonLogin.password="1234";
        boolean loginStatus = amazonLoginServices.loginDetails(amazonLogin);
        System.out.println(loginStatus);
        if(loginStatus){
            Product product= new Product();
            ProductService productService= new ProductService();
            product.jeans=3;
            int output= productService.items(product);
            System.out.println(output);

        }
    }
}
