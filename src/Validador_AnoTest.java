import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Validador_AnoTest {

    Validador_Ano validador;


    public Validador_AnoTest(){
        validador = new Validador_Ano();
    }

    @Test
    public void testDataValida() {
        System.out.println("Data Valida");
        assertEquals("válida", validador.classificadorAno(1900));
        assertEquals("válida", validador.classificadorAno(1901));
        assertEquals("válida", validador.classificadorAno(2000));
        assertEquals("válida", validador.classificadorAno(2010));
        assertEquals("válida", validador.classificadorAno(2019));
    }
    @Test
    public void testDataInvalida() {
        System.out.println("Data Invalida");
        assertNotEquals("inválida", validador.classificadorAno(1900));
        assertNotEquals("inválida", validador.classificadorAno(1901));
        assertNotEquals("inválida", validador.classificadorAno(2000));
        assertNotEquals("inválida", validador.classificadorAno(2010));
        assertNotEquals("inválida", validador.classificadorAno(2019));
    }

    @Test
    public void testNotaValida() {
        System.out.println("Nota Valida");
        assertEquals("válida", validador.classificadorNota(0));
        assertEquals("válida", validador.classificadorNota(5));
        assertEquals("válida", validador.classificadorNota(8));
        assertEquals("válida", validador.classificadorNota(10));
    }
    @Test
    public void testNotaInvalida() {
        System.out.println("Nota Invalida");
        assertNotEquals("inválida", validador.classificadorNota(0));
        assertNotEquals("inválida", validador.classificadorNota(5));
        assertNotEquals("inválida", validador.classificadorNota(8));
        assertNotEquals("inválida", validador.classificadorNota(10));
    }

    @Test
    public void testIdadeValida() {
        System.out.println("Idade Valida");
        assertEquals(5, validador.classificadorIdade(50));
        assertEquals(5, validador.classificadorIdade(60));
        assertEquals(5, validador.classificadorIdade(70));
        assertEquals(3, validador.classificadorIdade(75));
    }

    @Test
    public void testIdadeInvalida() {
        System.out.println("Idade Invalida");
        assertNotEquals(10, validador.classificadorIdade(50));
        assertNotEquals(10, validador.classificadorIdade(60));
        assertNotEquals(3, validador.classificadorIdade(70));
        assertNotEquals(5, validador.classificadorIdade(75));
    }
}