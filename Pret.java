/**
 * Created by Wojcik94 on 2017-03-23.
 */
public class Pret extends Punkt {
    private float length;

    public Pret(int mass, int length) {
        super(mass);
        this.length = length;
    }

    public Pret() {
        mass=10;
        length=15;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getMoment(){
        return (mass*length*length/12 );
    }

    public String toString(){
        return "Pręt";
    }
}
