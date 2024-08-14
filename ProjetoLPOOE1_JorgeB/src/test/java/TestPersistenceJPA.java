
import com.lpoo2401.projetolpooe1_jorgeb.dao.PersistenciaJPA;
import com.lpoo2401.projetolpooe1_jorgeb.model.Caminhao;
import com.lpoo2401.projetolpooe1_jorgeb.model.Motoristas;
import com.lpoo2401.projetolpooe1_jorgeb.model.Obra;
import org.junit.Test;

/**
 *
 * @author JRGB
 */
public class TestPersistenceJPA {

    @Test
    public void testConexaoGeracaoTabelas() {

        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA");
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");

        } else {
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
    
    //@Test 
    public void testPersitenciaMotorista() throws Exception{
        
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JPA");
            
            Motoristas m = new Motoristas();
            
            m.setCPF(499166297);
            m.setNome("Jorge");
            m.setNumero_celular("054991662971");            
            
            persistencia.persist(m);
            System.out.println("Inseriu o motorista de CPF = "+m.getCPF());
            
            Integer cpf = m.getCPF();
            Motoristas mt = (Motoristas) persistencia.find(Motoristas.class, cpf);
            if (mt != null) {
                System.out.println("Encontrou o motorista de CPF = " + mt.getCPF());
            } else {
                System.out.println("Nao encontrou o motorista de CPF = " + cpf);
            }
            
            persistencia.fecharConexao();
            
            System.out.println("fechou a conexao com o BD via JPA");
            
        }else{
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
    
    //@Test 
    public void testPersitenciaObra() throws Exception{
        
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JPA");
            
            Obra o = new Obra();
            
            o.setLocal("Passo Fundo - RS");           
            
            persistencia.persist(o);
            System.out.println("Inseriu a obra de ID = "+o.getId());
            
            Obra obr = (Obra) persistencia.find(Obra.class, 1);
            if (obr != null) {
                System.out.println("Encontrou a obra de ID = " + obr.getId());
            } else {
                System.out.println("Nao encontrou a obra de ID = 1");
            }
            
            persistencia.fecharConexao();
            
            System.out.println("fechou a conexao com o BD via JPA");
            
        }else{
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
    
    //@Test 
    public void testPersitenciaCaminhao() throws Exception{
        
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JPA");
            
            Caminhao c = new Caminhao();
            
            c.setPlaca("XYZ4991");
            c.setKm(120000);
            
            persistencia.persist(c);
            System.out.println("Inseriu o caminhao de placa = "+c.getPlaca());
            
            String placa = c.getPlaca();
            Caminhao cm = (Caminhao) persistencia.find(Caminhao.class, placa);
            if (cm != null) {
                System.out.println("Encontrou o caminhao de placa = " + cm.getPlaca());
            } else {
                System.out.println("Nao encontrou o caminhao de placa = " + placa);
            }
            
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");
            
        }else{
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
    
    @Test 
    public void testPersitenciaTodos() throws Exception{
        
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JPA");
            
            //Persistencia MOTORISTA
            Motoristas m = new Motoristas();
            
            m.setCPF(499166297);
            m.setNome("Jorge");
            m.setNumero_celular("054991662971");            
            
            persistencia.persist(m);
            System.out.println("Inseriu o motorista de CPF = "+m.getCPF());
            
            Integer cpf = m.getCPF();
            Motoristas mt = (Motoristas) persistencia.find(Motoristas.class, cpf);
            if (mt != null) {
                System.out.println("Encontrou o motorista de CPF = " + mt.getCPF());
            } else {
                System.out.println("Nao encontrou o motorista de CPF = " + cpf);
            }
            
            //Persistencia OBRA
            Obra o = new Obra();
            
            o.setLocal("Passo Fundo - RS");           
            
            persistencia.persist(o);
            System.out.println("Inseriu a obra de ID = "+o.getId());
            
            Obra obr = (Obra) persistencia.find(Obra.class, 1);
            if (obr != null) {
                System.out.println("Encontrou a obra de ID = " + obr.getId());
            } else {
                System.out.println("Nao encontrou a obra de ID = 1");
            }
            
            //Persistencia CAMINHAO
            Caminhao c = new Caminhao();
            
            c.setPlaca("XYZ4991");
            c.setKm(120000);
            
            persistencia.persist(c);
            System.out.println("Inseriu o caminhao de placa = "+c.getPlaca());
            
            String placa = c.getPlaca();
            Caminhao cm = (Caminhao) persistencia.find(Caminhao.class, placa);
            if (cm != null) {
                System.out.println("Encontrou o caminhao de placa = " + cm.getPlaca());
            } else {
                System.out.println("Nao encontrou o caminhao de placa = " + placa);
            }
            
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");
            
        }else{
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }
    
    @Test 
    public void testPersitenciaComAssociacoes() throws Exception{

    PersistenciaJPA persistencia = new PersistenciaJPA();
    if (persistencia.conexaoAberta()) {
        System.out.println("abriu a conexao com o BD via JPA");

        //Procura OBRA existente
        Obra o = (Obra) persistencia.find(Obra.class, 1); 
        if (o == null) {
            System.out.println("Nao encontrou a obra de ID = 1");
            return;
        } else {
            System.out.println("Encontrou a obra de ID = " + o.getId());
        }

        //Procura CAMINHAO existente
        Caminhao c = (Caminhao) persistencia.find(Caminhao.class, "XYZ4991");
        if (c == null) {
            System.out.println("Nao encontrou o caminhao de placa = XYZ4991");
            return;
        } else {
            System.out.println("Encontrou o caminhao de placa = " + c.getPlaca());
        }

        //Procura MOTORISTA existente
        Motoristas m1 = (Motoristas) persistencia.find(Motoristas.class, 499166297);
        if (m1 == null) {
            System.out.println("Nao encontrou o motorista de CPF = 499166297");
            return;
        } else {
            System.out.println("Associou Caminhao com o motorista de CPF = " + m1.getCPF());
        }

        //Associa CAMINHAO com OBRA
        c.setObra(o);

        //Associa MOTORISTA com CAMINHAO
        m1.setCaminhao(c);

        
        persistencia.persist(c);
        persistencia.persist(m1);

        Caminhao cm = (Caminhao) persistencia.find(Caminhao.class, c.getPlaca());
        if (cm != null) {
            System.out.println("Encontrou o caminhao de placa = " + cm.getPlaca());
            if (cm.getObra() != null) {
                System.out.println("Caminhao está associado à obra de ID = " + cm.getObra().getId());
            } else {
                System.out.println("Caminhao não está associado a nenhuma obra");
            }
        } else {
            System.out.println("Nao encontrou o caminhao de placa = " + c.getPlaca());
        }

        Motoristas mt1 = (Motoristas) persistencia.find(Motoristas.class, m1.getCPF());
        if (mt1 != null) {
            System.out.println("Encontrou o motorista de CPF = " + mt1.getCPF());
            if (mt1.getCaminhao() != null) {
                System.out.println("Motorista está associado ao caminhao de placa = " + mt1.getCaminhao().getPlaca());
            } else {
                System.out.println("Motorista não está associado a nenhum caminhao");
            }
        } else {
            System.out.println("Nao encontrou o motorista de CPF = " + m1.getCPF());
        }

        persistencia.fecharConexao();
        System.out.println("fechou a conexao com o BD via JPA");

    } else {
        System.out.println("Nao abriu a conexao com o BD via JPA");
    }
    }
    
    @Test 
    public void testMostraPersitencia() throws Exception{

    PersistenciaJPA persistencia = new PersistenciaJPA();
    if (persistencia.conexaoAberta()) {
        System.out.println("abriu a conexao com o BD via JPA");

        //Procura OBRA existente
        Obra o = (Obra) persistencia.find(Obra.class, 1); 
        if (o == null) {
            System.out.println("Nao encontrou a obra de ID = 1");
            //return;
        } else {
            System.out.println("\n Encontrou a obra de ID: " + o.getId());
            System.out.println("Com Local em " + o.getLocal());
            System.out.println("Com Caminhoes: ");
            for (Caminhao caminhao : o.getCaminhao()) {
                System.out.println("  - Caminhao Placa: " + caminhao.getPlaca() + ", Quilometragem: " + caminhao.getKm());
            }
        }

        //Procura CAMINHAO existente
        Caminhao c = (Caminhao) persistencia.find(Caminhao.class, "XYZ4991");
        if (c == null) {
            System.out.println("Nao encontrou o caminhao de placa = XYZ4991");
            //return;
        } else {
            System.out.println("\n Encontrou o caminhao de placa: " + c.getPlaca());
            System.out.println("Quilometragem: " + c.getKm());
            for (Motoristas motorista : c.getMotoristas()) {
                System.out.println("  - Motorista CPF: " + motorista.getCPF() + ", Nome: " + motorista.getNome());
            }
            if (c.getObra() != null) {
                System.out.println("No Local: " + c.getObra().getLocal());
            } else {
                System.out.println("No Local: Não associado a nenhuma obra");
            }
        }

        //Procura MOTORISTA existente
        Motoristas m1 = (Motoristas) persistencia.find(Motoristas.class, 499166297);
        if (m1 == null) {
            System.out.println("Nao encontrou o motorista de CPF = 499166297");
            //return;
        } else {
            System.out.println("\n Encontrou o motorista de CPF: " + m1.getCPF());
            System.out.println("Nome: " + m1.getNome());
            System.out.println("Telefone: " + m1.getNumero_celular());
            if (m1.getCaminhao() != null) {
                System.out.println("Caminhao: Placa " + m1.getCaminhao().getPlaca());
            } else {
                System.out.println("Caminhao: Não associado a nenhum caminhao");
            }

        }

        persistencia.fecharConexao();
        System.out.println("fechou a conexao com o BD via JPA");

    } else {
        System.out.println("Nao abriu a conexao com o BD via JPA");
    }
    }
}
