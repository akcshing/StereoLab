import java.util.ArrayList;

public class CDPlayer extends Component implements IPlay{

    private ArrayList<String> cds;
    private int selectedCd;

    public CDPlayer(String make, String model){
        super(make, model);
        this.cds = new ArrayList<>();
        this.selectedCd = 0;
    }

    public ArrayList<String> getCds(){
        return this.cds;
    }

    public void addCd(String cdName){
        this.cds.add(cdName);
    }

    public void ejectCD(String cdName){
        this.cds.remove(cdName);
    }

    public void chooseCD(int slotNumber){
        this.selectedCd = slotNumber - 1;
    }

    public String play(){
        return "Playing CD " + this.cds.get(selectedCd) + ".";
    }


}
