package Interface;

import Dominio.Concerto;

public interface Concertos {
    public void Concerto(Concerto concerto);
    public Concerto localizarPorCodigo(String codigo);
    public Concerto incluirConcerto(Concerto concerto);
}
