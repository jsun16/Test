class Test{

    private static String a = "a";
    private String a1 = "a1";

    public static String get(){
        return a;
    }

    public String get1() {
        return a;
    }


    static int minus(int a, int b){
        int c = a - b;
        System.out.println("minus operation: " + c);
        return c;
    }

    static void add(int a, int b){
        int c = a + b;
        System.out.println("add operation: " + c);
    }

    float times(float a, float b){
        float c = a * b;
        System.out.println("times operation: " + c);
        return c;
    }

    void divide(float a, float b){
        float c = a / b;
        System.out.println("times operation: " + c);
    }

    public static void main(String[] args){
        minus(123456,654321);
        add(123456,654321);
        Test ts = new Test();
        ts.times(123456, 654321);
        ts.divide(123456, 654321);
    }

}
