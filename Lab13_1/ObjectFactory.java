package lab13_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry

public class ObjectFactory {

    private final static QName _Envelope_QNAME = new QName("", "Envelope");
    private final static QName _Body_QNAME = new QName("", "Body");
    private final static QName _GetProdDet_QNAME = new QName("", "getProductDetails");
   

    public ObjectFactory() {
    }

    public Envelope createEnv() {
        return new Envelope();
    }

    public Body createBody() {
        return new Body();
    }

    public getProductDetails creategetProductDetails() {
        return new getProductDetails();
    }

   

    @XmlElementDecl(namespace = "", name = "Envelope")

    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<>(_Envelope_QNAME, Envelope.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "Body",
            substitutionHeadNamespace = "",
            substitutionHeadName = "Envelope"
    )
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<>(_Body_QNAME, Body.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "getProductDetails",
            substitutionHeadNamespace = "",
            substitutionHeadName = "Body"
    )
    public JAXBElement<getProductDetails> creategetProductDetails(getProductDetails value) {
        return new JAXBElement<>(_GetProdDet_QNAME, getProductDetails.class, null, value);
    }

  
}
