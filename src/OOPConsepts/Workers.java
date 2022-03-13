package OOPConsepts;

public class Workers {
    String name;
    String LastName;
    private String email="default@gmail.com";

    public void setEmail(String email) {
        if(email.endsWith("@gmail.com"))
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    int phone;
    public void enter(){
        System.out.println("Workers are entering");
    }
    public void leave(){
        System.out.println("Workers are leaving");
    }
    public void lunch(){
        System.out.println("Workers are eating");
    }

}
