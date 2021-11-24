
package q1;

import java.util.Scanner;

public class Organization {
    private int organizationId;
    private String companyName;
    private String ownerName ;
    private double price;
    private int duration;

    public Organization() {
    }
    
    void calculate(double Hprice){
        this.price = duration*Hprice;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }
    
    
    
    void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Company Name:");
        this.companyName=input.nextLine();
        System.out.println("Enter owner name:");
        this.ownerName=input.nextLine();
        System.out.println("Enter the organization duration:");
        this.duration=input.nextInt();
    }

    @Override
    public String toString() {
        return  "\norganizationId=" + organizationId +"\n"+ " companyName=" + companyName +"\n"+ " ownerName=" + ownerName +"\n" +" price=" + price +"\n"+" duration=" + duration;
    }
        

    
}
