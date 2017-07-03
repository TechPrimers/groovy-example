import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    def fizzBuzz

    @Before
    void setup () {
        fizzBuzz = new FizzBuzz()
    }

    @Test
    void 'should be fizz'() {
        assert fizzBuzz.play(3) == 'Fizz'
    }
    @Test
    void 'should be buzz'() {
        assert fizzBuzz.play(5) == 'Buzz'
    }
    @Test
    void 'should be fizz buzz'() {
        assert fizzBuzz.play(1) == 'FizzBuzz'
    }

}
