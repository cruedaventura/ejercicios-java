package edu.upc.eetac.dsa.cruedaventura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AverageFileCalculator
{
    public static double calculate(String path) throws FileParsingException, BigNumberException
    {
        try {

            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            double total = 0;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                double currentValue = Double.parseDouble(line);
                if (currentValue > 1000) {
                    throw new BigNumberException("The number " + line + " is superior than 1000. Found at line " + (count + 1));
                }
                total += currentValue;
                count++;
            }
            bufferedReader.close();
            fileReader.close();
            return total / count;
        } catch (IOException exception) {
            throw new FileParsingException(exception.getMessage());
        }
    }

}
