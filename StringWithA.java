import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithA {

    public static void main(String[] args) {

        List <String> names = Arrays.asList("abc","bbb","ab","bcd","aaa");

        List<String> longnames = names.stream()  
                .filter(str -> str.startsWith("a") && str.length() == 3) //Multiple conditions
                .collect(Collectors.toList());  

        longnames.forEach(System.out::println);           

    }

}