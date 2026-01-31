/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import model.Vehicle;

/**
 *
 * @author Hyungs
 */
public class VehicleDirectory {
    
    private ArrayList<Vehicle> vehicles;
    
    public VehicleDirectory() {
        this.vehicles = new ArrayList<Vehicle>();
    }
    
    public ArrayList<Vehicle> getVehicles () {
        return vehicles;
    }
    
    
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public Vehicle addVehicle() {
        Vehicle v = new Vehicle();
        vehicles.add(v);
        return v;
    }
    
    public void deleteVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    
        public Vehicle searchByOwnerId(String ownerId) {
        for (Vehicle v : vehicles) {
            if (v.getOwnerId().contains(ownerId)) {
                return v;
            }
        }
        return null;
    }
        
        public ArrayList<Vehicle> searchByOwnerFirstName(String ownerFirstName) {
            ArrayList<Vehicle> result = new ArrayList<>();
            
            for (Vehicle v : vehicles) {
                if (v.getOwnerFirstName().contains(ownerFirstName)) {
                    result.add(v);
                }
            }
            return result;
        }
}
