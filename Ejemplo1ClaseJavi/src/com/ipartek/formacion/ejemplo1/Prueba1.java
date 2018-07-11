package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub "to do" es para algo que no terminas y ir a ese punto
//disable spell checking para que no de errores los comentarios en castellano
		Punto p=new Punto(3,4);
		//Punto pt2=p;  //Aqui ai 1 objeto punto solo, no 2 xq solo se crean los que tienen el NEW Punto
					//si modificas uno modificas el otro, sirve para compartir el objeto.
		
		Punto pt2=(Punto)p.clone();//clon real de P, haciendo casting no puedes convertir nada, simplemente extrae la zona de info	
//		int i=0;
//		
//		Object o=i  ;// estaria haciendo Object o=new integer(i)
		//System.out.println(p); //no hace falta poner el toString si lo has implantado a la clase
		//System.out.println(p.hashCode());
		System.out.println(p.equals(pt2));  //aqui compara el contenido
//		if(p==pt2) {                        aqui compara la direccion
//			System.out.println("igual0");
//		}
//		
//		else{
//			System.out.println("nope");
//		}
	}

}
