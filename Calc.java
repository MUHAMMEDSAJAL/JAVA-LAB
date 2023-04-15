class Divider{
    void divide(int x, int y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(x/y);
    }
}
class Calc{
    public static void main(String[] args) {
        Divider divider = new Divider();
        try{
            divider.divide(10,0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}