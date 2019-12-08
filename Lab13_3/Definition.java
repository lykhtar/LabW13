package lab13_34;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

public class Definition {

    @XmlElement(name = "types")
    private ArrayList<Types> list = new ArrayList<Types>();
    @XmlElement(name = "messsage")
    private ArrayList<Message> list1 = new ArrayList<Message>();
    @XmlElement(name = "binding")
    private ArrayList<Binding> list2 = new ArrayList<Binding>();

    public Definition() {
        super();
    }

    public void setList(ArrayList<Types> list) {
        this.list = list;
    }

    public boolean add(Types st) {
        return list.add(st);
    }

    @Override

    public String toString() {
        return "Types :" + list + "]";
    }

    public void setMessage(ArrayList<Message> list1) {
        this.list1 = list1;
    }

    public boolean addMessage(Message st1) {
        return list1.add(st1);
    }

    public String toString1() {
        return "Message :" + list1 + "]";

    }

    public void setListBinding(ArrayList<Binding> list2) {
        this.list2 = list2;
    }

    public boolean addBinding(Binding st2) {
        return list2.add(st2);
    }

    public String toString2() {
        return "Binding :" + list2 + "]";
    }
}
