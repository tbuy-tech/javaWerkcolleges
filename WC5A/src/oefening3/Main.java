package oefening3;
import java.io.*;
import java.nio.charset.StandardCharsets;

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

public class Main {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file.";
        Dog dog = new Dog("Tom", "Terrier");

        try {
            OutputStream out = new FileOutputStream("C:\\Users\\THOMAS\\Documents\\EHB\\Prog2\\Werkcolleges\\WC5A\\src\\oefening3\\input.txt", true);

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }



        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\THOMAS\\Documents\\EHB\\Prog2\\Werkcolleges\\WC5A\\src\\oefening3\\input.txt", true);

            byte[] dogName = dog.getName().toString().getBytes();
            byte[] dogBreed = dog.getBreed().toString().getBytes();
            output.write(dogName);
            output.write(dogBreed);

            output.close();
        } catch ( Exception e) {
            e.printStackTrace();
        }

        byte[] array = new byte[200];
        try {
            InputStream input = new FileInputStream("C:\\Users\\THOMAS\\Documents\\EHB\\Prog2\\Werkcolleges\\WC5A\\src\\oefening3\\input.txt");
            System.out.println("Available bytes in the file: " + input.available());
            input.read(array);
            System.out.println("Data read from the file: ");
            String s = new String(array, StandardCharsets.UTF_8);
            System.out.println("Output : " + s);
            input.close();
        } catch (FileNotFoundException e ) {
            System.out.println("File not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
