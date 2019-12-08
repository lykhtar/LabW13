
package lab13_34;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "schema", propOrder = {
    "GetAirportsList",
    "GetAirportsListResponse",
    "AirportsResponse",
    "Airport"
})

public class Schema { // внутренний класс

    private String GetAirportsList;
    private String GetAirportsListResponse;
    private String AirportsResponse;
    private String Airport;

    public Schema() {// необходим для маршаллизации/демаршалиизации XML
    }

    public Schema(String GetAirportsList, String GetAirportsListResponse, String AirportsResponse, String Airport) {
        this.GetAirportsList = GetAirportsList;
        this.GetAirportsListResponse = GetAirportsListResponse;
        this.AirportsResponse = AirportsResponse;
        this.Airport = Airport;
    }

    public String getGetAirportsList() {
        return GetAirportsList;
    }

    public void setGetAirportsList(String GetAirportsList) {
        this.GetAirportsList = GetAirportsList;
    }

    public String getGetAirportsListResponse() {
        return GetAirportsListResponse;
    }

    public void setGetAirportsListResponse(String GetAirportsListResponse) {
        this.GetAirportsListResponse = GetAirportsListResponse;
    }

    public String getAirportsResponse() {
        return AirportsResponse;
    }

    public void setAirportsResponse(String AirportsResponse) {
        this.AirportsResponse = AirportsResponse;
    }

    public String getAirport() {
        return Airport;
    }

    public void setAirport(String Airport) {
        this.Airport = Airport;
    }

    public String toString() {
        return "\nSchema:" + "\n\tGetAirportsList: " + GetAirportsList + "\n\tGetAirportsListResponse: " + GetAirportsListResponse + "\n\tAirportsResponse: " + AirportsResponse + "\n\tAirport: " + Airport + "\n";

    }
}
