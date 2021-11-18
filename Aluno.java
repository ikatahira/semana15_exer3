public class Aluno{

private String nome;
private String matricula;
private String curso;
private String java;
private String matematica;
private String iot;
private double  P1;
private double P2;

public void setNome(String nome){
    this.nome=nome;
}
public String getNome(){
    return nome;
}
public String getMatricula() {
    return matricula;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public String getCurso() {
    return curso;
}
public void setCurso(String curso) {
    this.curso = curso;
}
public String getJava() {
    return java;
}
public void setJava(String java) {
    this.java = java;
}
public String getMatematica() {
    return matematica;
}
public void setMatematica(String matematica) {
    this.matematica = matematica;
}
public String getIot() {
    return iot;
}
public void setIot(String iot) {
    this.iot = iot;
}
public double getP1() {
    return P1;
}
public void setP1(double p1) {
    P1 = p1;
}
public double getP2() {
    return P2;
}
public void setP2(double p2) {
    P2 = p2;
}

public boolean aprovado(){
    double notafinal=(P1+P2)/(2.0);
    if(notafinal>=7)
        return true;
    else
        return false;
}

}