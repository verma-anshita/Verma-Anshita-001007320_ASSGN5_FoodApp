/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author anshitaverma
 */
public class RestaurantEmployee extends UserAccount{
    
    public RestaurantEmployee(String name, String phoneNo, String email, String userName, String password, Role role, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, userName, password, role, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
