//Import statement

import javax.swing.*; // JFrame
// import javax.swing.event.DocumentListener;
// import javax.swing.text.Document;
// import javax.swing.event.DocumentEvent;

import java.awt.*;
import java.awt.event.ActionEvent; // JFrame Button Action
import java.awt.event.ActionListener; // JFrame Button Action
// import java.net.URI;
// import java.net.URISyntaxException;
// import java.io.IOException;

public class JFrameContinents {

  // Member
  private static String sectionTitle = "Search via console :)";
  private static String selectedContinent;
  private static String selectedCityLink;

  static JFrame frame = new JFrame("Assignment 5 Traveler");
  static JPanel mainPanel = new JPanel();
  static JPanel mainBodyPhoto = new JPanel();
  static JPanel mainLink = new JPanel();
  static JLabel searchLabel = new JLabel("Search : " + sectionTitle);
  static JLabel photoName = new JLabel("");
  static JButton link = new JButton();

  // Constructor

  public JFrameContinents() {
    // JFrameContinents jframeContinents = new JFrameContinents();
    
    frame.setSize(1500, 1200);
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainPanel.add(searchLabel);
    
    Icon photo = new ImageIcon(Continents.class.getResource("./images/world.jpeg"));
    photoName = new JLabel(photo);
    mainBodyPhoto.setSize(800, 800);
    mainBodyPhoto.add(photoName);

    
    frame.add(mainPanel, BorderLayout.NORTH);
    frame.add(mainBodyPhoto, BorderLayout.CENTER);
    frame.add(mainLink, BorderLayout.SOUTH);
    frame.setVisible(true);
  }

  public static void changeContinent(int continent) {
    switch (continent) {
      case 1: 
        sectionTitle = "northAmerica";
        selectedContinent = "northAmerica";
        break;
      case 2: 
        sectionTitle = "southAmerica";
        selectedContinent = "southAmerica";
        break;
      case 3: 
        sectionTitle = "Europe";
        selectedContinent = "Europe";
        break;
      case 4: 
        sectionTitle = "Africa";
        selectedContinent = "Africa";
        break;
      case 5: 
        sectionTitle = "Asia";
        selectedContinent = "Asia";
        break;
      case 6: 
        sectionTitle = "Australia";
        selectedContinent = "Australia";
        break;
      case 7: 
        sectionTitle = "Antarctica";
        selectedContinent = "Antarctica";
        break;
      default:
        sectionTitle = "Search Error";
        selectedContinent = "Search Error";
        return;
    }

    searchLabel.setText("Search : " + sectionTitle);
    mainBodyPhoto.removeAll();
    Icon photo = new ImageIcon(Continents.class.getResource("./images/"+selectedContinent.toLowerCase()+".png"));
    photoName = new JLabel(photo);
    mainBodyPhoto.add(photoName);
    SwingUtilities.updateComponentTreeUI(frame);
  }

  public static void changeCountry(String country) {
    sectionTitle = country;

    searchLabel.setText("Search : " + sectionTitle);
    mainBodyPhoto.removeAll();
    Icon photo = new ImageIcon(Continents.class.getResource("./images/Countries/"+country.toLowerCase()+".png"));
    photoName = new JLabel(photo);
    mainBodyPhoto.add(photoName);
    SwingUtilities.updateComponentTreeUI(frame);
  }

