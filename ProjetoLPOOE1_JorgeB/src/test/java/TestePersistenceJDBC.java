
import com.lpoo2401.projetolpooe1_jorgeb.dao.PersistenciaJDBC;
import org.junit.Test;

/**
 *
 * @author JRGB
 */

public class TestePersistenceJDBC {
    @Test
    public void testPersistenciaConexao() throws Exception {

        PersistenciaJDBC jdbc = new PersistenciaJDBC();
        if (jdbc.conexaoAberta()) {
            System.out.println("conectou no BD via JDBC ...");
            jdbc.fecharConexao();
        } else {
            System.out.println("nao conectou no BD ...");
        }
    }
}
