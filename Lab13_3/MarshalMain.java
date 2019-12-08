package lab13_34;

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
            JAXBContext context = JAXBContext.newInstance(Definition.class);
            Marshaller m = context.createMarshaller();
            Definition st = new Definition() {
                {
                    Schema gpd = new Schema("Хитроу", "343", "657", "Хитроу");
                    Types s = new Types(gpd);
                    this.add(s);

                    Message st1 = new Message("12", "11");
                    this.addMessage(st1);
                    Binding st2 = new Binding("32");
                    this.addBinding(st2);
                }
            };

            m.marshal(st, new FileOutputStream("E:\\КПО\\Lab13_34\\test.wsdl"));
            m.marshal(st, System.out); // копия на консоль
            System.out.println("XML-файл создан");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException ex) {
            Logger.getLogger(MarshalMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
