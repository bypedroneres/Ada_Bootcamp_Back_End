package aula07;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {

    List<Usuario> listaUsuarios = new ArrayList<>();
    {
        listaUsuarios = List.of(new Usuario("bypedroneres", "senha"),
                                 new Usuario("brendafazeredo", "senha2"));
    }

    public Usuario getByNome(String nome){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getLogin().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }


}
    

