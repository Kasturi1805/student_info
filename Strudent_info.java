
public class Strudent_info {
    String name,ID,Course,Address,Mobile_no;
   

    public Strudent_info(String name, String iD, String course,String Address,String Mobile_no) {
        this.name = name;
        ID = iD;
        Course = course;
        Address = Address;
        Mobile_no = Mobile_no;
    }



    public void displayInfo(){
        System.out.println("Student name:"+name);
        System.out.println("Student id:"+ID);
        System.out.println("Student Course:" +Course);
        System.out.println("Student Address:" +Address);
        System.out.println("Student Mobile_no:" +Mobile_no);

    }

    public static void main(String[] args) {
        Strudent_info s = new Strudent_info("Anu", "01fe23bca248", "BCA","Delhi","8123456789");
    }

}

