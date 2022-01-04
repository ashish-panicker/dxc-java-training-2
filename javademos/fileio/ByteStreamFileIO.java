package javademos.fileio;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ByteStreamFileIO {

    public static void main(String[] args) {
        try {
            String userName = null;
            String password = null;

            Console console = System.console();
            if(console == null){
                System.err.println("No console.");
                return;
            }
            // Read the user name and password from the console
            System.out.println("Enter user name: ");
            userName = console.readLine();

            System.out.println("Enter password: ");
            char[] cPassword = console.readPassword();

            password = String.valueOf(cPassword);            

            readLogin(userName, password);

        } catch (IOException e) {
            System.err.println("File IO Error - " + e.getMessage());
        }
    }

    static void readLogin(String userName, String password) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("login.txt"))){
            String line = null;
            while((line = br.readLine()) != null){
                String[] info = line.split("-");
                if(info[0].equals(userName) && info[1].equals(password)){
                    System.out.format("Login successful for user %s %n", userName);
                    return;
                }else{
                    System.out.format("Login failed for user %s %n", userName);
                }
            }
        }
    }

    static void registerUser(String userName, String password) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("login.txt", true))) {
            pw.println(userName + "-" + password);
            pw.flush();
        }
    }

    static void writeIntoFile(String data) throws IOException {
        FileWriter fileWriter = new FileWriter("movienames.txt", true); // append = true
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(data);
            printWriter.flush();
        } // try with rseource, possible the class implements Closable
    }

    static void readDataLineByLine() throws IOException {
        FileReader fileReader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    static void readDataAsCharStream() throws IOException {
        FileReader fileReader = new FileReader("data.txt");
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        fileReader.close();

    }

    static void readDataAsByteStream() throws IOException {
        FileInputStream fileInStream = null;
        fileInStream = new FileInputStream("data.txt");
        int data;
        do {

            data = fileInStream.read();
            System.out.print((char) data);
        } while (data != -1);
        fileInStream.close();
    }
}
