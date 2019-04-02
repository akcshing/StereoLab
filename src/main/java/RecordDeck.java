public class RecordDeck extends Component implements IPlay{


    private int playSpeed;


    public RecordDeck(String make, String model) {
        super(make, model);
        this.playSpeed = 45;
    }

    public String play() {
        return "Playing record at " + this.playSpeed + " RPM.";
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
