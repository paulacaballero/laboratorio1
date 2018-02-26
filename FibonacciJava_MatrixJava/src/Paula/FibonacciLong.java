package Paula;


public class FibonacciLong 
{
    
    public static void main(String[] args) 
    {
        boolean parar = false;
        int it = 1;
        long fi = 0;
        long a = 0;
        long s = 1;
        System.out.println("Paula.FibonacciLong.main()");
        while(!parar)
        {
            //0112358
            fi = a + s;
           
             // como es negativo signirica que paso de sum mayor valor al rango de negativos "Se supone que es el over flow"
             if(fi<0)
             {
                 parar = true;
             }
             else
             {
                a=s;
                s=fi;

                System.out.println(fi);
                it ++;
             }
        }
        System.out.println("Numero " + it + " = calculado:" + fi + " " + "ANT:" + a + ", SIG:" + s );
    }
     
}
