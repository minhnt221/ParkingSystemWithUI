/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Ticket implements Serializable {
    private static int count = 0;
    private int ticketID;
    private Vehicle vehicle;
    private Slots slot;
    private double price;
    
    public Ticket(Vehicle v, Slots s){
        count++;
        ticketID = count;
        vehicle = v;
        slot = s;
        price = 5000;
    }
    
    public static int getCount(){
        return count+1;
    }
    
    public int getID(){
        return ticketID;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Slots getSlot(){
        return slot;
    }
    
    public String toString(){
        String str = "Ticket information:" +
                    "\nTicket ID: " + getID() +
                    "\nLicense Plate: " + vehicle.getLicPlate() +
                    "\nSlot: " + slot.getSlotNumber() +
                    "\nPrice: " + getPrice();
        return str;
    }
}
