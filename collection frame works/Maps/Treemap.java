package Maps;
import java.util.TreeMap;

public class Treemap{
    public static void main(String[] args) {
        TreeMap<Integer,Integer> num=new TreeMap<>();

        num.put(1,2 );
        num.put(2,3 );
        num.put(3,4);
        num.put(5,6);
        num.put(9,7);

        System.out.println(num);
        System.out.println("keys:"+num.keySet());
        System.out.println("values:"+num.values());
        System.out.println("remove:"+num.remove(2));
        System.out.println("size:"+num.size());
        System.out.println("contains key:"+num.containsKey(1));
        System.out.println("contains value:"+num.containsValue(4));
        System.out.println(num.getOrDefault(2,0));
        
        num.replace(4, 5, 10);
        System.out.println(num);

        System.out.println(num.merge(1, 3, Integer::sum)); 
        System.out.println(num);

        System.out.println("firstkey:"+num.firstKey());
        System.out.println("lastkey:"+num.lastKey());
        System.out.println("higherkey:"+num.higherKey(3));
        System.out.println("lowerkey:"+num.lowerKey(3));
        
        System.out.println(num.ceilingKey(8));
        System.out.println(num.floorKey(8));
        System.out.println(num.pollFirstEntry());

        System.out.println(num);

    }
    
}
    

