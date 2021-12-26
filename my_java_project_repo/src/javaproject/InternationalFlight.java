package javaproject;

public class InternationalFlight extends Flight{

    private String passportId;
    private Cargo cargo;

    public InternationalFlight(String flightId, String flighDateTime, String fromtoDest, int gate, double price, String passportId,double weight,String seat,String nameSurname) {
        super(flightId, flighDateTime, fromtoDest, gate, price,seat,nameSurname);
        this.passportId = passportId;
        this.cargo = new Cargo(weight);
                
    }

    @Override
    public void calculatePrice() {
         double airportServiceCharge = 50;
         double vatRatio = 0.20; //vat(kdv)ratio %20
         this.price+=(price*vatRatio)+airportServiceCharge;
        
        
            if(cargo.getWeight()>25){ //if cargo weight is more than 25 KG 
                this.price+= 75; //add 100$ to price and create new price.
            }
    }

    public String getPassportId() {
        return passportId;
    }

    public double getPrice() {
        return price;
    }

    
    
    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return super.toString();           
    }

   

}
