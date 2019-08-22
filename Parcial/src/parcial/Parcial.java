
package parcial;

import javax.swing.JOptionPane;

public class Parcial {

  
    public static void main(String[] args) {
        //Variables Utilizadas
  String Carnet[] = new String[4];
  String au;
  String Notas[] = new String[4];
  int i=0;
  double notas[]= new double[4];
  double aux;
  for( i=0;i<4;i++){ //for para pedir Datos
  
      
      
  Carnet[i]=JOptionPane.showInputDialog("Ingresar Número de carnet del alumno "+(i+1)+"");
  do{
  Notas[i]=JOptionPane.showInputDialog("Ingresar Nota Promedio del alumno "+(i+1)+"");
  notas[i]=Double.parseDouble(Notas[i]);
  }while(notas[i]<0||notas[i]>100);  
  }
  
  for(i=0;i<4;i++){//for que indicara cuantas veces se tiene que repetir el ciclo para que quede ordenados
  // Los siguientes if evaluaran los valores de las notas y se intercambiaran si cumplen con las condiciones 
  if((notas[0])<(notas[1])){ 
  aux=notas[0];
  notas[0]=notas[1];
  notas[1]=aux;
  au=Carnet[0];
  Carnet[0]=Carnet[1];
  Carnet[1]=au;
  }
  if(notas[1]<notas[2]){
  aux=notas[1];
  notas[1]=notas[2];
  notas[2]=aux;
  au=Carnet[1];
  Carnet[1]=Carnet[2];
  Carnet[2]=au;
  }
  if(notas[2]<notas[3]){
  aux=notas[2];
  notas[2]=notas[3];
  notas[3]=aux;
  au=Carnet[3];
  Carnet[2]=Carnet[3];
  Carnet[3]=au;
  }
  }
  
  for(i=0;i<4;i++){
    JOptionPane.showMessageDialog(null,"Alumno "+(i+1)+"\nNúmero de carnet: "+Carnet[i]+"\nNota Promedio: "+notas[i]);  
  }
    
}
}
