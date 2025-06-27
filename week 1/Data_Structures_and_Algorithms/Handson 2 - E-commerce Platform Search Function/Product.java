
public class Product{
    int pId;
    String Name;
    String category;

    public Product(int productId, String productName, String category) {
        this.pId = productId;
        this.Name = productName;
        this.category = category;
    }

    public static Product lSearch(Product[] products, int id){
        for(Product p : products){
            if(p.pId == id)
                return p;
        }
        return null;
    }

    public static Product bSearch(Product[] products, int id) {
        int l = 0;
        int r = products.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(products[mid].pId==id)
                return products[mid];
            else if(products[mid].pId<id)
                l = mid+1;
            else
                r = mid-1;
        }
        return null;
    }

}
