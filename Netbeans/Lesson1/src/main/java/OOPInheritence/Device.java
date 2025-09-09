package OOPInheritence;
public class Device{
    Sensor s;
    
    public Device(Sensor s){
    this.s = s;//aggregation
    }
   
    public String output(){
        return "Sensor Readings -- Temp: " + s.getTemperature() + " | Humidity: " + s.getHumidity() + " " + checkReadings();
    }
    
    public String checkReadings(){
        if (s.getTemperature() > 50 || s.getHumidity() > 80){
            return "Values Exceed Safe Limit!";
        } else {
            return "Systems ok...";
        }
    }
    
}
