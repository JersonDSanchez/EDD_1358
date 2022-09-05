
package com.mycompany.nominaadt;

public class Trabajador {
    
    //atributos
        private double valorHoraExtra = 276.5;
	private int numTrabajador;
	private String nombre;
	private String pat;
	private String mat;
	private double horasExtras;
	private double sueldoBase;
	private String anioIngreso;
        
    //contructores

    public Trabajador(int numTrabajador, String nombre, String pat, String mat, double horasExtras, double sueldoBase, String anioIngreso) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.pat = pat;
        this.mat = mat;
        this.horasExtras = horasExtras;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }
   
    
    //Gets &  Sets

    public double getHoraExtra() {
        return valorHoraExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.valorHoraExtra = horaExtra;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return Integer.parseInt(anioIngreso);
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double calcSueldo () {
		int antiguedad = 2022 - (Integer.parseInt(anioIngreso));
		double total = this.sueldoBase + (this.sueldoBase * (antiguedad*0.03)) + (this.horasExtras*this.valorHoraExtra);
		return total;
	}

    @Override
    public String toString() {
        return "Trabajador{" + "horaExtra=" + valorHoraExtra + ", numTrabajador=" + numTrabajador + ", nombre=" + nombre + ", pat=" + pat + ", mat=" + mat + ", horasExtras=" + horasExtras + ", sueldoBase=" + sueldoBase + ", anioIngreso=" + anioIngreso + '}';
    }
    
    
}
