package pl.infoshare.Six.Samochody;

import pl.infoshare.Six.Samochody.Car;

public class Fiat extends Car {

    public Fiat() {

        System.out.println("Tworze klase Fiat");

    }

    public void siedzenieFiata(){
        System.out.println("Siedzisz w Fiacie");
    }

    public int cenaFiata = 5000;
}
