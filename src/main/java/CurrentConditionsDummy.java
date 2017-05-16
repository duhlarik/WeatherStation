/**
 * Created by duhlarik on 5/16/17.
 */
public class CurrentConditionsDummy {

    public CurrentConditionsDummy() {
        CurrentConditionsDisplay ccdisplay = new CurrentConditionsDisplay(new WeatherData());
//        We can pass a new WeatherData() object into the CurrentConditionsDisplay because
//        CurrentConditionsDisplay takes a Subject object and WeatherData implements Subject.
    }
}
