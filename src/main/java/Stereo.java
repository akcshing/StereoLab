import java.util.ArrayList;

public class Stereo {

    private String name;
    private ArrayList<Component> components;

    public Stereo(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void addComponent(Component newComponent){
        this.components.add(newComponent);
    }

    public void removeComponent(Component oldComponent{
        this.components.remove(oldComponent);
    }

    public void playComponentByModel(String model) {
        for (Component component : this.components) {
            if (component.getModel() == model) {
                component.play();
            }
        }
    }


}
