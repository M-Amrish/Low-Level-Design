package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentMap = new HashMap<>();

    void register(String key, Student student){

        studentMap.put(key,student);
    }

    public Student getRegistry(String key){

        return studentMap.get(key);
    }
}