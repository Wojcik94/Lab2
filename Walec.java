/**
 * Created by Wojcik94 on 2017-03-23.
 */
public class Walec extends Punkt {
    private float wysokosc, promien;

    public Walec(float mass, float wysokosc, float promien) {
        super(mass);
        this.wysokosc = wysokosc;
        this.promien = promien;
    }

    public Walec() {
        wysokosc=10;
        promien=5;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public float getPromien() {
        return promien;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public float getMoment(){
        return (0.5f*mass*promien*promien);
    }

    public String toString(){
        return "Walec";
    }
}
