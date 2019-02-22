package part1.AbstractSample;

public abstract class Employee{
    private String name;

    // name Getter
    public String getName(){
        return this.name;
    }

    // name Setter
    public void setName(String name){
        this.name = name;
    }

    // response method
    public abstract void echo();
}
