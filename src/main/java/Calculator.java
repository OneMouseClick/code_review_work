public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b) throws Exception {
        if(b == 0) throw new Exception("Can not divide zero");
        else return a / b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver() throws Exception {
        return times(div(add(25,3), 7), dif(22,15)); // (25+3)/7)*(22-15) = x, x = 28
    }
}
