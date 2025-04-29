
public class Strudent_info {
    String name,ID,Course;

   

    public Strudent_info(String name, String iD, String course) {
        this.name = name;
        ID = iD;
        Course = course;
    }



    public void displayInfo(){
        System.out.println("Student name:"+name);
        System.out.println("Student id:"+ID);
        System.out.println("Student Course:" +Course);

    }

    public static void main(String[] args) {
        Strudent_info s = new Strudent_info("Anu", "01fe23bca248", "BCA");
    }

}

