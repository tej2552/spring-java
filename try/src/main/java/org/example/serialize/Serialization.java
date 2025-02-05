package org.example.serialize;

import java.io.*;

public class Serialization{

    Vehicle car = new Vehicle("Subaru");

    //Serialisation is converting the objects into stream of bytes
    public void serialise() throws IOException {

        FileOutputStream fos = new FileOutputStream("data.txt");

        ObjectOutputStream os = new ObjectOutputStream(fos);

        os.writeObject(car);

        System.out.println(os);

        os.close();

    }

}
