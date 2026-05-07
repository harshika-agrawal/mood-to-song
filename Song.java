import java.awt.*;
import java.awt.event.*;

public class Song extends Frame implements ActionListener {

    Button happy, sad, romantic, energetic, party, motivational, relax;
    TextArea output;
    Label heading;

    public Song() {

        setTitle("Mood to Song Suggestion");
        setSize(500, 550);
        setLayout(null);

        // Main Heading
        heading = new Label("Select Your Mood");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 22));
        heading.setBounds(180, 70, 200, 20);
        add(heading);

        // Buttons
        happy = new Button("Happy");
        sad = new Button("Sad");
        romantic = new Button("Romantic");
        energetic = new Button("Energetic");
        party = new Button("Party");
        motivational = new Button("Motivational");
        relax = new Button("Relax");

        // Set button positions
        happy.setBounds(50, 110, 120, 40);
        sad.setBounds(200, 110, 120, 40);
        romantic.setBounds(350, 110, 120, 40);

        energetic.setBounds(50, 170, 120, 40);
        party.setBounds(200, 170, 120, 40);
        motivational.setBounds(350, 170, 120, 40);

        relax.setBounds(200, 230, 120, 40);

        // Text area
        output = new TextArea();
        output.setBounds(70, 300, 360, 200);

        // Add elements
        add(happy); add(sad); add(romantic);
        add(energetic); add(party); add(motivational);
        add(relax); add(output);

        // Add action listeners
        happy.addActionListener(this);
        sad.addActionListener(this);
        romantic.addActionListener(this);
        energetic.addActionListener(this);
        party.addActionListener(this);
        motivational.addActionListener(this);
        relax.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // HAPPY Mood
        if (e.getSource() == happy) {
            setBackground(new Color(255, 223, 88));  // Yellow
            output.setText(
                "🎵 Happy Mood Songs:\n" +
                "1. Dil Dhadakne Do\n" +
                "2. Navrai Majhi\n" +
                "3. What Jhumka\n" +
                "4. Sauda Khara Khara\n" +
                "5. Morni Banke"
            );
        }

        // SAD Mood
        else if (e.getSource() == sad) {
            setBackground(new Color(135, 206, 250)); // Light Blue
            output.setText(
                "🎵 Sad Mood Songs:\n" +
                "1. Ranjha\n" +
                "2. Pachtaoge\n" +
                "3. Mann Bharrya 2.0\n" +
                "4. Hamari Adhuri Kahani\n" +
                "5. Phir Bhi Tumko Chaahunga"
            );
        }

        // ROMANTIC Mood
        else if (e.getSource() == romantic) {
            setBackground(new Color(255, 179, 186)); // Pink
            output.setText(
                "🎵 Romantic Mood Songs:\n" +
                "1. Ve Haniya\n" +
                "2. Haan Ke Haan\n" +
                "3. Pehle Bhi Main\n" +
                "4. Heeriye\n" +
                "5. Satranga"
            );
        }

        // ENERGETIC Mood
        else if (e.getSource() == energetic) {
            setBackground(new Color(255, 102, 102)); // Red
            output.setText(
                "🎵 Energetic Mood Songs:\n" +
                "1. Sher Khul Gaye\n" +
                "2. Jai Jai Shivshankar\n" +
                "3. Malhari\n" +
                "4. Bezubaan (ABCD)\n" +
                "5. Bang Bang – Title Track"
            );
        }

        // PARTY Mood
        else if (e.getSource() == party) {
            setBackground(new Color(255, 153, 255)); // Purple
            output.setText(
                "🎵 Party Mood Songs:\n" +
                "1. Bom Diggy Diggy\n" +
                "2. Coca Cola Tu\n" +
                "3. Kala Chashma\n" +
                "4. Abhi Toh Party Shuru Hui Hai\n" +
                "5. She Move It Like"
            );
        }

        // MOTIVATIONAL Mood (UPDATED COLOR)
        else if (e.getSource() == motivational) {
            setBackground(new Color(190, 210, 255)); // blueberry
            output.setText(
                "🎵 Motivational Mood Songs:\n" +
                "1. Brothers Anthem\n" +
                "2. Kar Har Maidaan Fateh\n" +
                "3. Sultan – Title Track\n" +
                "4. Dangal – Title Track\n" +
                "5. Ziddi Dil"
            );
        }

        // CHILL Mood (UPDATED COLOR)
        else if (e.getSource() == relax) {
            setBackground(new Color(230, 210, 255)); // Light Lavender 
            output.setText(
                "🎵 Relax / Chill Mood Songs:\n" +
                "1. Shayad (Calm Version)\n" +
                "2. Khairiyat (Acoustic)\n" +
                "3. Sun Saathiya (Lofi)\n" +
                "4. Safarnama\n" +
                "5. Rait Zara Si (Acoustic)"
            );
        }
    }

    public static void main(String[] args) {
        new Song();
    }
}