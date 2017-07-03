public class FizzBuzz {

    public String play(final int num) {

        if(num % 3 == 0) return "Fizz";
        if(num % 5 == 0) return "Buzz";
        return "FizzBuzz";
    }

}
