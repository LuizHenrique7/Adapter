import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TomadaTest {

    @Test
    public void deveRetornarTomadaDeDoisPinosConectada() {
        Tomada tomada = new Tomada();
        TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaDeDoisPinos();
        assertEquals(0, tomada.conectar(tomadaDeDoisPinos));
    }

    @Test
    public void deveRetornarTomadaDeTresPinosConectada() {
        Tomada tomada = new Tomada();
        TomadaMultiPadrao tomadaMultiPadrao = new TomadaMultiPadrao();
        TomadaAdapter tomadaAdapter = new TomadaAdapter(tomadaMultiPadrao);
        assertEquals(0, tomada.conectar(tomadaAdapter));
    }

}