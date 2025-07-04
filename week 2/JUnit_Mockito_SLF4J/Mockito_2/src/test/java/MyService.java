import org.example.Api;

public class MyService {
    private Api api;

    public MyService(Api api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();  // should be called to verify interaction
    }
}
