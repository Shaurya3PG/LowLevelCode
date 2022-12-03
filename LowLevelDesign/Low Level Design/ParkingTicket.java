import java.util.Date;

public class ParkingTicket {
    int ticketId;
    int levelid;
    int spaceId;
    Date vehicleEntryDateTime;
    Date vehicleExitDateTime;
    double totalCost;
    ParkingTicketStatus parkingTicketStatus;

    public void updateTotalCost();
    public void updateVehicleExitTime(Date vehicleExitDateTime);

}
