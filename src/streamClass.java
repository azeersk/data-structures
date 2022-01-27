import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class streamClass {
    public static void main(String[] args){
        Map<String,Integer> student = new HashMap<>();
        System.out.println("Size of the map: "+student.size());
        student.put("id", 118055);
        student.put("C.Code", 2233);
        student.put("age",20);
        student.put("Roll.No",56);
        System.out.println("Map: "+student);

        student.replace("id",126023);
        System.out.println("Map, after replace: "+student);
        int R_No = student.get("Roll.No");
        System.out.println("Roll.No: "+ R_No);

        student.remove("Roll.No");
        System.out.println("Map, after remove: "+ student);
        System.out.println("vales of the map: "+ student.values());
        System.out.println("Keys of the map: "+ student.keySet());
        student.forEach((e,a)->System.out.println(e +": "+ a));

        System.out.println("Size of the Map: "+student.size());
        System.out.println("Before clear map is empty: "+student.isEmpty());
        student.clear();
        System.out.println("After clear map is empty: "+student.isEmpty());

        Map<String, Integer> student1 = new TreeMap<>();
        student1.put("id", 102121);
        student1.put("roll.no", 49);
        student1.put("age", 20);
        student1.put("subjects", 5);
        student1.put("attendance", 97);
        System.out.println("using treemap: "+ student1);

        student.putAll(student1);
        System.out.println("hash map: "+student);

        System.out.println("Size of the tree map: "+ student1.size());
        student1.forEach((b,c)->{System.out.println(b+": "+ c);});
        student1.replace("age",21);
        System.out.println("after replacing the tree map: "+student1);
    }
}
