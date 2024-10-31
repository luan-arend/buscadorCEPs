import service.HttpRequestService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite seu CEP:");
        Scanner sc = new Scanner(System.in);
        var cep = sc.nextLine();

        try {
            Endereco enderecoConsulta = new ConsultaCep().consultarCEP(cep);
            System.out.println(enderecoConsulta);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}
