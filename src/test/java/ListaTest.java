import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTest {

    @Mock
    private List<String> letras;

    @Test
    public void addItemInList() {
        Mockito.when(letras.get(0)).thenReturn("Hello");

        Assertions.assertEquals("Hello", letras.get(0));
    }
}
