import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    /** Главный метод
     * @param args главные аргументы
     * @throws IOException Сигнализирует о том, что произошло какое-либо исключение ввода-вывода
     * */
    public static  void main(String[] args) throws IOException {
        FileReader path = new FileReader("foreign_names.csv");
        CSVReader reader = new CSVReader(path, ';');
        List<Person> list = new ArrayList<>();
        String[] next;
        while ((next = reader.readNext())!= null) {
            Random rnd = new Random();
            int id_ran = rnd.nextInt(25899);
            list.add(new Person(next[0], next[1], next[2], next[3], next[4], next[5], id_ran));
        }
        for (int i=list.size()-1; i>0 ; i--)
        {
            System.out.format("%-9s", list.get(i).getId()+";");
            System.out.format("%-19s",list.get(i).getName()+"; ");
            System.out.format("%-9s",list.get(i).getGender()+"; ");
            System.out.format("%-9s",list.get(i).getBirthDate()+"; ");
            System.out.format("%-9s",list.get(i).getDivisionTitle()+"; ");
            System.out.format("%-9s",list.get(i).getDivisionId()+"; ");
            System.out.format("%-9s",list.get(i).getSalary()+"; ");
            System.out.println();
        }
    }
}