  public static void changeCity(String city) {
    sectionTitle = city;

    selectedCityLink = getLink(city);
    searchLabel.setText("Search : " + sectionTitle);
    mainBodyPhoto.removeAll();
    Icon photo = new ImageIcon(Continents.class.getResource("./images/Cities/"+city.toLowerCase()+".jpeg"));
    photoName = new JLabel(photo);
    mainBodyPhoto.add(photoName);
    mainLink.removeAll();;
    if(selectedCityLink != ""){
      link = new JButton("Go to link");
      mainLink.add(link);
      link.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e)
        {
            openWebPage(selectedCityLink);
        }
      });
    }
    SwingUtilities.updateComponentTreeUI(frame);
  }

  public static void setInit() {
    sectionTitle = "Search via console :)";

    searchLabel.setText("Search : " + sectionTitle);
    mainBodyPhoto.removeAll();
    Icon photo = new ImageIcon(Continents.class.getResource("./images/world.jpeg"));
    photoName = new JLabel(photo);
    mainBodyPhoto.add(photoName);
    SwingUtilities.updateComponentTreeUI(frame);
  }

  public static String getLink(String city) {
    switch (city) {
      case "ottawa" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNWtzaA&tfu=GgA";
      case "vancouver" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wODBoMg&tfu=GgA";
      case "quebec" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wcG1wMg&tfu=GgA";
      case "washingtondc" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wcmg2aw&tfu=GgA";
      case "newyork" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ8qDQgDEgkvbS8wMl8yODY&tfu=GgA";
      case "mexicocity" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxoOagwIAhIIL20vMDgwaDIaDnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNHNxag&tfu=GgA";
      case "brazilia" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wMWh5Xw&tfu=GioaKAoSCQNuAqHnhi_AEXNbxyXc70fAEhIJQjSrf7-pL8ARc1vHlXb0R8A";
      case "saupaulo" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ8qDQgDEgkvbS8wMjJwZm0&tfu=GioaKAoSCfP56GL6hTfAEVk2zsmPT0fAEhIJWA-ZKJOWN8ARWTbOOSpUR8A";
      case "buenosaires" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ8qDQgDEgkvbS8wMWx5NW0&tfu=GioaKAoSCTLFqZiLSUHAEd7-t7WJLk3AEhIJKglVIf9QQcAR3v63JSQzTcA";
      case "santiago" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wZGxxdg&tfu=GioaKAoSCTynyjeutUDAEdS19qKuqVHAEhIJARp34zu9QMAR1LX22vurUcA";
      case "moscow" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNHN3ZA&tfu=GioaKAoSCb7U-MpK40tAEQ_pt-dQ0UJAEhIJN3TsrzLeS0ARD-m3d7bMQkA";
      case "paris" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNXF0ag&tfu=GioaKAoSCTI_tL6fcEhAEc56Kzct9gJAEhIJb4Sw9KpqSEARznorN4asAkA";
      case "london" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNGpwbA&tfu=GioaKAoSCT-TMpC9w0lAEWC_azwND7y_EhIJWMQzHRu-SUARsN81nvahwr8";
      case "lagos" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wbG5meQ&tfu=GioaKAoSCTC0B4fwPBpAEWSnf39wLQtAEhIJOWzhmfz0GUARZKd_f8njCkA";
      case "nairobi" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNWQ0OQ&tfu=GioaKAoSCfe3KHd-G_S_EScJeMCCa0JAEhIJ3qTdmhs99b8RJwl4UOhmQkA";
      case "cairo" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQkqBwgBEgNDQUk&tfu=GioaKAoSCbL_R-M0Ez5AEa5JbQjyQD9AEhIJmXd4qIgDPkARrkltKL03P0A";
      case "giza" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ8qDQgDEgkvbS8wMTJiMHE&tfu=GioaKAoSCTzZ7Q4uCz5AEUSvLs0ROj9AEhIJ160Sj4D7PUARRK8u7dwwP0A";
      case "beijing" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wMTkxNA&tfu=GioaKAoSCfppdug190NAEXNjel45G11AEhIJrXeyHETwQ0ARc2N6JuwYXUA";
      case "shanghai" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wNndqZg&tfu=GioaKAoSCRZWGuW5Qj9AEUfF_7l3X15AEhIJAACQjj4zP0ARR8X_gSpdXkA";
      case "seoul" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8waHNxZg&tfu=GioaKAoSCVDNjNo6ykJAET94SCigwF9AEhIJkKctiQ3DQkARP3hI8FK-X0A";
      case "busan" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8waHY3bA&tfu=GioaKAoSCbpOpFOUnkFAEWgVR33HImBAEhIJVPC00y6XQUARaBVH4aAhYEA";
      case "tokyo" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wNDVzeWQaHWoNCAQSCS9tLzA0NXN5ZHIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wN2Rmaw&tfu=GioaKAoSCdPEfR9C2kFAEYtQbFNgdWFAEhIJ6KEpkOfSQUARi1Bstzl0YUA";
      case "osaka" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wMThqY3EaHWoNCAQSCS9tLzAxOGpjcXIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgCEggvbS8wZHF5dw&tfu=GgA";
      case "sydney" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wMThqY3EaHWoNCAQSCS9tLzAxOGpjcXIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgDEggvbS8wZnoyNQ&tfu=GioaKAoSCXjNK6YpdUdAEZYMAFU1z03AEhIJERrLKG2sRkARlgwAVYNiTsA";
      case "melbourne" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wMThqY3EaHWoNCAQSCS9tLzAxOGpjcXIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQkqBwgBEgNNRUw&tfu=GioaKAoSCcTfP4sGdULAEUIFLB47MWJAEhIJz9p3ruBZQ8ARQgUsnmcMYkA";
      case "oakland" :
        return "https://www.google.com/travel/explore?tfs=CBwQAxodagwIAhIIL20vMDgwaDJyDQgEEgkvbS8wY3R3X2IaHWoNCAQSCS9tLzBjdHdfYnIMCAISCC9tLzA4MGgyQAFIAXACggELCP___________wGYAQGyAQ4qDAgCEggvbS8wMTJ0cw&tfu=GgA";
      case "mcMurdo Station" :
        return "";
      case "sejong Station" :
        return "";
    
      default:
        break;
    }
    return "";
  }

  public static void openWebPage(String selectedCityLink){
    try {         
      java.awt.Desktop.getDesktop().browse(java.net.URI.create(selectedCityLink));
    }
    catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }
  }

}
