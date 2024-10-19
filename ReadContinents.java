import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;

public class ReadContinents extends Continents {
  public static int readSelectedCountry(String filename) {
    try {
      File myObj = new File(filename + ".txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close(); // close canner
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      return -1;
    } // End of try catch statement
    return 0;
  } // End of readSelectedCountry function
} // End of REadContinents class