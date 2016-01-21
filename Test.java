public class Test
{
    /**
     * Método que imprime por pantalla todos los múltiplos de 5 entre 10 y 95(ambos extremos excluidos)
     */
    public void multiplesOfFive()
    {
        int num1 = 10; 
        int num2 = 95;
        int multiplo = 5;
        while (num1<=(num2-multiplo)) {
            num1++;
            if (num1%multiplo==0) {
                System.out.println(num1);
            }
        }
    }

    /**
     * Saca por pantalla la suma de los números comprendidos entre el 0 y el 10(ambos incluidos)
     */
    public void sumValues()
    {
        int num1 = 0;
        int num2 = 10;
        int total = 0;
        while (num1<=num2) {
            total = total + num1;
            num1++;
        }
        System.out.println(total);
    }

    /**
     * Recibe dos parámetros enteros a y b y muestre la suma de los valores comprendidos
     * entre dichos parámetros (ambos incluidos) y haz un commit.
     */
    public int sumValuesInterval(int a,int b)
    {
        int total = 0; 
        if (a>=0 && b>=0){
            if (b<a) {
                int c = a; // Variable auxiliar para intercambiar el valor de los parametros
                a = b; // Se cambian valores para guardar en "a" el valor más pequeño
                b = c; // Se cambian valores para guardar en "b" el mayor valor (guardado en "c")
            }
            while (a<=b) {
                total = total + a;
                a++;
            }    
        }
        else {
            System.out.println("[ERROR] Deben introducirse valores positivos");
            total = -1;
        }
        return total;
    }
    
    /**
     * Método que devuelve true si el parámetro "n" es veradero y false en caso contrario
     */
    public boolean IsPrime(int n)
    {
        boolean esPrimo = true;
        if (n>1) {
            int aux = 2;
            while (aux<n) {
                if (n%aux==0) {
                    esPrimo = false;
                }
                aux++;
            }
        }
        else {
            esPrimo = false;
            System.out.println("[ERROR] Deben introducirse valores mayores que 1");
        }
        return esPrimo;
    }
}
