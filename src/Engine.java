/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public class Engine {
    private long number;
    private int power;
    private double volume;

    public Engine(long number, int power, double volume) {
        this.number = number;
        this.power = power;
        this.volume = volume;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "number " + number + ", power " + power + ", volume " + volume;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Engine))
            return false;
        Engine engine = (Engine) obj;
        return  this.number == engine.getNumber()
                && this.power == engine.getPower()
                && this.volume == engine.getVolume();
    }
    
}
