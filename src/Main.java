import service.HttpRequestService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite seu CEP:");
        Scanner sc = new Scanner(System.in);
        var cep = sc.nextLine();

        try {
            Endereco enderecoConsulta = new ConsultaCep().consultarCEP(cep);
//            System.out.println(enderecoConsulta);
            FileGenenator gerador = new FileGenenator();
            gerador.salvaJson(enderecoConsulta);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}
