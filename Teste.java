public class Teste{


    public static void main(String[] args) {
        Aluno aluno=new Aluno();

        aluno.setCurso("Big Data no Agronegócio");
        aluno.setJava("Java I Orientação à Objetos");
        aluno.setP1(9);
        aluno.setP2(8);
        if(aluno.aprovado()){
            System.out.println("Passou");
            System.out.println("Nota da P1: "+ aluno.getP1());
            System.out.println("Nota da P2: "+ aluno.getP2());
        }
        else{
            System.out.println("Tente novamente");
            System.out.println("Nota da P1: "+ aluno.getP1());
            System.out.println("Nota da P2: "+ aluno.getP2());
        }


    }
}