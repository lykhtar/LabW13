package lab13_1;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "Body"
}
)
@XmlRootElement(name = "Envelope")
public class Envelope {

    @XmlElementRef(name  = "Body", namespace = "", type = JAXBElement.class )
    protected List<JAXBElement<? extends Body>> body;

    public List<JAXBElement<? extends Body>> getSchedule() {
        if (body == null) {
            body = new ArrayList<>();
        }
        return this.body;
    }
}
