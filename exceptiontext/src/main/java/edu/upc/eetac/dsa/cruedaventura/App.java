package edu.upc.eetac.dsa.cruedaventura;

public class App
{
    public static void main(String[] args)
    {
        if (args.length < 1) {
            System.err.println("Path is a must");
            System.exit(-1);
        }
        try {
            double average = AverageFileCalculator.calculate(args[0]);
            System.out.println(average);
        } catch (BigNumberException exception) {
            System.err.println(exception.getMessage());
        } catch (FileParsingException exception) {
            System.err.println("Error reading file: " + exception.getMessage());
        } catch (NumberFormatException exception) {
            System.err.println("Malformed number: " + exception.getMessage());
        }
    }
}
