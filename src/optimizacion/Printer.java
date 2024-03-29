
package optimizacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Desarrollado por
 * Jose Arias Carazo, B40569
 * Eduardo Biazzetti Sibaja, B40999
 * Javier Fernández Aguilar, B32540
 * 2018
 */

public class Printer {
    
    /**
     * Metodo printResults
     * 
     * Escribe en un archivo de texto (.txt) el contenido de todos los
     * objetos Solucion en la lista de incluida como parametro
     * 
     * @param filename: El nombre del archivo donde se va a escribir los resultados.
     *                  Si el archivo ya existe se continua desde la ultima linea
     * @param dalist: La lista que contiene todos los objetos Solucion a escribir
     * @param gen: Un valor entero. En el caso de los resultados funciona para 
     *              saber cual es la generacion que se esta escribiendo.
     */
    
    
    public void printResults(String filename, List<Solucion>dalist, int gen){
        List<HashMap<String,Double>> resList = new ArrayList<HashMap<String,Double>>();
        
        for(int i = 0; i<dalist.size();++i){
            resList.add(dalist.get(i).getAllMap());
        }
        
        try {
            HashMap<String,Double> hmap = new HashMap<String,Double>();
            BufferedWriter wr = new BufferedWriter(new FileWriter(filename + ".txt", true));   
            Iterator<HashMap<String, Double>> it = resList.iterator();

           while (it.hasNext()) {
                hmap = it.next();
                wr.append("--------Generacion "+gen+"------------");
                wr.newLine();
                wr.append("Solucion Id: "+hmap.get("id"));
                wr.newLine();
                
                wr.append("cell-density: "+hmap.get("cell-density"));
                wr.newLine();
                
                wr.append("initial-infected-cell-percentage: "+hmap.get("initial-infected-cell-percentage"));
                wr.newLine();
                wr.append("viral-reach: "+hmap.get("viral-reach"));
                wr.newLine();
                wr.append("infection-rate: "+hmap.get("infection-rate"));
                wr.newLine();
                wr.append("mNeptune-effectiveness: "+hmap.get("mNeptune-effectiveness"));
                wr.newLine();
                wr.append("initial-probability-of-death: "+hmap.get("initial-probability-of-death"));
                wr.newLine();
                wr.append("initial-probability-of-chromatin-condensation: "+hmap.get("initial-probability-of-chromatin-condensation"));
                wr.newLine();
                wr.append("marker-detection-threashold: "+hmap.get("marker-detection-threashold"));
                wr.newLine();
                
                wr.append("alive 1: "+hmap.get("alive1"));
                wr.newLine();
                wr.append("dead 1: "+hmap.get("dead1"));
                wr.newLine();
                wr.append("infected 1: "+hmap.get("infected1"));
                wr.newLine();
                
                wr.append("alive 2: "+hmap.get("alive2"));
                wr.newLine();
                wr.append("dead 2: "+hmap.get("dead2"));
                wr.newLine();
                wr.append("infected 2: "+hmap.get("infected2"));
                wr.newLine();
                
                wr.append("alive 3: "+hmap.get("alive3"));
                wr.newLine();
                wr.append("dead 3: "+hmap.get("dead3"));
                wr.newLine();
                wr.append("infected 3: "+hmap.get("infected3"));
                wr.newLine();
                
                wr.append("alive 4: "+hmap.get("alive4"));
                wr.newLine();
                wr.append("dead 4: "+hmap.get("dead4"));
                wr.newLine();
                wr.append("infected 4: "+hmap.get("infected4"));
                wr.newLine();
                
                wr.append("alive 5: "+hmap.get("alive5"));
                wr.newLine();
                wr.append("dead 5: "+hmap.get("dead5"));
                wr.newLine();
                wr.append("infected 5: "+hmap.get("infected5"));
                wr.newLine();
                
                wr.append("Total de Celulas : "+hmap.get("Cell-Total"));
                wr.newLine();
                wr.append("Fitness :"+hmap.get("Fitness"));
                wr.newLine();
            }
             wr.append("------------------------------");
             wr.close();
        } catch (Exception e) {

        }
        
        
    }    
}
