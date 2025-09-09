package OOPInheritence;

public class Main {
        public static void main(String args[]) {
    
        Sensor sensor = new Sensor(100.0, 11.0);
        Device device = new Device(sensor);
        
        System.out.println(device.output());
        System.out.println(device.checkReadings());
        
        sensor.getReading();
        sensor.getReading("humidity");
    
    }
}
