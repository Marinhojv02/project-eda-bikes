import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws IOException{

        long tempoInicialTotal;//variável para iniciar o tempo em ms
        long tempoInicial;//variável para iniciar o tempo em ms

        System.out.println("execução iniciada");
        tempoInicialTotal = System.currentTimeMillis();//inicia o tempo
        tempoInicial = System.currentTimeMillis();//inicia o tempo

        //transformacoes
        Transformacao1 t1 = new Transformacao1();
        Transformacao2 t2 = new Transformacao2();
        Transformacao3 t3 = new Transformacao3();
        
        t1.Transformacao();
        System.out.println("Transformacao 1 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");
        tempoInicial = System.currentTimeMillis();//inicia o tempo
        t2.filtraArquivo();
        System.out.println("Transformacao 2 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");
        tempoInicial = System.currentTimeMillis();//inicia o tempo
        t3.filtraArquivo();
        System.out.println("Transformacao 3 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");


        System.out.println("iniciando ordenacoes");
        tempoInicial = System.currentTimeMillis();//inicia o tempo
        Ordenacao1 ordenaStation = new Ordenacao1();
        Ordenacao2 ordenaDuration = new Ordenacao2();
        Ordenacao3 ordenaTime = new Ordenacao3();

        ordenaStation.OrdenaStartStation();
        System.out.println("Ordenacao 1 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");
        ordenaDuration.OrdenaDuration();
        System.out.println("Ordenacao 2 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");
        ordenaTime.OrdenaStartTime();
        System.out.println("Ordenacao 3 terminada em: "+ (System.currentTimeMillis()-tempoInicial)+" ms");

        System.out.println("execução terminada em: "+ (System.currentTimeMillis() - tempoInicialTotal) +" ms");
    }
}
