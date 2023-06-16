public class Exercicio {

    static double exemplo(int pos){
        if(pos==1){
            return 0;
        } else if(pos==2){
            return 1;
        }else{
            return (exemplo(pos-1)+exemplo(pos-2));
        }
    }

    /*static double exemplo(double num){
        if (num == 1) {
            return 1;
        } else {
            return (num * exemplo(num - 1));
        }
    }*/

    public static void main(String[] args) {

        System.out.println(exemplo(5));

        /*int linhas=5, colunas=5;
        int numeros[][]=new int[linhas][colunas];

        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if(i==0){
                    numeros[i][j]=j+1;
                }else{
                    numeros[i][j]=numeros[i-1][j]+1;
                }
            }
        }
        for (int i=0;i<colunas;i++){
            System.out.println(numeros[2][i]);
        }
    }

   /* static double soma(double a, double b){
        return (a+b);
    }

    static double sub(double a, double b){
        return (a-b);
    }

    static double mult(double a, double b){
        return (a*b);
    }
    static double div(double a, double b){
        return (a/b);
    }

    public static void main(String[] args){
        double a=10, b=5, c=15;
        c=mult(a,b);
        b=div(c,a);
        a=soma(a,b);
        System.out.println(b);
    }*/
    }
}


