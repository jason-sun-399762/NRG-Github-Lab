public class TestClass{
    private double varible1, varible2;

    public TestClass(double v1, double v2){
        varible1=v1;
        varible2=v2;
    }
    /*
        This method return a double value,
        the product of the two varibles.
    */
    public double getProduct(){
        return varible1*varible2;
    }

    /*
        This method set the value of varible1
    */
    public void setV1(double newV1){
        varible1 = newV1;
    }
    /*
        This method set the value of varible2
    */
    public void setV2(double newV2){
        varible2 = newV2;
    }
    /*
        This method is used to get varible1
    */
    public double getV1(){
        return varible1;
    }
    /*
        This method is used to get varible2
    */
    public double getV2(){
        return varible2;
    }
}