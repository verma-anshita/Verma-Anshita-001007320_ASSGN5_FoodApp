package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.RestaurantEmployee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.SysAdmin.SysAdminDirectory;
import java.util.Date;

/**
 *
 * @author anshitaverma
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        system.setSysAdminDirectory(new SysAdminDirectory(new Date(), new Date(), "root", "root"));
        system.getSysAdminDirectory().createSysAdmin("RootUser", "8456711854", "ver.ans.edu", 
                "sysadmin", "sysadmin", Role.SysAdmin, new Date(), new Date(), "root", "root");
        
        system.setCustomerDirectory(new CustomerDirectory());
        system.getCustomerDirectory().getCustomers().add(new Customer("anshitaverma", "8774351708", "ver.ans@customer.com", 
                "anshitacustomer", "password", Role.Customer, new Date(), new Date(), "root", "root"));
        
        RestaurantDirectory bostonRestaurantDirectory = new RestaurantDirectory();
        bostonRestaurantDirectory.getRestaurants().add(new Restaurant("MumbaiSpice", "6789121234", " Huntington ", "mumbaispice@gmail.com"));
        
        bostonRestaurantDirectory.getRestaurants().get(0).getRestaurantEmployeeDirectory().getEmployeeList().add(
            new RestaurantEmployee("anshitaRestaurant", "8456711854", "ver.ans@restaurant.com", 
                "anshitarestaurant", "password", Role.RestaurantAdmin, new Date(), new Date(), "root", "root"));
        
        DeliveryManDirectory bostonDeliveryManDirectory = new DeliveryManDirectory();
        system.getCityNetworks().add(new CityNetwork(CityName.Boston, bostonRestaurantDirectory, bostonDeliveryManDirectory, 
                new Date(), new Date(), "root", "root"));
        
        return system;
    }
    
}
