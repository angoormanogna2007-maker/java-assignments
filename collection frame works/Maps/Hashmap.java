package Maps;
import java.util.HashMap; 


public class Hashmap {
    
public static void main(String[]args){
 
HashMap<String,String> name = new HashMap<>(); 

name.put("Bhavitha","Devi"); 
name.put("Niharika","Divya"); 
name.put("pragna","Hasini");
name.put("sowmya","Minny");
name.put("Bhavitha","Devi");

    System.out.println(name);
    System.out.println(name.get("Bhavitha"));
    System.out.println(name.get("Niharika"));
    System.out.println(name.get("Sowmya"));
    System.out.println(name.get("Pragna"));
     

    System.out.println("keys:"+name.keySet());
    System.out.println("values:"+name.values());
    System.out.println("Contains the keys:"+name.containsKey("Bhavitha"));
    System.out.println("contains the valuee:"+name.containsValue("Divya"));
    System.out.println(name.remove("Minny"));
    System.out.println(name);
    System.out.println(name.getOrDefault("roshini", "not there"));
    }
 
}
        

