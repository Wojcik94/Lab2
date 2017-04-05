/**
 * Created by Wojcik94 on 2017-03-23.
 */
public class Kula extends Punkt {
    private float promien;

    public Kula(float mass, float promien) {
        super(mass);
        this.promien = promien;
    }

    public Kula() {
        mass=10;
        promien=2;
    }

    public float getPromien() {
        return promien;
    }

    public void setPromien(float promien) {
        this.promien = promien;
    }

    public float getMoment(){
        return (0.4f*mass*promien*promien);
    }

    public String toString(){
        return "Kula";
    }
}
