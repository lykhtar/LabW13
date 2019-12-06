package lab13_1;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class Lab13_1 {

    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(lab13_1.ObjectFactory.class);
            Unmarshaller um = jc.createUnmarshaller();
            String schemaName = "E:\\КПО\\Lab13_1\\soap.xsd";
            SchemaFactory factory
                    = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File schemaLocation = new File(schemaName);// создание схемы и перадача ее демарашаллизатору
            Schema schema = factory.newSchema(schemaLocation);
            um.setSchema(schema);
            lab13_1.Envelope st = (lab13_1.Envelope) um.unmarshal(new File("E:\\КПО\\Lab13_1\\soap.xml"));
            System.out.println(st);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
