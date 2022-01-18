package javademos.optionals;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalsDemo {
    
    public static void main(String[] args) {
        
        String str = "Ashish";
        Optional<String> strOptional = Optional.ofNullable(str);
        // if(strOptional.isPresent()){
        //     System.out.println(str.toUpperCase());
        // }
        // else{
        //     System.out.println("String is not present");
        // }
        strOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        strOptional.ifPresentOrElse( // Java 9+
                s -> System.out.println(s.toUpperCase()), 
                () -> System.out.println("String is not present")
        );
        
    }
}
