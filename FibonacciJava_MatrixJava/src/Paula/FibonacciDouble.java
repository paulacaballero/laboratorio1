package Paula;


public class FibonacciDouble
{
    public static void main(String[] args) 
    {
        boolean parar = false;
        int it = 1;
        double fi = 0;
        double a = 0;
        double s = 1;
        System.out.println("Paula.FibonacciDouble.main()");
        while(!parar)
        {
            fi = a + s;
           
             // como es negativo signirica que paso de sum mayor valor al rango de negativos "Se supone que es el over flow"
             if(fi>Double.POSITIVE_INFINITY  || fi<Double.POSITIVE_INFINITY)
             {
                a=s;
                s=fi;

                System.out.print( fi);
                System.out.println();
                it ++;
             }
             else
             {
                 parar = true;
             }
        }
        System.out.println("Numero " + it + " = calculado:" + fi + " " + "ANT:" + a + ", SIG:" + s );
    }
     
}
