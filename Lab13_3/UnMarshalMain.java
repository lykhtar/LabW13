
package lab13_34;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalMain {

    public void unMarshalMain() {
        try {
            JAXBContext jc = JAXBContext.newInstance(Definition.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("E:\\КПО\\Lab13_34\\test.wsdl");
            Definition prod = (Definition) u.unmarshal(reader);
            System.out.println(prod);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
