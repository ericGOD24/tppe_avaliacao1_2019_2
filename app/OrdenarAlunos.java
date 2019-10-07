package app;

public class OrdenarAlunos {
 
 private final CadastroAlunos registro;
 private Aluno resposta[];
 private String matricula1;
 private String matricula2;
 private Aluno t;
 private int i;
 private int j;
 
 public OrdenarAlunos(CadastroAlunos registro) {
  this.registro = registro;
 }
 
 public Aluno[] cadastrar() {
  resposta = new Aluno[registro.alunos.length];
  for (i=0; i < registro.alunos.length; i++) {
   resposta[i] = registro.alunos[i]; 
  }
  
  for (i = 0; i < resposta.length - 1; i++) {
	  
   for (j = i; j < resposta.length; j++) {
	   matricula1 = this.normalizarMatricula(resposta, i);
	   matricula2 = this.normalizarMatricula(resposta, j);
	   if (matricula1.compareTo(matricula2) > 0) {
		   t = resposta[i]; 
		   resposta[i] = resposta[j];
		   resposta[j] = t;
    }
   }
   
  }
  
  return resposta;
 }
 
 private String normalizarMatricula(Aluno[] resposta, int i) {
  return resposta[i].getPrefixoMatricula() + "/" + resposta[i].getSufixoMatricula();
 }
}