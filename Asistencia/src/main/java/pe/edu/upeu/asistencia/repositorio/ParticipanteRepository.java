package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.ArrayList;
import java.util.List;

public abstract class ParticipanteRepository {
    protected List<Participante> participantes = new ArrayList<>();

    public List<Participante> findAll(){
        participantes.add(new Participante(
                new SimpleStringProperty("12312342"),
                new SimpleStringProperty("Pol"),
                new SimpleStringProperty("Cari"),
                Carrera.SISTEMAS,
                TipoParticipante.ORGANIZADOR,
                new SimpleBooleanProperty(true)
        ));
        return participantes;
    }
}
