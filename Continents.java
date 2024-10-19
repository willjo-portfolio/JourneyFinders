// Import Statement
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.IOException;
/**
 * Title: Google Travel
 * 

 * Program Summary: This is a traveling assistant program that people can chose
 * their destination layer by layer of continents, countries, and cities. It will have a button
 * in JFrame that lead people to the google map website that contains more information.
 * After they chose their city, people can decide whether they want to search in the same continent agaim.
 * 
 * 
 * Program Element List: Array, ArrayList, System.in, for loop, .contains(), extend class,
 * .close, FileNotFoundException, break, return, import,toUpperCase(), File = new File()
 * .IgnoreCase(), ? 1:0
 *
 * 
 * @author Will
 * @version 12/10/2023
 */
public class Continents {
  // Instance variables
  private static String[] continents = { "North America", "South America", "Europe", "Africa", "Asia", "Australia", "Antarctica" }; // create an Array of Strings.

  public static ArrayList<String> northAmerica = new ArrayList<String>();
  public static ArrayList<String> southAmerica = new ArrayList<String>();
  public static ArrayList<String> Europe = new ArrayList<String>(); // For arraylist for europe continenets
  public static ArrayList<String> Africa = new ArrayList<String>();
  public static ArrayList<String> Asia = new ArrayList<String>();
  public static ArrayList<String> Australia = new ArrayList<String>();
  public static ArrayList<String> Antarctica = new ArrayList<String>();

  public static ArrayList<String> canada = new ArrayList<String>();
  public static ArrayList<String> usa = new ArrayList<String>();
  public static ArrayList<String> mexico = new ArrayList<String>();
  public static ArrayList<String> brazil = new ArrayList<String>();
  public static ArrayList<String> argentina = new ArrayList<String>(); // For arraylist for argentina country
  public static ArrayList<String> chile = new ArrayList<String>();
  public static ArrayList<String> russia = new ArrayList<String>();
  public static ArrayList<String> france = new ArrayList<String>();
  public static ArrayList<String> britain = new ArrayList<String>();
  public static ArrayList<String> nigeria = new ArrayList<String>();
  public static ArrayList<String> kenya = new ArrayList<String>();
  public static ArrayList<String> egypt = new ArrayList<String>();
  public static ArrayList<String> china = new ArrayList<String>();
  public static ArrayList<String> korea = new ArrayList<String>();
  public static ArrayList<String> japan = new ArrayList<String>();
  public static ArrayList<String> australia = new ArrayList<String>();
  public static ArrayList<String> newzealand = new ArrayList<String>();
  public static ArrayList<String> antarcitca = new ArrayList<String>();

  public int continent;
  public String country, city;


  /*
   * Summary: This Constructor adds country arraylist into continents arraylists, then add cities into different countries arraylists
   * Parameter(s): none.
   * Return(s): none.
   */
   public Continents() {
    northAmerica.add("canada"); // Add canada into the northAmerica ArrayList.
    northAmerica.add("usa");
    northAmerica.add("mexico");

    southAmerica.add("brazil"); // Add brazil into the southAmerica ArrayList.
    southAmerica.add("argentia");
    southAmerica.add("chile");

    Europe.add("russia"); // Add russia into the Europ ArrayList.
    Europe.add("britain");
    Europe.add("france");

    Africa.add("nigeria"); // Add nigeria into the Africa ArrayList.
    Africa.add("tanzania");
    Africa.add("egypt");

    Asia.add("china"); // Add china into the Asia ArrayList.
    Asia.add("korea");
    Asia.add("japan");

    Australia.add("australia"); // Add australia into the Australia ArrayList.
    Australia.add("newzealand");

    Antarctica.add("antarctica"); // Add antartica into the Antartica ArrayList.

    canada.add("Ottawa"); // Add Ottawa in the the canada ArrayList.
    canada.add("Vancouver");
    canada.add("Quebec");

    usa.add("Washington DC"); // Add Washington DC in the the canada ArrayList.
    usa.add("New York");

    mexico.add("Mexico City"); // Add Mexico in the the Mexica ArrayList.

    brazil.add("Brazilia"); // Add Brazilia in the the brazil ArrayList.
    brazil.add("Sau Paulo");

    argentina.add("Buenos Aires"); // Add Buenos Aires in the the argentina ArrayList.

    chile.add("Santiago");

    russia.add("Moscow");

    france.add("Paris");

    britain.add("London");

    nigeria.add("Lagos");

    kenya.add("Nairobi");

    egypt.add("Cairo"); // Add Cairo in the the egypt ArrayList.
    egypt.add("Giza");

    china.add("Beijing");
    china.add("Shanghai");

    korea.add("Seoul"); // Add Seoul in the the korea ArrayList.
    korea.add("Busan");

    japan.add("Tokyo");
    japan.add("Osaka");

    australia.add("Sydney");
    australia.add("Melbourne");

    newzealand.add("Oakland");

    antarcitca.add("McMurdo Station");
    antarcitca.add("Sejong Station");
  } // End of function initContinents



  

