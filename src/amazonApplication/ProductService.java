package amazonApplication;

public class ProductService {
    int orderitems;
    int footwearPrice=500;
    int bagsPrice =200;
    int watchesPrice=2000;
    int jeansPrice=1000;
    int totalProducts;


    int items(Product product){
      totalProducts= (product.bags+ product.jeans+ product.watches+ product.footwear);

      orderitems= orderitems+totalProducts;
        System.out.println();
        return orderitems;
    }



}
