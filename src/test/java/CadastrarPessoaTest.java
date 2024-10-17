import org.example.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private Pessoa pessoa;

    @Test
    public void validarPessoa() {
        new Pessoa("Bruno", "123456789", LocalDate.now());
        Mockito.when(pessoa.getNome()).thenReturn("Bruno");
        Mockito.when(pessoa.getDocumento()).thenReturn("123456789");
        Mockito.when(pessoa.getNascimento()).thenReturn(LocalDate.now());

        assertEquals("Bruno", pessoa.getNome());
        assertEquals("123456789", pessoa.getDocumento());
        assertEquals(LocalDate.now(), pessoa.getNascimento());
    }
}
