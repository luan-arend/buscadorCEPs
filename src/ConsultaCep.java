import com.google.gson.Gson;
import service.HttpRequestService;

public class ConsultaCep {
    public Endereco consultarCEP(String cep) {

        String url = "https://viacep.com.br/ws/" + cep.replace("-", "") + "/json/";

        try {
            String retornoBody = new HttpRequestService(url).getResponseBody();
            return new Gson().fromJson(retornoBody, Endereco.class);
        } catch (RuntimeException e) {
            System.out.println("Não foi possível obter o CEP!");
            return null;
        }
    }
}
