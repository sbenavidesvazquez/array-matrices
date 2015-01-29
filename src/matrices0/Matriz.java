package matrices0;

public class Matriz {

    static String[] cidades = {"vigo", "pontevedra", "santiago", "orense"};
    static String[] dias = {"lu", "mer", "ve"};
    static float t;
    static float med;    
    static float[][] temperaturas = {{15, 12, 16}, {10, 11, 11}, {7, 8, 9}, {6, 5, 7}};
    static float[] contador = new float[cidades.length];

    public static void matriz() {
        for (int i = 0; i < dias.length; i++) {
            System.out.print("\t");
            System.out.print(dias[i]);
        }

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("");
            System.out.print(cidades[i]);
            for (int j = 0; j < temperaturas[i].length; j++) {
                t = temperaturas[i][j];
                System.out.print("\t" + t);
            }
        }
    }

    public static void teMedC() {
        for (int i = 0; i < cidades.length; i++) {

            for (int j = 0; j < temperaturas[i].length; j++) {
                contador[i] +=temperaturas[i][j];
                med = contador[i] / temperaturas[i].length;
            }
            System.out.println(cidades[i] + ": " + med);
        }
    }
    
    public static void teMeD(){
        for(int i=0;i<dias.length;i++){
            for(int j=0;j<temperaturas[i].length;j++){
                
            }
        }
    }
}
