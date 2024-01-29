package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.*;
import model.global.GlobalData;

public class HandleFicheroCopia {

    Path path = Paths.get("datos.txt");
    GlobalData globalData = null;

    public void checkCopyExists() {
        if (!Files.exists(path)) {
            //El fichero no existe, se crea:
            System.out.println("No se ha encontrado copia de seguridad, creando una...");
            globalData = GlobalData.getInstance();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos.txt"))) {
                oos.writeObject(globalData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // El archivo existe, por lo que vamos a leer su contenido
            System.out.println("Cargando datos de la copia de seguridad...");
            // Primero, creamos un flujo de entrada de archivo con el nombre del archivo
            FileInputStream fis = null;
            try {
                fis = new FileInputStream("datos.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // Luego, creamos un ObjectInputStream con el FileInputStream
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Intentamos leer un objeto del ObjectInputStream
            try {
                globalData = (GlobalData) ois.readObject();
                System.out.println("Datos de lectura de globalData: "+ globalData.toString());
                
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

            // Finalmente, cerramos el ObjectInputStream
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    
    
    
    
    
    
  public void updateCopiaSeguridad() {
      System.out.println("Creando copia seguridad");
    // Obtenemos la instancia de GlobalData
    GlobalData globalData = GlobalData.getInstance();

    // Creamos un flujo de salida de archivo con el nombre del archivo
    FileOutputStream fos = null;
    try {
        fos = new FileOutputStream("datos.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    // Creamos un ObjectOutputStream con el FileOutputStream
    ObjectOutputStream oos = null;
    try {
        oos = new ObjectOutputStream(fos);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Intentamos escribir el objeto GlobalData en el ObjectOutputStream
    try {
        oos.writeObject(globalData);
        
       verCopiaSeguridad();
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Finalmente, cerramos el ObjectOutputStream
    try {
        oos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

  public void verCopiaSeguridad() {
    GlobalData globalData = null;

    // Creamos un flujo de entrada de archivo con el nombre del archivo
    FileInputStream fis = null;
    try {
        fis = new FileInputStream("datos.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    // Creamos un ObjectInputStream con el FileInputStream
    ObjectInputStream ois = null;
    try {
        ois = new ObjectInputStream(fis);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Intentamos leer un objeto del ObjectInputStream
    try {
        globalData = (GlobalData) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    // Finalmente, cerramos el ObjectInputStream
    try {
        ois.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Ahora puedes ver los datos de GlobalData
    System.out.println("se ha escrito: "+ globalData);
}

  
  
    

}
