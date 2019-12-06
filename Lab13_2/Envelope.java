package lab13_1;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Envelope {

    @XmlElement(name = "Body")
    private ArrayList<Body> list = new ArrayList<Body>();

    public Envelope() {
        super();
    }

    public void setList(ArrayList<Body> list) {
        this.list = list;
    }

    public boolean add(Body st) {
        return list.add(st);
    }

    @Override

    public String toString() {
        return "Body :" + list + "]";
    }
}
