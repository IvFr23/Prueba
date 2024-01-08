public class OperadoresLogicos {
    public static void main(String[] args) {
        //Primera variable
        boolean valor1 = true;
        //Segunda variable
        boolean valor2 = true;
        //Tercera variable
        boolean valor3 = true;
        //Cuarta variable
        boolean valor4 = false;

        //Operadore logico: &&
        System.out.println("Primer resultado: " + (valor1 && valor2));//True
        System.out.println("Segundo resultado: " + (valor3 && valor4));//False

        //Operador logico: ||
        System.out.println("Tercer resultado: " + (valor1 || valor2));//True
        System.out.println("Cuarto resultado: " + (valor1 || valor4));//True

        //Operador logico: !
        System.out.println("Quinto resultado: " + (!valor1));//False
        System.out.println("Sexto resultado: " + (!valor4));//True
    }
}
