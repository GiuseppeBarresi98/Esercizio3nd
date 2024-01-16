import java.util.HashMap;
import java.util.Map;

public class Rubrica {
   private Map<String,String> rubrica;
   public Rubrica(){
    rubrica = new HashMap<>();
 }

 public void inserisciContatto(String nome,String numero){
      rubrica.put(nome,numero);
 }

 public void cancellazioneContatto(String nome){
      rubrica.remove(nome);
 }

 public String ricercaContatto(String numero){
      for(Map.Entry<String,String> entry : rubrica.entrySet()){
         if(entry.getValue().equals(numero)){
            return entry.getKey();
         }

      }
    return  null;

 }

 public String ricercaPerNome(String nome){
      return rubrica.get(nome);

 }


 public void stampaNumeri(){
      for(Map.Entry<String,String> entry : rubrica.entrySet()){
         System.out.println("Nome: " + entry.getKey() + "Numero: " + entry.getValue());
      }
 }




}
