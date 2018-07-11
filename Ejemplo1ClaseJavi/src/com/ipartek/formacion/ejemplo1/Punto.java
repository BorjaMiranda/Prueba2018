package com.ipartek.formacion.ejemplo1;

public class Punto {
private int x,y;
//ctrl + 7 activa un trozo d codigo en comntario
public Punto(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Punto() {
	this(1,1); //x=1,y=1;  si fuese this(1) llamaria al constructor de abajo xq solo tiene 1 parametro
}


public Punto(int xy) {
	this(xy,xy);   //
}

@Override   //es que esta sobrescribiendo un metodo que esta en la clase padre(en este caso Object)
public String toString() {
	return "Punto [x=" + x + ", y=" + y + "]";
}


@Override
public int hashCode() { //suma de comprobacion para ver que dos numeros no tienen los mismos valores(comprobar que esta bien el archivo)
	final int prime = 31;
	int result = 1;
	result = prime * result + x;
	result = prime * result + y;
	return result;
}
@Override
public boolean equals(Object obj) { //si comparas dos objetos que contienen los mismos valores puede que no sean iguales aunque tengan los mismos valores.
									//porque los objetos se guardan en direcciones de memoria diferentes
	if (this == obj)				//p vale la direccion de memoria, no las variables.
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Punto other = (Punto) obj;// aqui lo convierte a Punto(y ser iguales objetos), para hacer la comparacion.(ejemplo restaurante con todo personas y una se convierte en medico)
	if (x != other.x) //aqui ya porfin compara las variables, ya que los objetos son iguales.(casting)
		return false;
	if (y != other.y)
		return false;
	return true;
}
@Override
public Object clone()  {//cambiar a public,viene en protected
	// TODO Auto-generated method stub
	return new Punto(x,y);
}

}
