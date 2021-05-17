package atividadesfurbifelse;

public class atividade17 {

public static void main(String[] args) {
        Main minha = new Main();
        double salario = 2500.00;
        int pessoa = 3;
        System.out.println(minha.descontoTotal(salario, pessoa));
    }
    
    public double descontoTotal(double rendaAnual, int numeroDependentes){
        if(numeroDependentes <= 0){
            if(rendaAnual > 2000 && rendaAnual <= 5000){
                rendaAnual -= (rendaAnual * 5) / 100;
                return rendaAnual;
            } else if(rendaAnual >= 5000 && rendaAnual <= 10000){
                rendaAnual -= (rendaAnual * 10) / 100;
                return rendaAnual;
            } else if(rendaAnual >= 10000){
                rendaAnual -= (rendaAnual * 15) / 100;
                return rendaAnual;
            }
        } else {
            if(rendaAnual >= 2000 && rendaAnual <= 5000){
                if(descontoDependente(numeroDependentes) > 5){
                    return rendaAnual;
                } else {
                    rendaAnual -= (rendaAnual * (5 - descontoDependente(numeroDependentes))) / 100;
                    return rendaAnual;
                }
            } else if(rendaAnual >= 5000 && rendaAnual <= 10000){
                if(descontoDependente(numeroDependentes) > 10){
                    return rendaAnual;
                } else {
                    rendaAnual -= (rendaAnual * (10 - descontoDependente(numeroDependentes))) / 100;
                    return rendaAnual;
                }
            } else if(rendaAnual >= 10000){
                if(descontoDependente(numeroDependentes) > 15){
                    return rendaAnual;
                } else {
                    rendaAnual -= (rendaAnual * (15 - descontoDependente(numeroDependentes))) / 100;
                    return rendaAnual;
                }
            }
        }
        return rendaAnual;
    }
    
    public int descontoDependente(int numeroDependentes){
        int descontoPessoa = numeroDependentes * 2;
        return descontoPessoa;
    }
