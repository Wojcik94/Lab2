/**
     * Created by Wojcik94 on 2017-03-16.
     */

    /**
     * Klasa reprezentująca punkt materialny
     */
    public class Punkt {
        protected float mass;

        /**
         * Konstruktor z parametrem pozwalajacy na nadanie dowolnej wartosci masy
         * @param mass Wartosc masy
         */
        public Punkt(float mass) {
            this.mass = mass;
        }

        /**
         * Konstruktor domyslny inicjujacy stala mase domyslna (rowna 10)
         */
        public Punkt(){
            mass=10;
        }

        /**
         * Akcesor umozliwiajacy pobranie masy
         * @return Masa punktu materialnego
         */
        public float getMass() {
            return mass;
        }

        /**
         * Akcesor umozliwiajacy zmiane masy punktu
         * @param mass Nowa masa punktu materialnego
         */
        public void setMass(float mass) {
            this.mass = mass;
        }

        /**
         * Metoda zwracajaca glowny moment bezwladnosci
         * @return Glowny moment bezwladnosci
         */
        public float getMoment(){
            return 0;
        }

        /**
         * Metoda obliczajaca moment bewladnosci z twierdzenia Steinera
         * @param d Odleglosc miedzy glowna osia bezwladnosci a wybrana nowa osia obrotu
         * @return Obliczony moment bezwladnosci dla wybranej osi obrotu
         */
        public float getSteinerMoment(float d){
            return (getMoment()+ mass*d*d) ;
        }

        /**
         * Metoda zwracajaca staly opis obiektu
         * @return Opis obiektu
         */
        public String toString(){
            return "Punkt materialny";
        }
}