package Program.Controller;

import Program.Model.Toy;
import Program.Service.SafeToyAsFile;
import Program.Service.StartService;

import java.util.*;


public class StartController implements StartService {
    Scanner scanner = new Scanner(System.in);
    ToysWork toysWork = new ToysWork();
     List<Toy> toyList = new ArrayList<>();
    Queue<Toy> lotteryListResult = new PriorityQueue<Toy>();

//     Queue<Toy> toyQueue = new PriorityQueue<>();

    @Override
    /**
     *
     */
    public void start() {
        String text = """
                 Press 1 for add a toy\s
                 Press 2 for show  all toy\s
                 Press 3 for start Lottery\s
                 Press 4 safe result to file\s
                 Press 5 end session\s
                """;
        System.out.print(text);
        int  a = 0;
        while (a!=4) {
         a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Pres Y if you DON'T want add toys to list yourself ? ");
                scanner.nextLine();
                String b =scanner.nextLine();
                if (b.equalsIgnoreCase("y")){
                    System.out.println("How many toys add ? ");
                    int howManyToys = scanner.nextInt();
                    for (int i = 0; i < howManyToys; i++) {
                        lotteryListResult.add(toysWork.randomCreate());
                    }
                }else toyList.add(toysWork.create());
                start();
            }
            if (a == 2) {
                showAllToy();
                start();
            }
            if (a == 3) {
                toysWork.startLottery(lotteryListResult);
                start();
            }
            if (a == 4) {
                SafeAsFile safeAsFile = new SafeAsFile();
                safeAsFile.safeToy(lotteryListResult);
                start();
            }
            if (a == 5) {
                System.out.println("GoodBuy");
                break;
            }
        }
    }

    @Override
    public void showAllToy() {
            System.out.print(lotteryListResult);
        }
}
