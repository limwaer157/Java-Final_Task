package Program.Controller;

import Program.Service.StartService;

import java.util.Scanner;

// TODO: 07.08.2023 1) Напишите класс-конструктор у которого принимает минимум 3 строки,
//  содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
//2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
//3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
//4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в файл
public class StartController implements StartService {
    Scanner scanner = new Scanner(System.in);
    ToysWork toysWork = new ToysWork();

    @Override
    public void start() {
        String text = " Press 1 for add a toy "+ "\n"+
                      " Press 2 for show  all toy "+ "\n"+
                      " Press 3 for start Lottery "+ "\n"+
                      " Press 4 end session "+ "\n";
        System.out.print(text);
        int a = scanner.nextInt();
        boolean flag = true;
        while (flag){
        if (a == 1){
           toysWork.create();
        }
        if (a == 2 ){
            toysWork.showAllToy();
        }
        if (a == 3){
            toysWork.startLottery();
        }
        if (a == 4 ){
            flag = false;
            System.out.println("GoodBuy");
        }
    }
    }
}
