//64050030 นาย กิติภูมิ หน่อเนื้อ
package oop1_1_64050030;
//make this class a subclass of customer
public class RegularCustomer extends Customer {

    @Override
    public String createMail() {
        return "Regular Customer";
    }
    
}
