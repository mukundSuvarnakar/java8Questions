package Scenarios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Scenario1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("mukund","rushi",null);

        List<String> newString=list.stream().filter(s->s!=null)
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(newString);

      //  Optional.ofNullable(list).map(String::toUpperCase).ifPresent(System.out::println);
    }
}
