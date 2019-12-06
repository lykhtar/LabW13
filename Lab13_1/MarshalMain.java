package lab13_1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarshalMain {

    public void marshalMain() {
        try {
            JAXBContext context = JAXBContext.newInstance(Envelope.class);
            Marshaller m = context.createMarshaller();
            Envelope st = new Envelope() {
                {
                    Body.GetProductDetails gpd = new Body.GetProductDetails("111", "Printer", "657");
                    Body s = new Body(gpd);
                    this.add(s); // добавление второго предмета и учителя
                }
            };

            m.marshal(st, new FileOutputStream("E:\\КПО\\Lab13_1\\soap.xml"));
            m.marshal(st, System.out); // копия на консоль
            System.out.println("XML-файл создан");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException ex) {
            Logger.getLogger(MarshalMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
