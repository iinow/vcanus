class Main {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int value){
        if(value == 1){
            return 1;
        }
        return value * factorial(value - 1);
    }
}