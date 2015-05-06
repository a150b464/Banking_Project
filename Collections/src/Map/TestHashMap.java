package Map;

public class TestHashMap {
  public static void main(String ar[]) {
    SimpleHashMap<String, String> simpleHashMap = new SimpleHashMap<String, String>();
    simpleHashMap.put("101", "Vikas");
    simpleHashMap.put("101", "Amit");
    simpleHashMap.put("102", "Akash");
    
    System.out.println(simpleHashMap.get("101"));
    System.out.println(simpleHashMap.get("102"));
    
  }
}
