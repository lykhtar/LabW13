package lab13_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "getProductDetails"
})

public class Body {

    @XmlElement(required = true)
    protected getProductDetails getProductDetails;
  

    public getProductDetails getgetProductDetails() {
        return getProductDetails;
    }

    public void setgetProductDetails(getProductDetails getProductDetails) {
        this.getProductDetails = getProductDetails;
    }


}


