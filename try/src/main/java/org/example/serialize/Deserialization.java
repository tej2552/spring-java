package org.example.serialize;

import java.io.*;

public class Deserialization {

    //De-serialisation is converting the stream of bytes into objects

    public void deserialize() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("data.txt");

        ObjectInputStream os1 = new ObjectInputStream(fis);

        Vehicle car = (Vehicle) os1.readObject();

        System.out.println(car);

        os1.close();
    }
}
