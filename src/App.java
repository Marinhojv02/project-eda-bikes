import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws IOException{

        long tempoInicial;//variável para iniciar o tempo em ms
        long tempoFinal;// variável pra finalizar o tempo em ms

        System.out.println("execução iniciada");
        tempoInicial = System.currentTimeMillis();//inicia o tempo

        ListaEncadeada ListaStartStation = new ListaEncadeada();
        ListaEncadeada ListaDuration = new ListaEncadeada();
        ListaEncadeada ListaStartTime = new ListaEncadeada();

        String path = "/arquivos/LAMetroTrips.csv";

        String ArquivoDuration = "/arquivos/LAMetroTripsDuration";
        String ArquivoStartTime = "/arquivos/LAMetroTripsStartTime";
        String ArquivoStartStation = "/arquivos/LAMetroTripsStartStation";

        String line = "";


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();

            while((line = br.readLine()) != null){
                String[] linha = line.split(",");

                ListaStartStation.inserirStart_station(new Nó(Integer.parseInt(linha[0]), Integer.parseInt(linha[1]), linha[2], linha[3], Integer.parseInt(linha[4]), linha[5], Integer.parseInt(linha[6]), linha[7], linha[8], linha[9], linha[10], linha[11], linha[12], linha[13], linha[14], linha[15]));
                ListaDuration.inserirDuration(new Nó(Integer.parseInt(linha[0]), Integer.parseInt(linha[1]), linha[2], linha[3], Integer.parseInt(linha[4]), linha[5], Integer.parseInt(linha[6]), linha[7], linha[8], linha[9], linha[10], linha[11], linha[12], linha[13], linha[14], linha[15]));
                ListaStartTime.inserirStart_Time(new Nó(Integer.parseInt(linha[0]), Integer.parseInt(linha[1]), linha[2], linha[3], Integer.parseInt(linha[4]), linha[5], Integer.parseInt(linha[6]), linha[7], linha[8], linha[9], linha[10], linha[11], linha[12], linha[13], linha[14], linha[15]));

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ListaStartStation.escreveCSV(ArquivoStartStation);
        ListaDuration.escreveCSV(ArquivoDuration);
        ListaStartTime.escreveCSV(ArquivoStartTime);


        tempoFinal = System.currentTimeMillis()-tempoInicial;
        System.out.println("execução terminada em: "+ tempoFinal+" ms");
    }
}
