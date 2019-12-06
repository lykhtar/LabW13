package lab13_1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {"getProductDetails"})
// задание последовательности элементов XML
public class Body {

    @XmlElement(required = true)
    private GetProductDetails getProductDetails = new GetProductDetails();

    public Body() {
    } // необходим для маршаллизации/демаршалиизации XML

    public Body(GetProductDetails gpd) {
        this.getProductDetails = gpd;

    }

    public GetProductDetails getGetProductDetails() {
        return getProductDetails;
    }

    public void setGetProductDetails(GetProductDetails gpd) {
        this.getProductDetails = gpd;
    }

    public String toString() {
        return "\nGetProductDetails: " + getProductDetails;

    }

    @XmlRootElement
    @XmlType(name = "getProductDetails", propOrder = {
        "productID",
        "productName",
        "prodPrice"
    })
    public static class GetProductDetails { // внутренний класс

        private String productID;
        private String productName;
        private String prodPrice;

        public GetProductDetails() {// необходим для маршаллизации/демаршалиизации XML
        }

        public GetProductDetails(String productID, String productName, String prodPrice) {
            this.productID = productID;
            this.productName = productName;
            this.prodPrice = prodPrice;
        }

        public String getproductID() {
            return productID;
        }

        public void setproductID(String productID) {
            this.productID = productID;
        }

        public String getproductName() {
            return productName;
        }

        public void setproductName(String productName) {
            this.productName = productName;
        }

        public String getprodPrice() {
            return prodPrice;
        }

        public void setprodPrice(String prodPrice) {
            this.prodPrice = prodPrice;
        }

        public String toString() {
            return "\nLessons:" + "\n\tproductID: " + productID + "\n\tproductName: " + productName + "\n\tprodPrice: " + prodPrice + "\n";

        }
    }

    
    
}
