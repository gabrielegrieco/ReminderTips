package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Person kevin = new Person("Kevin", "McCallister");
	    try{
            writeToFile(kevin);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        /*
        try{
            readFile();
        }catch (ClassNotFoundException | IOException e){
            System.out.println(e.getMessage());
        }
         */
    }
    public static void writeToFile(Person p) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
        objectOutputStream.writeObject(p);
    }
    public static void readFile() throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.bin"));

        Person name = (Person)objectInputStream.readObject();
        System.out.println(name);
    }
}
