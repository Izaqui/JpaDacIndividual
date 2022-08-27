package Dao;

import Dominio.Concerto;
import Interface.Concertos;

import java.sql.Connection;
import java.util.List;

public class ConcertoDao implements Concertos {

    private Connection connection;
    @Override
    public void Concerto(Concerto concerto) {

    }

    @Override
    public Concerto localizarPorCodigo(String codigo) {

        return null;
    }
    @Override
    public List<Concerto> listarConcerto() {
        return null;
    }
    @Override
    public Concerto incluirConcerto(Concerto concerto) {
        return null;
    }
}
