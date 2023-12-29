public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, int cost, int temperature, int volume){
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }    

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                "; cost = " + super.getCost() +
                "; temperature = " + temperature +
                "; volume = " + volume +
                '}';
    }
    
}
