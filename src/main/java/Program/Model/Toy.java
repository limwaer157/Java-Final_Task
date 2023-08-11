package Program.Model;
// TODO: 07.08.2023 1) Напишите класс-конструктор у которого принимает минимум 3 строки,
//  содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
//2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
//3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
//4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в файл
public class Toy {

    private int idToy;
    private  String nameToy;
    private double frequency;

    public Toy(int idToy, String nameToy, double frequency) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.frequency = frequency;
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

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
