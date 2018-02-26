package Paula;


public class FibonacciFloat
{
    
    public static void main(String[] args) 
    {
        boolean parar = false;
        int it = 1;
        float fi = 0;
        float a = 0;
        float s = 1;
        System.out.println("Paula.FibonacciFloat.main()");
        while(!parar)
        {
            //0112358
            fi = a + s;
           
             // como es negativo signirica que paso de sum mayor valor al rango de negativos "Se supone que es el over flow"
             if(fi>Float.POSITIVE_INFINITY  || fi<Float.POSITIVE_INFINITY)
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
