package fiuba.algo3.modelo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fiuba.algo3.modelo.excepcion.ExcepcionEsquinaInvalida;
import fiuba.algo3.modelo.vehiculo.Moto;

public class JuegoTest {

	@Test
	public void testJuegoDeberiaCrearseConMapaJugadorYRadar() throws ExcepcionEsquinaInvalida {
		Mapa unMapa = new Mapa(7, 7);
		Moto unaMoto = new Moto(unMapa);
		Jugador unJugador = new Jugador(unaMoto);
		Radar unRadar = new Radar(unMapa);
		Juego unJuego = new Juego(unMapa, unJugador, unRadar);
		assertTrue(unJuego.devolverMapa() == unMapa);
		assertTrue(unJuego.devolverJugador() == unJugador);
		assertTrue(unJuego.devolverRadar() == unRadar);
	}
}
