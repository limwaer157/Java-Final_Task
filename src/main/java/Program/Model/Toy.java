package Program.Model;

import java.util.Comparator;

public class Toy  implements Comparable<Toy> {

    private int idToy;
    private  String nameToy;
    private int frequency;

    public Toy(int idToy, String nameToy, int frequency) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.frequency = frequency;
    }

    public Toy() {
    }
    public int getIdToy() {
        return idToy;
    }

    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return
                idToy+ "  " + nameToy  + ", frequency - " + frequency  + "\n";
    }


    @Override
    public int compareTo(Toy o) {
        return Double.compare(this.getFrequency(), o.getFrequency());
    }
}
