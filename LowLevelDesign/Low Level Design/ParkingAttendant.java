public class ParkingAttendant extends Account{
    Payment paymentService;

    public boolean processVehicleEntry(Vehicle vehicle);
    public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType);

}

