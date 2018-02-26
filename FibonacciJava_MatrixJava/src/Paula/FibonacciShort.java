package Paula;


public class FibonacciShort 
{
    public short n;
    
    
    public FibonacciShort(short pN)
    {
        n = pN;
    }
    
    public short fibonacci (short n)
    {
        if (n==0)
        {
            return 0;
        }
        else if (n==1)
        {
            return 1;
        }
        else
        {
            short f1=(short)(n-1);
            short f2 = (short)(n-2);
            return (short) (fibonacci (f1) + fibonacci (f2));
        }
    }
    
    
    public short mostrarNum(short num)
    {
        short rta = fibonacci(num);
        return rta;
    }
    
    
    public static void main(String[] args) 
    {
        boolean parar = false;
        short numero = 1;
        short rta = 0;
        while(!parar)
        {
             FibonacciShort f1 = new FibonacciShort(numero);
             rta = f1.mostrarNum(numero);
             // como es negativo signirica que paso de sum mayor valor al rango de negativos "Se supone que es el over flow"
             if(rta<0)
             {
                 parar = true;
             }
             else
             {
                numero ++;
             }
        }
        System.out.println("Numero " + numero + " = calculado:" + rta );
    }
     
}
