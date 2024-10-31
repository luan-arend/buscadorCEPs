import service.HttpRequestService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var cep = sc.nextLine();
        var busca = "https://viacep.com.br/ws/" + cep.replace("-","") + "/json/";
        var endereco = new HttpRequestService(busca).getResponseBody();

        System.out.println(endereco);
    }
}
