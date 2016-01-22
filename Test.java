public class Test
{    
    /**
     * Método test para comprobar el método sumValuesInterval
     */
    public void testSumValuesInterval()
    {
        Calculadora calculadora = new Calculadora();

        boolean resultadoCorrecto = true;
        
        if (calculadora.sumValuesInterval(1,1)==1) {
            System.out.println("Comprobando sumValueInterval(1,1)...resultado correcto 1 / resultado  método " + calculadora.sumValuesInterval(1,1) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(1,1)...resultado correcto 1 / resultado  método " + calculadora.sumValuesInterval(1,1) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.sumValuesInterval(0,2)==3) {
            System.out.println("Comprobando sumValueInterval(0,2)...resultado correcto 3 / resultado  método " + calculadora.sumValuesInterval(0,2) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(0,2)...resultado correcto 3 / resultado  método " + calculadora.sumValuesInterval(0,2) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.sumValuesInterval(2,1)==3) {
            System.out.println("Comprobando sumValueInterval(2,1)...resultado correcto 3 / resultado  método " + calculadora.sumValuesInterval(2,1) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(2,1)...resultado correcto 3 / resultado  método " + calculadora.sumValuesInterval(2,1) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.sumValuesInterval(2,-1)==-1) {
            System.out.println("Comprobando sumValueInterval(2,-1)...resultado correcto -1 / resultado  método " + calculadora.sumValuesInterval(2,-1) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(2,-1)...resultado correcto -1 / resultado  método " + calculadora.sumValuesInterval(2,-1) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.sumValuesInterval(0,3)==6) {
            System.out.println("Comprobando sumValueInterval(0,3)...resultado correcto 6 / resultado  método " + calculadora.sumValuesInterval(0,3) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(0,3)...resultado correcto 6 / resultado  método " + calculadora.sumValuesInterval(0,3) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.sumValuesInterval(-5,-10)==-1) {
            System.out.println("Comprobando sumValueInterval(-5,-10)...resultado correcto -1 / resultado  método " + calculadora.sumValuesInterval(-5,-10) + " ...OK");
        }
        else {
            System.out.println("Comprobando sumValueInterval(-5,-10)...resultado correcto -1 / resultado  método " + calculadora.sumValuesInterval(-5,-10) + "...ERROR");
            resultadoCorrecto = false;
        } 
        
        if (!resultadoCorrecto) {
            System.out.println("El método NO funciona correctamente");
        }
        else {
            System.out.println("El método SI funciona correctamente");
        }
    }

    /**
     *  Método test para comprobar el método isPrime
     */
    public void testIsPrime()
    {
        Calculadora calculadora = new Calculadora();

        boolean resultadoCorrecto = true;

           
                if (calculadora.isPrime(-5)){
            System.out.println("Comprobando isPrime(-5)...resultado correcto true / resultado  método " + calculadora.isPrime(-5) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(-5)...resultado correcto true / resultado  método " + calculadora.isPrime(-5) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.isPrime(0)){
            System.out.println("Comprobando isPrime(0)...resultado correcto true / resultado  método " + calculadora.isPrime(0) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(0)...resultado correcto  true / resultado  método " + calculadora.isPrime(0) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (calculadora.isPrime(2)){
            System.out.println("Comprobando isPrime(2)...resultado correcto true / resultado  método " + calculadora.isPrime(2) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(2)...resultado correcto true / resultado  método " + calculadora.isPrime(2) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (!calculadora.isPrime(4)){
            System.out.println("Comprobando isPrime(4)...resultado correcto false / resultado  método " + calculadora.isPrime(4) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(4)...resultado correcto false / resultado  método " + calculadora.isPrime(4) + "...ERROR");
            resultadoCorrecto = false;
        }
            
        if (!calculadora.isPrime(10)){
            System.out.println("Comprobando isPrime(10)...resultado correcto false / resultado  método " + calculadora.isPrime(10) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(10)...resultado correcto false / resultado  método " + calculadora.isPrime(10) + "...ERROR");
            resultadoCorrecto = false;
        }

        if (calculadora.isPrime(101)){
            System.out.println("Comprobando isPrime(101)...resultado correcto true / resultado  método " + calculadora.isPrime(101) + "...OK");
        }
        else {
            System.out.println("Comprobando isPrime(101)...resultado correcto true / resultado  método " + calculadora.isPrime(101) + "...ERROR");
            resultadoCorrecto = false;
        }
        
        if (resultadoCorrecto) {
            System.out.println("El método SI funciona correctamente");
        }
        else {
            System.out.println("El método NO funciona correctamente");
        }
    }
}