  /*
   * Summary: This function prints out the cities for the selected country.
   * Parameter(s): country of type String
   * Return(s): none.
   */
  public static void searchCityMenu(String country) {
    System.out.print("\n\n");
    
    
    
    switch (country) {
      case "canada": // If the country matches canada.
        for (String city : Continents.canada) { // for each city in canada, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "usa":
        for (String city : Continents.usa) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "mexico":
        for (String city : Continents.mexico) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "brazil":
        for (String city : Continents.brazil) { // for each city in brazil, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "argentina":
        for (String city : Continents.argentina) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "chile":
        for (String city : Continents.chile) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "russia":
        for (String city : Continents.russia) { // for each city in russia, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "france":
        for (String city : Continents.france) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "britain":
        for (String city : Continents.britain) { // for each city in britain, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "nigeria":
        for (String city : Continents.nigeria) { // for each city in nigeria, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "keyna":
        for (String city : Continents.kenya) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "egypt":
        for (String city : Continents.egypt) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "china":
        for (String city : Continents.china) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "korea":
        for (String city : Continents.korea) { // for each city in korea, prints "City: " + city name
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "japan":
        for (String city : Continents.japan) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "australia":
        for (String city : Continents.australia) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "newzealand":
        for (String city : Continents.newzealand) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      case "antarctica":
        for (String city : Continents.antarcitca) {
          System.out.println("City : " + city);
        } // End of for loop
        break;
        
      default: //if the none of above case matches, this switch statement breaks.
        break;
    } // End of switch statement
  } // End of searchCityMenu function.





  /*
  * Summary: This function prints out the title of program.
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void titleTravel() {
    System.out.println("\n\n" + 
        "░░░░░██╗░█████╗░██╗░░░██╗██████╗░███╗░░██╗███████╗██╗░░░██╗███████╗██╗███╗░░██╗██████╗░███████╗██████╗░░██████╗\n" + //prints out the title of the program
        "░░░░░██║██╔══██╗██║░░░██║██╔══██╗████╗░██║██╔════╝╚██╗░██╔╝██╔════╝██║████╗░██║██╔══██╗██╔════╝██╔══██╗██╔════╝\n" +
        "░░░░░██║██║░░██║██║░░░██║██████╔╝██╔██╗██║█████╗░░░╚████╔╝░█████╗░░██║██╔██╗██║██║░░██║█████╗░░██████╔╝╚█████╗░\n" +
        "██╗░░██║██║░░██║██║░░░██║██╔══██╗██║╚████║██╔══╝░░░░╚██╔╝░░██╔══╝░░██║██║╚████║██║░░██║██╔══╝░░██╔══██╗░╚═══██╗\n" +
        "╚█████╔╝╚█████╔╝╚██████╔╝██║░░██║██║░╚███║███████╗░░░██║░░░██║░░░░░██║██║░╚███║██████╔╝███████╗██║░░██║██████╔\n" +
        "░╚════╝░░╚════╝░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚══════╝░░░╚═╝░░░╚═╝░░░░░╚═╝╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░\n\n");
  } // End of titleTravel function



  
  
 /*
  * Summary: This function prints out the welcome message of the program
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void welcomeMsg() {
    System.out.println("Welcome to JourneyFinders!"); //prints out welcome message of the program
    System.out.println("We are thrilled to have you on board for this exciting journey.");
    System.out.println("Get ready for an adventure filled with new connections, cultural experiences, and the opportunity to make a positive impact.\nBon voyage");
  } // End of welcomeMsg function





  /*
  * Summary: This function prints out the introduction of the program
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void introTravel() {
    System.out.println("\t\n [Introduction] -------------------------\t"); // prints out the introduction of the program.
    System.out.println("\tDiscover concise summaries and introductions to each country and city we explore, offering a glimpse into their unique cultures and attractions.");
    System.out.println("\tFor a deeper dive into the wonders we showcase, follow the provided link to our travel website and set off on an immersive adventure.");
    System.out.println("\tBon voyage!");
  } // End of introTravel function





  /*
  * Summary: This function prints out the explaination of the program.
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void explainationTravel() {
    System.out.println("\t\n [Direction] -------------------------\t"); // prints out the explaination of the program.
    System.out.println("Chose the continent you want to go to, and then the country and city.");
    System.out.println("There will be short introduction for each country and city.");
    System.out.println("If you have a city that you would like to have a deeper dive, clik on the \"link\" button in JFrame\nand it would lead you to our detailed informational website");
    System.out.println("Have fun and bon voyage!\n");
  } // End of explainationTravel function





  /*
  * Summary: This function prints out the thank you message of the program.
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void thanksMsg() {
    System.out.println("\nThank you for using JourneyFinders"); // prints out the thank you message
    System.out.println("We hope you found inspiration in the diverse cultures we explored.");
    System.out.println("We look forward to welcoming you back for another journey soon!");
  } // End of thanksMsg function





  /*
  * Summary: This method verifies the entered country in the searchMenu() method. It checks if the entered country exist and is it from the correct continents.
    If the country and continent does not match, an erro signal will be returend and the user will be asked to re-enter in other methods.
  * Parameter(s): selectedContinenet of type int, search Country of type String, keyboardinput of Scanner.
  * Return(s): int.
  */
  public int searchCountryMenu(int selectedContinent, String searchCountry, Scanner keyboardinput) {
    // Variable declaration  
    String filename;
    String country = searchCountry.replace(" ", "").toLowerCase(); // accept the upper case and space
    int error = 0;

    while (true) {
      clearScreen();
      switch (selectedContinent) {
        case 1:
          if (!northAmerica.contains(country)) { // if user's selected continent is northAmerica but the inputed country does not fin in northAmerica, then set erro to -1 
            System.out.print("Country Not Found.");
            error = -1;
            return -1; // return -1.
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country); // send into another method to check if a file for this country exist. 
          if(error >= 0) {
            searchCityMenu(country); // call the serchCityMenu function and pass in country.
          } // End of if statement
          break;
          
        case 2:
          if (!southAmerica.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1;
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country);
          if(error >= 0) {
            searchCityMenu(country); // call the serchCityMenu function and pass in country.
          } // End of if statement
          break;
          
        case 3:
          if (!Europe.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1;
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country);
          if(error >= 0) {
              searchCityMenu(country); // call the serchCityMenu function and pass in country.
            } // End of if statement
          break;
          
        case 4:
          if (!Africa.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1; // set error to -1
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country); // send into another method to check if a file for this country exist. 
          if(error >= 0) {
              searchCityMenu(country); // call the serchCityMenu function and pass in country.
            } // End of if statement
          break;
          
        case 5:
          if (!Asia.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1;
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country);
          if(error >= 0) {
              searchCityMenu(country); // call the serchCityMenu function and pass in country.
            } // End of if statement
          break;
          
        case 6:
          if (!Australia.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1;
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country);
          if(error >= 0) {
              searchCityMenu(country); // call the serchCityMenu function and pass in country.
          } // End of if statement
          break;
          
        case 7:
          if (!Antarctica.contains(country)) {
            System.out.print("Country Not Found.");
            error = -1;
            return -1;
          } // End of if statement
          error = ReadContinents.readSelectedCountry("./CountryInfomations/" + country); // send into another method to check if a file for this country exist. 
          if(error >= 0) {
              searchCityMenu(country); // call the serchCityMenu function and pass in country.
          } // End of if statement
          break;
          
        default:
          System.out.println("Invalid Input"); // If none of the above case matches, print out an error message.
          error = -1; // set error to -1
          break;
      } // End of switch statement
      
      System.out.print("\n\n");

      if(error >= 0){
        JFrameContinents.changeCountry(searchCountry); // Change the JFrame picture according to user entered country.

        System.out.print("Which city do you want to travel? : ");
        filename = keyboardinput.nextLine(); // 

        clearScreen();
        error = ReadContinents.readSelectedCountry("./CountryInfomations/CitiesInformations/" + filename); // send into another method to check if a file for this city exist. 
        if(error >= 0)
        {
          JFrameContinents.changeCity(filename); // Change the JFrame according the city.
        } else {
          return 0;
        } // End of if else statement 
      } else {
        error = 0;
        return 0;
      } // End of if else statement

      if(error < 0){
        error = 0;
        return 0;
      } // End of if statement
      if (selectedContinent != 0) break;
    } // End of while loop
    return 0;
  } // End of searchCountryMenu method





  /*
  * Summary: This method prints out the countries in the user selected continent, and it would the user to select a country and enter name for that country. 
    Then this method would pass the user entered string to searchCountryMenu() method to verify if the country exist, or is it in the correct continent. If not, the method will ask user to enter again.
  * Parameter(s): selectedContinenet of type int, keyboardinput of Scanner. Furthermore, this method also allows user to chose if they want to search in the same continent again or not.
  * Return(s): int.
  */
  public int searchMenu(int selectedContinent, Scanner keyboardinput) {
    // Variable declaration    
    String searchCountry; // for searching country
    String choice;
    int sameContinentAgain = 1;
    int error = 0;

    System.out.flush(); // clears the keyboardinput
    System.out.print("\n\n");

    while (sameContinentAgain > 0) {
      clearScreen();
      switch (selectedContinent) {
        case 1:
        for (String country : northAmerica) { // for each country in northAmerica, prints "Country: " + upper cased country name
                System.out.println("Country: " + country.toUpperCase());
                System.out.println();
        } // End of for loop
        break;
        
        case 2:
        for (String country : southAmerica) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        case 3:
        for (String country : Europe) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        case 4:
        for (String country : Africa) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        case 5:
        for (String country : Asia) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        case 6:
        for (String country : Australia) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        case 7:
        for (String country : Antarctica) {
            System.out.println("Country: " + country.toUpperCase()); // prints "Country: " + upper cased country name
            System.out.println();
        } // End of for loop
        break;
        
        default:
        System.out.println("Invalid Input");
        error = -1;
        break;
      } // End of switch statement

      System.out.println();

      if(error >= 0){
        System.out.print("\n\nWhich country do you want to choose? : ");
        searchCountry = keyboardinput.nextLine(); // ask user to input the seachCountry
        sameContinentAgain = searchCountryMenu(selectedContinent, searchCountry, keyboardinput);
        if(sameContinentAgain < 0) {
          return 1;
        } // End of if statement
      } else {
        return 0;
      } // End of if else statement
    } // End of switch statement

    System.out.print("\n\nDo you want to search more in same continent? (Y/N) : ");
    choice = keyboardinput.nextLine();
    return choice.equalsIgnoreCase("Y") ? 1 : 0;
  } // End of searchMenu method





  /*
  * Summary: This method is the main menu of the program, it would print out available actions and allow user to chose, includes read instructions again, available continents, and exit the program.
    user's input will be send to another method to check if it's valid; if the user input is not valid, users will be asked to input again.
  * Parameter(s): none.
  * Return(s): none.
  */
  public void mainMenu() {
    // Variable declaration    
    Scanner keyboardinput = new Scanner(System.in); // calling keyboardinput
    String select;
    int selectedContinent = 0;
    int again = 1;

    while (true) {
      System.out.println("\n\n\nWhich continent do you want to choose?\n");
      System.out.println("[" + 0 + "] " + "Read Direction Again");
      for (int i = 0; i < continents.length; i++) { // goes through the continent array and prints below line for each index in the Array.
        System.out.println("[" + (i + 1) + "] " + continents[i]);
      } // End of for loop
      System.out.print("[" + (continents.length + 1) + "] " + "EXIT\n\nSelect option: ");
      select = keyboardinput.nextLine(); // ask user to enter for their choise
      selectedContinent = userSelectedContinent(select); // send into another method to verify
      if(selectedContinent != -1) {
        this.continent = selectedContinent;
        JFrameContinents.changeContinent(this.continent);
      } // End of if statement

      if (selectedContinent == 0) {
        clearScreen();
        explainationTravel(); // calls explainationTravel function.
        continue;
      } else if (selectedContinent == 8) {
        break;
      } else {
        while (again > 0) {
          again = searchMenu(selectedContinent, keyboardinput);
        } // End of while loop
      } // End of if/ else if/ else statement
      JFrameContinents.setInit();
      select="";
      again = 1;
      selectedContinent = 0;
      clearScreen();
    }

    keyboardinput.close(); // close scanner.

  } // End of mainMenu method





  /*
  * Summary: This method checks the user's input from mainMenu() method, then return an int that is more convenient for future actions.
  * Parameter(s): select of type String.
  * Return(s): int.
  */
  public int userSelectedContinent(String select) {
    switch (select.replaceAll(" ", "").toLowerCase()) {
      case "0":
      case "read":
      case "direction":
      case "again":
      case "readdirection":
      case "readdirectionagain":
        return 0;

      case "1":
      case "north":
      case "northamerica":
        return 1;

      case "2":
      case "southamerica":
        return 2;

      case "3":
      case "europe":
        return 3;

      case "4":
      case "africa":
        return 4;

      case "5":
      case "asia":
        return 5;

      case "6":
      case "australia":
        return 6;

      case "7":
      case "antarctica":
        return 7;

      case "8":
      case "exit":
      case "q":
      case "esc":
        return 8;

      default: // if none of above cases matches, print a error messaage and return -1.
        System.out.println("Wrong Input. Try Again");
        return -1;
    }
  } // End of userSelectedContinent method.

  
  


  /*
  * Summary: This function clears the terminal.
  * Parameter(s): none.
  * Return(s): none.
  */
  public static void clearScreen() {  
    System.out.print('\u000C'); // this line clears the screen
  } // End of clearScreen function.

  
  
  

  /*
  * Summary: This is a main that calls all the functions and basically a program manager
  * Parameter(s): String[] args
  * Return(s): none.
  */
  public static void main(String[] args) {
    Continents travel = new Continents(); // creat an object of Continents

    JFrameContinents jframeContinents = new JFrameContinents();

    System.out.println("\f"); // clears the terminal
    System.out.flush(); // clears the keyboardinput

    titleTravel(); // calls titleTravel function
    welcomeMsg();
    introTravel();
    explainationTravel();

    travel.mainMenu(); // calls the mainMenu of travel
    thanksMsg();
  } // Emd of main


} // End of class Continents





/*
 * 
 * Notes:
  more cities
  1: continenet menu
  2: City menu
  3: Description menu (1: decription, 2: famous place, 3: flight, 4: hotel 5:back to city 6: back to main menu)
  4:each city explanation

 *
 *
 * Test Code:
 *ArrayList<ArrayList<String>> countries = new ArrayList<ArrayList<String>>;
  ArrayList<String> country1 = new ArrayList<String>;

  country1.add(city1);
  country1.add(city2);
  countries.add(country1);
 * 
  }
 */