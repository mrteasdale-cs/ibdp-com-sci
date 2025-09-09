package OOPInheritence;
public class AdvDevice extends Device{
    String displayName;
    String status;
    
    public AdvDevice(Sensor s, String displayName, String status){
        super(s);
        this.displayName = displayName;
        this.status = status;       
    }
    
    public String output(){
        String head = "SENSOR INFO:";
        String deviceDetails = "Name: " + displayName + "Status: " + status;
        String sensorDetails = super.output();//the parent class, Device
        return head + "\n" + deviceDetails + "\n" + sensorDetails;
    }
    
    public String checkReadings(){
        if (s.getTemperature() > 50 || s.getHumidity() > 80){
            return "Values Exceed Safe Limit!";
        } else {
            return "Systems ok...";
        }
    }
    
    public static void main(String args[]) {
    
        Sensor sensor = new Sensor(67.0, 11.0);
        AdvDevice advdevice = new AdvDevice(sensor,"Airport","online");
        
        System.out.println(advdevice.output());
        System.out.println(advdevice.checkReadings());
        
        sensor.getReading();
        sensor.getReading("humidity");
    
    }
    
}
