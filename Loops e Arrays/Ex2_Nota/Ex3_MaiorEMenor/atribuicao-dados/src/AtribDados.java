import com.projeto.atribuicaoreferencia.MeuObj;

public class AtribDados {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int NumA = 1;
        int NumB = NumA;

        System.out.println("Número A:" + NumA + " Número B:" + NumB);

        NumA = 2;

        System.out.println("Número A:" + NumA + " Número B:" + NumB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA: " + objA + " objB:" + objB);

        objA.setNum(2);

        System.out.println("objA: " + objA + " objB:" + objB);
    }
}
