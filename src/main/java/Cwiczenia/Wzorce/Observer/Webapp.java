package Cwiczenia.Wzorce.Observer;

public class Webapp implements Observer{
    @Override
    public void update(Weather weather) {
        System.out.println("Weather change for " + weather);
    }
}
