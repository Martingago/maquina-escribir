package model.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaPalabrasEncontradas implements Serializable {

    private static ListaPalabrasEncontradas  instance = null;
    private ArrayList<DesencriptedWord> listPalabrasDesencriptadas;

    //Constructor de la lista de palabras encontradas
    public ListaPalabrasEncontradas() {
        this.listPalabrasDesencriptadas = new ArrayList<>();
    }
    
    
    public static ListaPalabrasEncontradas getInstance(){
    if(instance == null){
        instance = loadData();
        
    }
        return instance;
    }
    
    
        /**
     * Función que comprueba si existe un fichero para guardar datos.
     *   ==> Si el fichero existe se obtiene la información del mismo y se cargan sus datos en un objeto ListaPalabrasEncontradas que se devolverá.
     *   ==> Si el fichero NO existe, se creará dicho fichero, y se le escribirá una instancia de ListaPalabrasEncontradas default.
     * @return objeto ListaPalabrasEncontradas
     */
    private static ListaPalabrasEncontradas loadData() {
        File file = new File("list_palabras_datos.ser");
        if (file.exists()) {
            //Si el fichero existe se cargan los datos desde el fichero
            System.out.println("Se ha encontrado un fichero de listado de palabras");
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (ListaPalabrasEncontradas) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException("Error al cargar los datos", e);
            }
        } else {
            ListaPalabrasEncontradas lista = new ListaPalabrasEncontradas();
            // inicializar con la información por defecto
            guardarDatos(lista);
            return lista;
        }

    }
    
    
        /**
     * Sobreescribe los datos de GlobalData en el fichero
     * @param lista
     */
    public static void guardarDatos(ListaPalabrasEncontradas lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list_palabras_datos.ser"))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar los datos", e);
        }
    }
    
    
    
    
    

    //Añade una palabra a la lista de palabras encriptadas
    public void addPalabraDesencriptada(DesencriptedWord palabra) {
        this.listPalabrasDesencriptadas.add(palabra);
    }

    public ArrayList<DesencriptedWord> getListPalabrasDesencriptadas() {
        return listPalabrasDesencriptadas;
    }

    @Override
    public String toString() {
        return "ListaPalabrasEncontradas{" + "listPalabrasDesencriptadas=" + listPalabrasDesencriptadas + '}';
    }
    
    

}
