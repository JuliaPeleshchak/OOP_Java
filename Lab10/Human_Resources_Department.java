package ua.lpnuai.oop.peleshchak10;

import java.io.*;
import java.util.*;

public class Human_Resources_Department {

        public static void main(String[] args) throws IOException {
            int a = 100;
            Scanner text = new Scanner(System.in);
            if (!args[0].equalsIgnoreCase("Admin") && !args[0].equalsIgnoreCase("User")) {
                System.out.println("Please start program with 'User' or 'Admin' ");
            } else if (args[0].equalsIgnoreCase("Admin")) {
                System.out.println("If you want to check resume press 1, exit press 0");
                do {
                    a = text.nextInt();
                    if (a != 0 && a != 1) {
                        System.out.println("Please press 1 or 0");
                    }

                } while (a != 0 && a != 1);
                if (a == 0) {
                    System.out.println("Goodbye");
                    return;
                }
                else {
                    Human_Resources_Department allinfo=new Human_Resources_Department();
                    allinfo.WriteInfo();

                }
            }
            else if(args[0].equalsIgnoreCase("User")){
                Human_Resources_Department allinfo=new Human_Resources_Department();
                allinfo.ReadInfo();
            }
        }


        private void WriteInfo() {
            int count=0;
            List<String> info = new LinkedList<>();
            String line;

            try{
                BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));

                while((line=reader.readLine())!=null){
                    info.add(line);
                    count++;
                }
                reader.close();

            }
            catch (IOException e){
                System.out.println("Error");
            }
            for(int i=0;i<count/9;i++) {
                System.out.print("Agent number : ");
                System.out.println(i+1);
                System.out.println("Name: " + info.get(i * 9));
                System.out.println("Surname: " + info.get((9*i+1)));
                System.out.println("Passport data: " + info.get((9*i+2)));
                System.out.println("Education: " + info.get((9*i+3)));
                System.out.println("Salary: " + info.get((9*i+4)));
                System.out.println("Career: " );
                System.out.println("1.Date of appointment: " + info.get((9*i+5)));
                System.out.println("2.Position: " + info.get((9*i+6)));
                System.out.println("3.Dapartment: " + info.get((9*i+7)));
                System.out.print("Characteristic: " + info.get((9*i+8))+"\n");
                System.out.print("\n");
            }

        }
        private void ReadInfo() throws  IOException{
            try {
                Scanner infowriter = new Scanner(System.in);
                FileWriter fw=new FileWriter("Text.txt",true);
                System.out.println("Please fill your personal card co-worker:");
                System.out.println("Your Name: ");
                String lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your Surname: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your Passport Data: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your Education: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your Salary: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Career: ");
                System.out.println("1.Date of appointment: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("2.Position: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("1.Department: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your Characteristic - a set of properties and ratings: ");
                lineTowrite = infowriter.nextLine();
                fw.write(lineTowrite);
                fw.write(System.lineSeparator());
                System.out.println("Your personal card co-worker is successfully created.");
                fw.close();

            }
            catch (IOException e){
                System.out.println("Error");
            }


        }


    }


