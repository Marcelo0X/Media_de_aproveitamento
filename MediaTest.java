import java.util.Scanner;

public class MediaTest{

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
	calcularMedia();
    }
    public static void calcularMedia(){
	double media = 0, exer = 0;
	double[] notas = new double[3];
	try{
	    for(int y = 0; y < notas.length; y++){
		System.out.print((y+1)+"° nota ");
		notas[y] = in.nextDouble();
	 
	    }
	    System.out.print("Media dos exercicios ");
	    exer = in.nextDouble();
	    Media conceito = new Media(notas[0], notas[1], notas[2], exer);
	    System.out.printf("Conceito %s%n", conceito.mediaAproveitamento(media));
	}catch(Exception s){
	    System.out.println(s);
	    in.nextLine();
	}
    }

}
