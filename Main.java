/**
 * Created by Wojcik94 on 2017-03-16.
 */

/**
 * Klasa testowa
 */
public class Main {
    /**
     * metoda testowa
     * @param args Nieuzywane
     */
    public static void main(String[] args){
        Walec pierwszy= new Walec(20,10,5);
        Kula drugi= new Kula(15, 40);
        Pret trzeci= new Pret(4, 13);

        System.out.println(pierwszy.toString() + " Masa: " + pierwszy.getMass()+" Wysokosc: " + pierwszy.getWysokosc()
                +" Promien: "+pierwszy.getPromien()+" Moment: "+ pierwszy.getMoment());
        System.out.println(drugi.toString() + " Masa: " + drugi.getMass()+" Promien: "+drugi.getPromien()+" Moment: "
                + drugi.getMoment());
        System.out.println(trzeci.toString() + " Masa: "+trzeci.getMass()+" Dlugosc: + " + trzeci.getLength()
                +" Moment: "+ trzeci.getMoment());

        Walec[] tablica=new Walec[5];

        for(int i=0; i<tablica.length; i++){
            tablica[i]=new Walec(i+4,i*5, (float)i/6+1);
        }

        for(int i=0; i<tablica.length; i++){
            System.out.println(tablica[i].toString());
        }
    }
}