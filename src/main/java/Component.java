public abstract class Component implements IPlay{

    private String make;
    private String model;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public void setMake(String newMake){
        this.make = newMake;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public abstract String play();
}
