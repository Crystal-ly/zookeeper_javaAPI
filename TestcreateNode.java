import org.junit.Test;

public class TestcreateNode {
    @Test
    public void TestcreateZnode(){
        createNode node =new createNode();
        try{
            node.createZnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @Test
    public void TestcreateTnode(){
        createNode node =new createNode();
        try{
            node.createTnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @Test
    public void TestcreateZPnode(){
        createNode node =new createNode();
        try{
            node.createZPnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @Test
    public void TestsetZnode() {
        createNode node =new createNode();
        try{
            node.setZnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void TestgetZnode() {
        createNode node =new createNode();
        try{
            node.getZnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void TestwatchZnode(){
        createNode node =new createNode();
        try{
            node.watchZnode();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
