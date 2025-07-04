import static org.mockito.Mockito.*;

import org.example.Api;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        Api mockApi = mock(Api.class);

        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
