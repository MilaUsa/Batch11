package OOP.encapsulation;

public class City {
    private String name;
   private  int population;
   private  String state;
    private int establishmentYear;



 public void setName(String name) {
     this.name = name;
 }
 public void setPopulation(int population){
     this.population=population;
 }
 public void setState(String state){
     this.state=state;
 }
 public void setEstablishmentYear(int establishmentYear){
     this.establishmentYear=establishmentYear;
 }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getState() {
        return state;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }
}