import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeTestClass {
    Palindrome pld;
    @BeforeTest
    public void setup(){
        pld = new Palindrome();
    }

    @Test
    public void validPalindromeTest(){
        // this assertion should pass
        Assert.assertTrue(pld.isPalindrome("racecar"));
    }
    @Test
    public void invalidPalindromeTest(){
        // this assertion should pass
        Assert.assertFalse(pld.isPalindrome("troy"));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void nullPointerCheck(){
        // this assertion should pass
        Assert.assertTrue(pld.isPalindrome(null));
    }
    @Test
    public void emptyStringCheck(){
        Assert.assertFalse(pld.isPalindrome(""));
    }

    @Test
    public void singleCharacter(){
        Assert.assertTrue(pld.isPalindrome("a"));
    }


    @AfterTest
    public void tearDown(){
        pld = null;
    }
}
