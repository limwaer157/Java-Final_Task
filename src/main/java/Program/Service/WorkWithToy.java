package Program.Service;

import Program.Model.Toy;

// TODO: 07.08.2023 1) Напишите класс-конструктор у которого принимает минимум 3 строки,
//  содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
//2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
//3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
//4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в файл
public interface WorkWithToy {

    String askAboutToy();
     Toy create ();

    void showAllToy();

    void startLottery();
}
