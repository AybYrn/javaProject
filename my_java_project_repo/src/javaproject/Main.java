
package javaproject;
import GUI.WelcomePage;


public class Main {
   
    
    public static void main(String[] args){
       FlightSys.addFlight("International Flight","Pegasus-PC1100","16-Jan-22 | 13:45 - 20:00 " ,"Madrid - Istanbul", 69, 1313, "0","-",0.0,"-","-");
       FlightSys.addFlight("Domestic Flight","Turkish Airlines-TK2305","20-Jan-22 | 04:40 - 05:45 " ,"Izmir - Istanbul", 20, 869, "0","-",0.0,"-","-");
       FlightSys.addFlight("Domestic Flight","Turkish Airlines-TK7070","17-Jan-22 | 08:00 - 09:25 " ,"Ankara - Erzurum",11 , 338, "0","-",0.0,"-","-");
       FlightSys.addFlight("Domestic Flight","Sun Express-XQ9271","21-Jan-22 | 10:00 - 11:11 " ,"Trabzon - Antalya", 1, 496, "0","-",0.0,"-","-");
       FlightSys.addFlight("International Flight","Emirates-EK122","16-Jan-22 | 13:45 - 20:00 " ,"Istanbul - Dubai", 87, 1972,"0","-",0.0,"-","-");
       FlightSys.addFlight("International Flight","Lufthansa-XQ794","22-Jan-22 | 4:55 - 6:45 " ,"Ankara-Dusseldorf", 75, 1742, "0","-",0.0,"-","-");

       
       
       new WelcomePage().setVisible(true);
    }
}
