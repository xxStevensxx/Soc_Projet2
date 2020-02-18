package com.hemebiotech.analytics;


import java.util.*;

public class OutSymptoms {

    private ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("symptoms.txt");
    public Map<String, Integer> listSymptoms = new HashMap<String, Integer>();

    List<String> symptoms = read.getSymptoms();


         public void countSymptoms() {


             for (int i = 0; i < symptoms.size(); i++) {


                 /**Alimente le contenu de ma map clé valeur, si la clé de la valeur de mon fichier symptome n'existe pas.
                  *
                  * */
                 if (!this.listSymptoms.containsKey(symptoms.get(i))) {
                     this.listSymptoms.put(symptoms.get(i), 1);

                 } else {
                     /**Permet d'incrémenter la clé de la valeur, si la valeur est déja éxistante'
                      *
                      * */
                     this.listSymptoms.replace(symptoms.get(i), this.listSymptoms.get(symptoms.get(i)) + 1);
                 }
             }
         }


        public void triMap() {

             /**Création d'une nouvelle map treeMap qui me permettra de trier dans l'ordre mes symptoms\
              *
              * */
            Map sortedMap = new TreeMap(listSymptoms);

            Set sortMap = sortedMap.entrySet();
            Iterator iterator = sortMap.iterator();

            while (iterator.hasNext()) {
                Map.Entry mapEntry = (Map.Entry) iterator.next();
                System.out.print(mapEntry.getKey() + " : ");
                System.out.println(mapEntry.getValue());
            }
        }
}

