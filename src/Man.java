public class Man {

    int numberOfMan;

    public Man(int numberOfMan) {
        this.numberOfMan = numberOfMan;
    }

    @Override
    public String toString() {
        return "I am main number - "+numberOfMan;
    }

    public int getNumberOfMan() {
        return numberOfMan;
    }
}
