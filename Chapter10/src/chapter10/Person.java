package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Person {
    private String name;
    private String last_name;
    private String adress;
    private Integer zip_code;
    private Integer phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setZip_code(Integer zip_code) {
        this.zip_code = zip_code;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", last_name=" + last_name + ", adress=" + adress + ", zip_code=" + zip_code + ", phone=" + phone + '}';
    }
    
    
}
