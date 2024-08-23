public class MathFunctions {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public float sub(float a, float b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public float multiply(float a, float b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public double div(double a, double b) {
        return a/b;
    }
    public float div(float a, float b){
        return a/b;
    }
    public int abs(int a){
        return Math.abs(a);
    }
    public double abs(double a){
        return Math.abs(a);
    }
    public float abs(float a){
        return Math.abs(a);
    }
    public int pow(int a){
        return a*a;
    }
    public double pow(double a){
        return a*a;
    }
    public float pow(float a){
        return a*a;
    }

    public static void main(String[] args) {
        MathFunctions mf = new MathFunctions();
        System.out.println(mf.add(5,3));
        System.out.println(mf.add(5.3, 4.2));
        System.out.println(mf.add(4.3f, 5.3f));
        System.out.println(mf.sub(5,3));
        System.out.println(mf.sub(5.3, 4.2));
        System.out.println(mf.sub(5.3f, 3.6f));
        System.out.println(mf.multiply(3, 2));
        System.out.println(mf.multiply(3.2, 2.2));
        System.out.println(mf.multiply(3.4f, 2.5f));
        System.out.println(mf.div(6, 3));
        System.out.println(mf.div(6.4, 3.2));
        System.out.println(mf.div(6.7f, 3.7f));
        System.out.println(mf.abs(-8));
        System.out.println(mf.abs(-4.3));
        System.out.println(mf.abs(-4.8f));
        System.out.println(mf.pow(8));
        System.out.println(mf.pow(4.4));
        System.out.println(mf.pow(4.6f));
    }
}
