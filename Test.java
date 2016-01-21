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
}

