package regis;

public class UserDetails  implements java.io.Serializable {


     private String mobile;
     private String firstName;
     private String lastName;
     private String email;
     
     private String address;
     private String city;
     private String state;

    public UserDetails() {
    }

	
    public UserDetails(String mobile, String firstName) {
        this.mobile = mobile;
        this.firstName = firstName;
         }
    public UserDetails(String mobile, String firstName, String lastName, String email, String address, String city, String state) {
       this.mobile = mobile;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       
       this.address = address;
       this.city = city;
       this.state = state;
    }
   
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}


