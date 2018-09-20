package ro.sciit.iohomework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalesReader {

    /**
     * @param file represents the  file from which the information is extracted
     * @return a List <String> that contains in each position an entire line from the file
     */
    public List<String> getSalesAsStrings(File file) {
        //stores the data in a list
        List<String> salesAsString = new ArrayList<String>();

        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            //adds each line in the file to the list as long as the line is not empty
            while (!(line == null)) {
                salesAsString.add(line);
                line = bufferedReader.readLine();
            }

            return salesAsString;

        } catch (FileNotFoundException f) {
            //prints an error message if the file doesn't exist
            System.out.println("File not found");
            return null;

        } catch (IOException e) {

            System.out.println("File not found");
            return null;
        }
    }

    /**
     * @param salesAsStrings A List<String>that contains all the sales each of them in separate positions
     * @return List<Sale> the list of sales
     */
    public List<Sale> getSalesAsObjects(List<String> salesAsStrings) {

        List<Sale> sales = new ArrayList<Sale>();
        String[] tokens;

        for (int i = 0; i < salesAsStrings.size(); i++) {
            //splits the strings on each position in the list
            tokens = salesAsStrings.get(i).split(",");
            Sale sale = new Sale(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
            sales.add(sale);
        }
        return sales;
    }
}
