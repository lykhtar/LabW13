package lab13_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name ="getProductDetails",  propOrder = {"productID",
    "productName",
    "prodPrice"
}
)
public class getProductDetails {

    @XmlElement(required = true)
    protected String productID;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String prodPrice;

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

}
