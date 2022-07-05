package exercicios;

public class ExercicioUm{
    public static void calculoValorCarro(float valor){
        float precoFinal = 0;
        //nt quantidadParcelas;
        float valorParcela;
        String resultadoValorParcela, resultadoFinal;
        int [] parcelas = {1,6,12,18,24,30};
        System.out.println("Valor Final / Quantidade de Parcelas / Valor da Parcela");
        for(int i = 0; i < parcelas.length; i++){
            if (parcelas[i] == 1) {
                precoFinal = valor * 0.8f;
            }else if (parcelas[i] == 6){
                precoFinal = valor * 1.03f;
            }else if (parcelas[i] == 12){
                precoFinal = valor * 1.06f;
            }else if (parcelas[i] == 18){
                precoFinal = valor * 1.09f;
            }else if (parcelas[i] == 24){
                precoFinal = valor * 1.12f;
            }else if (parcelas[i] == 30){
                precoFinal = valor * 1.15f;
            }
            valorParcela = precoFinal/parcelas[i];
            resultadoValorParcela = String.format("%.2f",valorParcela);
            resultadoFinal = String.format("%.2f",valorParcela);
            System.out.println(resultadoFinal+" / "+parcelas[i]+" / "+resultadoValorParcela);
        }
    }
}
