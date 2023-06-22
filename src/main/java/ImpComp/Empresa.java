/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpComp;
import java.util.ArrayList;

public class Empresa {
    private Funcionario funcionario;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
        public Empresa() {
            
        }
        public void adicionaFuncionario(Funcionario f) {
            this.funcionarios.add(f);
        }
        
        public ArrayList<Funcionario> listarFuncionario() {
            this.funcionarios = funcionarios;
            return funcionarios;
        }
}
        
