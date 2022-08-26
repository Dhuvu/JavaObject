package JavaObject;

public class JavaObjExample {

    int id=1;
    String name="Java";
    public void empData(){
        System.out.println("Employee id ="+id);
        System.out.println("Employee name ="+name);
    }

    static void staticData(){
        System.out.println("Static Method ");

    }

    public static void main(String[] args) {
        JavaObjExample example=new JavaObjExample();
        example.empData();
        staticData();
    }
}
