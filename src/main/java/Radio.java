public class Radio extends Component implements IPlay{

    private String station;

    public Radio(String make, String model){
        super(make, model);
        this.station = null;
    }

    public String getStation() {
        return station;
    }

    public void tune(String newStation){
        this.station = newStation;
    }

    public String play(){
        return "Playing " + this.station;
    }
}
