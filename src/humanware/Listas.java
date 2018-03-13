package humanware;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author d-ani
 */
public class Listas
{
    private Listas(){}
    public static ObservableList<String> nombreEmpresas = FXCollections.observableArrayList();
    public static ObservableList<String> titulos = FXCollections.observableArrayList();
    public static ObservableList<Integer> niveles = FXCollections.observableArrayList();
    public static ObservableList<Empresa> empresas = FXCollections.observableArrayList();
    public static ObservableList<Vacante> vacantes = FXCollections.observableArrayList();
    public static ObservableList<Candidato> candidatos = FXCollections.observableArrayList();
}
