import org.junit.jupiter.api.Test;

public class TestAnatation {

    @Test
    public void TestAnnotations (){
        TestBase annot = new TestBase();
        annot.openPage();
        annot.searchRepository();
        annot.goTo();
        annot.openIssures();
        annot.checkNumber();

    }
}
