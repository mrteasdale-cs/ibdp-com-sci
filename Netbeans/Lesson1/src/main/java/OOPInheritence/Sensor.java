package OOPInheritence;
public class Sensor {
    
    double temp;//temperature
    double hum;//humidity
    
    public Sensor(double temp, double hum){
        this.temp = temp;
        this.hum = hum;
    }
    
    /*getters and setters*/
    
    public double getTemperature(){
        return temp;
    }
    public double getHumidity(){
        return hum;
    }
    
    //overloaded methods
    public void getReading(){
        System.out.println(temp);
    }
    
    public void getReading(String type){
        if ("temperature".equalsIgnoreCase(type)){
            System.out.println(temp);
        } else if ("humidity".equalsIgnoreCase(type)) {
            System.out.println(hum);
        } else {System.out.println("not recognised");}
    }
    
    public String output(){
        return "Sensor Readings -- Temp: " + getTemperature() + " | Humidity: " + getHumidity();
    }
    
   
}
