public class problems {
    
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-2) + fibonacci(n-1);
    }

    public int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n/10);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2+bunnyEars(bunnies-1);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) return 3+bunnyEars2(bunnies-1);
        return 2+bunnyEars2(bunnies-1);
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows+triangle(rows-1);
    }

}
