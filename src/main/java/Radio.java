public class Radio extends Component{

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
}
