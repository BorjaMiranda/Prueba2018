package com.ipartek.formacion.ejemplo1;

public class Prueba1 {
public static final int TAM_ARRAY=10; //statico es q es a nivel de clase, no de instancia. Final es q solo puede tner ese valor y no modificar
//mayusculas=constante	
public static void main(String[] args) {
		
		int[] arr= new int[2];
		arr[0]=5;
		arr[1]=2;

		int arr2[]= {5,2};

		System.out.println(arr2[1]);


		//String diasSemana[] = {"lunes","martes"}
		Punto[] puntos= new Punto[2];
		puntos[0]=new Punto(1,2);
		Punto[] puntosPorDefecto= {new Punto(1), new Punto(2)};
		System.out.println(puntosPorDefecto[1].toString().toUpperCase());
		
		String[] diasSemana=new String[] {"lunes","martes"};
		System.out.println(diasSemana[1]);
		
		for(Punto p:puntos) {
			System.out.println(p);
		}
		
		//puntos[0]=new Punto(1000,1); //lanza error porque tiene que ser menos de 100

		//normalmente declarar  las variables antes del for, para que el colector de basura no sude
	Punto p;
		for (int i = 0; i < puntos.length; i++) { //lo mismo q lo de arriba
		p =puntos[i];
		System.out.println(p);
		}
		
		System.out.print("dime algo");
		
		//String hola=
				System.console().readLine();
		System.out.println();
		// TODO Auto-generated method stub "to do" es para algo que no terminas y ir a ese punto
//disable spell checking para que no de errores los comentarios en castellano
		//Punto p=new Punto(3,4);
		//Punto pt2=p;  //Aqui ai 1 objeto punto solo, no 2 xq solo se crean los que tienen el NEW Punto
					//si modificas uno modificas el otro, sirve para compartir el objeto.
		
		//Punto pt2=(Punto)p.clone();//clon real de P, haciendo casting no puedes convertir nada, simplemente extrae la zona de info	
		//int i=0;
//		
//		Object o=i  ;// estaria haciendo Object o=new integer(i)
		//System.out.println(p); //no hace falta poner el toString si lo has implantado a la clase
		//System.out.println(p.hashCode());
		//System.out.println(p.equals(pt2));  //aqui compara el contenido
//		if(p==pt2) {                        aqui compara la direccion
//			System.out.println("igual0");
//		}
//		
//		else{
//			System.out.println("nope");
//		}
	}

}
