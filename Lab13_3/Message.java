package lab13_34;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "message", propOrder = {
    "GetTimeTableSoapIn",
    "GetTimeTableSoapOut"
})
public class Message {

    private String GetTimeTableSoapIn;
    private String GetTimeTableSoapOut;

    public Message() {// необходим для маршаллизации/демаршалиизации XML
    }

    public Message(String GetTimeTableSoapIn, String GetTimeTableSoapOut) {
        this.GetTimeTableSoapIn = GetTimeTableSoapIn;
        this.GetTimeTableSoapOut = GetTimeTableSoapOut;

    }

    public String getGetTimeTableSoapIn() {
        return GetTimeTableSoapIn;
    }

    public void setGetTimeTableSoapIn(String GetTimeTableSoapIn) {
        this.GetTimeTableSoapIn = GetTimeTableSoapIn;
    }

    public String getGetTimeTableSoapOut() {
        return GetTimeTableSoapOut;
    }

    public void setGetTimeTableSoapOut(String GetTimeTableSoapOut) {
        this.GetTimeTableSoapOut = GetTimeTableSoapOut;
    }

    public String toString() {
        return "\nSchema:" + "\n\tGetTimeTableSoapIn: " + GetTimeTableSoapIn + "\n\tGetTimeTableSoapOut: " + GetTimeTableSoapOut + "\n";

    }
}
