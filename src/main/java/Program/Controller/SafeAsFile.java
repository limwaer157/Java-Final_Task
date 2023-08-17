package Program.Controller;

import Program.Model.Toy;
import Program.Service.SafeToyAsFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class SafeAsFile implements SafeToyAsFile {
    @Override
    public void safeToy(Queue<Toy> lotteryListResult)  {
        try (FileWriter fileWriter = new FileWriter("ShowToys.txt")){
            for (Toy toy : lotteryListResult) {
                fileWriter.append(toy.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
