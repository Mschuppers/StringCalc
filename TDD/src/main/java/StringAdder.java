import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {
    public String numbers;

    int add(String numbers) {
        //int a = Integer.parseInt(numbers);


        Matcher matcher = Pattern.compile("\\d+").matcher(numbers);

        List<Integer> numbersIn = new ArrayList<>();
        while (matcher.find()) {
            numbersIn.add(Integer.valueOf(matcher.group()));


        }
        int a = numbersIn.stream().mapToInt(i->i).sum();
        System.out.println(a);
        return a;
    }


}