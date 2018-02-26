package Paula;


public class FibonacciInt 
{
    public int n;
    
    public FibonacciInt(int pN)
    {
        n = pN;
    }
    
    public int fibonacci (int n)
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
            return fibonacci (n-1) + fibonacci (n-2);
        }
    }
    
    
    public int mostrarNum(int num)
    {
        int rta = fibonacci(num);
        return rta;
    }
    
    
    public static void main(String[] args) 
    {
        boolean parar = false;
        int numero = 1;
        int rta = 0;
        while(!parar)
        {
             FibonacciInt f1 = new FibonacciInt(numero);
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
