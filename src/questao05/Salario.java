package questao05;

public class Salario {
        public double salario;
        public final double salarioMinimo = 1320;

        public Salario (double salario) {
            this.salario = salario;
        }
        public void quantSalarios(){
            System.out.println("A quantidade de salarios minimos é: "+(salario/salarioMinimo));
        }
}

