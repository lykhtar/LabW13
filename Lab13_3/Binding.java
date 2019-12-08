package lab13_34;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "binding", propOrder = {
    "OnlineTimeTableSoap"
})
public class Binding {

    private String OnlineTimeTableSoap;

    public Binding() {// необходим для маршаллизации/демаршалиизации XML
    }

    public Binding(String OnlineTimeTableSoap) {
        this.OnlineTimeTableSoap = OnlineTimeTableSoap;

    }

    public String getOnlineTimeTableSoap() {
        return OnlineTimeTableSoap;
    }

    public void setOnlineTimeTableSoap(String OnlineTimeTableSoap) {
        this.OnlineTimeTableSoap = OnlineTimeTableSoap;
    }

    public String toString() {
        return "\nSchema:" + "\n\tOnlineTimeTableSoap: " + OnlineTimeTableSoap + "\n";

    }
}
