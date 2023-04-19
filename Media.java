public class Media{

    private double nota1;
    private double nota2;
    private double nota3;
    private double exercicios;

    public Media(double nota1, double nota2, double nota3, double exercicios){
	setNota1(nota1);
	setNota2(nota2);
	setNota3(nota3);
	setExercicios(exercicios);
    }
    public void setNota1(double nota1){
	this.nota1 = nota1;
    }
    public double getNota1(){
	return nota1;
    }
    public void setNota2(double nota2){
	this.nota2 = nota2;
    }
    public double getNota2(){
	return nota2;
    }
    public void setNota3(double nota3){
	this.nota3 = nota3;
    }
    public double getNota3(){
	return nota3;
    }
    public void setExercicios(double exercicios){
	this.exercicios = exercicios;
    }
    public double getExercicios(){
	return exercicios;
    }
    public String mediaAproveitamento(double media){
	media = ((nota1 + nota2) * 2 + (nota3 * 3) + exercicios) / 7;
	System.out.printf("Media de aproveitamento %.1f%n", media);
	if(media < 6){
	    return "D";
	}else if(media < 7.5){
	    return "C";
	}else if(media < 9){
	    return "B";
	}else{
	    return "A";
	}
    }

}
