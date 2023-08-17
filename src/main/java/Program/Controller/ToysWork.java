package Program.Controller;

import Program.Model.Toy;
import Program.Service.WorkWithToy;

import java.util.*;

public class ToysWork implements WorkWithToy {
    static int countIdForToys = 1;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void askAboutToy() {
    }

    @Override
    /**
     * Метод запрашивает у пользоателя данные для создания игрушки
     */
    public Toy create() {
        Toy toy = new Toy();
        System.out.println("Enter - id ");
        toy.setIdToy(scanner.nextInt());
        System.out.println("Enter - name  ");
        scanner.nextLine();
        toy.setNameToy(scanner.nextLine());
        System.out.println("Enter - frequency ");
        toy.setFrequency(scanner.nextInt());
        return toy;
    }

    /**
     * методе для автоматического заполнения игрушками
     * @return возвращает созданную игрушку
     */
    @Override
    public Toy randomCreate() {
        Toy toy = new Toy();
        Random random = new Random();
        toy.setIdToy(countIdForToys);
        toy.setNameToy(namesForToys[random.nextInt(0,12)]);
        if (toy.getNameToy().equals("Shark from IKEA")){
            toy.setFrequency(1);
        }
        else toy.setFrequency(random.nextInt(1,4));
        countIdForToys++;
        return toy;
    }

    @Override
    public void startLottery(Queue<Toy> lotteryListResult) {
        System.out.println(lotteryListResult);
    }
    String[] namesForToys = {
            "Bear","Car","Tiger","Horse",
            "Shark","Wolf","Mouse","Dog","Cat",
            "Shark from IKEA","Lion","Elephant",
            "Bird"};
}
