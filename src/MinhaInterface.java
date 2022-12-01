public class MinhaInterface extends Filmes {


    private int filmeEscolhido;
    private int sessaoEscolhida;




    public int menu() {
        System.out.println("===============Em Cartaz================");
        for (int i = 0; i < filmes.length; i++) {
            for (int l = 0; l < filmes.length; l++) {
                if (l < 1) {
                    System.out.println((i + 1) + " " + filmes[i][0].substring(5));
                }
            }
        }
        System.out.println("-----------------------------------------");
        return 0;
    }

    public int getMenu() {
        return filmeEscolhido;
    }

    public void setMenu(int menu) {
        this.filmeEscolhido = menu;
    }


    public void sessao() {
        System.out.println("\nSessões disponíveis: ");
        for (int i = 1; i < sessoes.length; i++) {
            System.out.println(sessoes[i]);
        }
    }

    public int getSessaoEscolhida() {
        return sessaoEscolhida;
    }

    public void setSessaoEscolhida(int sessaoEscolhida) {
        this.sessaoEscolhida = sessaoEscolhida;
    }
    public void comprovante(){
        System.out.println("Filmes escolhido:"+this.filmes[this.filmeEscolhido - 1][0].substring(5));
        System.out.println("Sessão escolhida: "+this.sessoes[this.sessaoEscolhida]);
        System.out.println("Valor total a ser pago: R$ "+String.format("%.2f",valorTotal));
    }

    public void bilheteria(){
        int compra = 0;
        do {
            System.out.println("\nEscolha o tipos de ingresso:\n1 - Inteira - R$ 32,00\n2 - Meia - R$ 16,00");
            int escolha = input.nextInt();
            String entireHalf;
            if (escolha == 1) {
                entireHalf = "Inteira";
            } else {
                entireHalf = "Meia";
            }

            System.out.print("Informe a quantidade de ingressos: ");
            qtdIngressos = input.nextInt();

            if (entireHalf.equals("Inteira")) {
                valorTotal += (qtdIngressos * valorIngresso[0]);
            } else {
                valorTotal += (qtdIngressos * valorIngresso[1]);
            }


            System.out.println("Gostaria de continuar comprando? Digite [1] para Sim ou [2] para Não");
            compra = input.nextInt();

            if (compra == 1){
                
            }else{
                break;
            }
        } while ( compra != 5);
    }
    public void resumoFilme(){
        System.out.println("\nInformações sobre o(s) filme(s) escolhido(s):");
        for (int i = 0; i < filmes.length; i++) {
            for (int j = 0; j < filmes.length; j++) {
                if (i < 1)
                    System.out.println(filmes[this.filmeEscolhido - 1][j]);
            }
        }
    }
}

    