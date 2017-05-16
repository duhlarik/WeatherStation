
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Avg Temperature: " + + (tempSum / numReadings) + ", Max temperature: " + maxTemp + ", Min temperature: "
                +  minTemp + "\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
}
