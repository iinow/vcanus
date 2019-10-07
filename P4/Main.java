class Main {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int value){
        int result = 1;
        for(int i = value; i >= 2; i--){
            result *= i;
        }
        return result;
    }
}