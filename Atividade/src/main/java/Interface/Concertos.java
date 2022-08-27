package Interface;

import Dominio.Concerto;

import java.util.List;

public interface Concertos {
    public void Concerto(Concerto concerto);
    public Concerto localizarPorCodigo(String codigo);

    List<Concerto> listarConcerto();

    public Concerto incluirConcerto(Concerto concerto);
}
