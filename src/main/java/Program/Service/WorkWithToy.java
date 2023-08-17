package Program.Service;

import Program.Model.Toy;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public interface WorkWithToy {

    void askAboutToy();
     Toy create ();
     Toy randomCreate ();

    void startLottery(Queue<Toy> lotteryListResult);
}
