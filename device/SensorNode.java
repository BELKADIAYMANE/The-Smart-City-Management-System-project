package device;

import Smartcitymodel.SmartApartment;

public class SensorNode {
    public int ID;
    public String temp;
    public String hum;
    public String motion;
    public String micro;
    public double tempValue;
    public double humValue;
    

    public SensorNode(int ID, String temp, String hum, String motion, String micro, double tempValue, double humValue) {
        this.ID = ID;
        this.temp = temp;
        this.hum = hum;
        this.motion = motion;
        this.micro = micro;
        this.tempValue = tempValue;
        this.humValue = humValue;
       
    }

    public String warning() {
        if (tempValue > 35.0) {
            return "Temperature exceeds 35°C";
        } else if (humValue > 80.0) {
            return "Humidity exceeds 80%";
        } else {
            return "No warning";
        }
    }

    @Override

public String toString() {
    return "Sensor ID: " + ID + "\nTemperature: " + temp + "\nHumidity: " + hum + "\nMotion: " + motion
            + "\nMicro: " + micro + "\nTemperature Value: " + tempValue + "\nHumidity Value: " + humValue ;
}
}
