package Cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Workspace.telaWorkspace;
import teladelogin.telaPrincipal;

public class Conexao {
    Usuario usuario = new Usuario();
    java.sql.ResultSet rs;
    private Connection conexao = null;
    private Statement comando = null;

        public void Conecta(){    
            try {     
                String serverName = "localhost";
                String mydatabase = "CONTROLE_ACESSO";
                String username = "root";
                String password = "dutr7chet3cn0l0g14";          
                String driverName = "com.mysql.cj.jdbc.Driver";
                Class.forName(driverName);           
                String url = "jdbc:mysql://" + serverName + "/" + mydatabase+"?useTimezone=true&serverTimezone=UTC";
                conexao = DriverManager.getConnection(url,username,password);
                comando = conexao.createStatement();
                System.out.println("Conexão com o banco de dados efetuada com sucesso!");
            }
            catch (ClassNotFoundException e){
                        System.out.println("Driver não encontrado!"+e);
            }
            catch (Exception e){
                   System.out.println(" SQL Exception "+ e.getMessage()+" Erro ao conectar o Banco de Dados");
            }        
        }
        //metodos
        public void InsereDados(String cadastoNome, String cadastroEmail, String cadastroSenha, String cadastroPermissao){
            usuario.setNome(cadastoNome);
            usuario.setEmail(cadastroEmail);
            usuario.setSenha(cadastroSenha);
            usuario.setPermissao(cadastroPermissao);
            Inserir();
        }
        public void Inserir(){
        if ((usuario.getNome()!="")&&(usuario.getEmail().length() >1)&&(usuario.getSenha().length()>1)&&(usuario.getPermissao()!="")){
            try {
                PreparedStatement PreparedStatement;
                String sql = "INSERT INTO USUARIOS(Nome, Email, Senha, Permissao)"+ "VALUES(?,?,?,?)"; 
                PreparedStatement = conexao.prepareStatement(sql);
                PreparedStatement.setString(1,usuario.getNome()); 
                PreparedStatement.setString(2,usuario.getEmail());
                PreparedStatement.setString(3,usuario.getSenha());       
                PreparedStatement.setString(4,usuario.getPermissao());
                int intRegistro = PreparedStatement.executeUpdate(); 
                if (intRegistro !=0){ 
                    JOptionPane.showMessageDialog(null,"Registro adicionado com sucesso !", "Menagem ao Usuario",JOptionPane.INFORMATION_MESSAGE); 
                 } 
                else{ 
                    JOptionPane.showMessageDialog(null,"Registro nao adicionado !", "Mensagem ao Usuário",JOptionPane.INFORMATION_MESSAGE); 
                } 
            }
            catch (Exception Excecao) {
                JOptionPane.showMessageDialog(null,"SQLException: " + Excecao.getMessage(),"Erro: Selecao de registro", JOptionPane.INFORMATION_MESSAGE); 
            }
        } else {
            JOptionPane.showMessageDialog(null,"Falta Preencher Campo!\n "+"Aluno: "+usuario.getNome()+"\n"+"RGM: "+ usuario.getEmail()+"\n"+"Curso: "+usuario.getPermissao()); 
        }
    }
        
    public void InserirDados(String email, String senha){
        usuario.setEmail(email);
        usuario.setSenha(senha);
        Logar();
    }
    
    public void Logar(){
    PreparedStatement pst=null;

        String sql = "SELECT *FROM USUARIOS WHERE Email=? AND Senha=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getEmail());
                pst.setString(2, usuario.getSenha());
                rs = pst.executeQuery();
                if(rs.next()){
                    telaWorkspace telaworkspace = new telaWorkspace();
                    telaworkspace.setVisible(true);
                    telaworkspace.jLabeEmail.setText(usuario.getEmail());
                    dispose();
                } else{
                    JOptionPane.showMessageDialog(null, "Você não tem permissão ou dados para login inválidos!");
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }      
    }
    
    public void consultarCadastrar(String email, String senha ){
        usuario.setEmail(email);
        usuario.setSenha(senha);
        LogarCadastrar();
    }
    public void LogarCadastrar(){
    PreparedStatement pst=null;

        String sql = "SELECT*FROM USUARIOS WHERE Email=? AND Senha=? AND Permissao='Administrador'";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getEmail());
                pst.setString(2, usuario.getSenha());
                rs = pst.executeQuery();
                if(rs.next()){
                    Cadastro cadastro = new Cadastro();
                    cadastro.setVisible(true);
                    dispose();
                } else{
                    JOptionPane.showMessageDialog(null, "Você não tem permissão ou dados para login inválidos!");
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }      
    }
    
     public void consultarCadastrar2(String email){
        usuario.setEmail(email);
        LogarCadastrar2();
    }
    public void LogarCadastrar2(){
    PreparedStatement pst=null;

        String sql = "SELECT*FROM USUARIOS WHERE Email=? AND Permissao='Administrador'";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getEmail());
                rs = pst.executeQuery();
                if(rs.next()){
                    Cadastro cadastro = new Cadastro();
                    cadastro.setVisible(true);
                    dispose();
                } else{
                    JOptionPane.showMessageDialog(null, "Você não tem permissão!");
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }      
    }

    private void dispose() {
        JOptionPane.showMessageDialog(null, "Bem Vindo!");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
