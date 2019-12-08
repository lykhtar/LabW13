package lab13_34;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "types", propOrder = {"schema"})
public class Types {

    @XmlElement(required = true)
    private Schema schema = new Schema();

    public Types() {
    } // необходим для маршаллизации/демаршалиизации XML

    public Types(Schema schema) {
        this.schema = schema;

    }

    public Schema getSchema() {
        return schema;
    }

    public void setGSchema(Schema schema) {
        this.schema = schema;
    }

    public String toString() {
        return "\nschema: " + schema;

    }

}
