package questao06;

public class AntesDepois {
    int num;

    public AntesDepois(int num){
        this.num = num;
    }

    public void imprimeAnteseDepois(){
        int antes = this.num - 1;
        int depois = this.num + 1;

        System.out.println("O numero informado é: " + this.num + ". " + "O numero antecessor é: "
                + antes + ". " + "O sucessor é: " + depois + ".");
    }
}


