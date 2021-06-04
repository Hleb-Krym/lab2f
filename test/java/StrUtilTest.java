import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrUtilTest {

    private StrUtil s;

    @Before
    public void setup(){
        s = new StrUtil();
    }

    @Test
    public void small() {
        String str = "Hello World";
        Assert.assertEquals("hello world",s.small(str));
    }

    @Test
    public void big() {
        String str = "Hello World";
        Assert.assertEquals("HELLO WORLD",s.big(str));

    }

    @Test
    public void length() {
        String str = "Hello World";
        Assert.assertEquals(11, s.length(str));
    }
    @Test
    public void unite() {
        String s1 = "Hello ", s2 = "World";
        Assert.assertEquals("Hello World", s.unite(s1, s2));
    }

}
