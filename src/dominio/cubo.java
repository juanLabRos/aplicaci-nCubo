/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumnos Mañana
 */
public class cubo {
    private int alto;
    private int ancho;
    private int largo;
    
    //constructores

    public cubo() {
    }

    public cubo(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    //getter and setter

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cubo{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", largo=").append(largo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.alto;
        hash = 41 * hash + this.ancho;
        hash = 41 * hash + this.largo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cubo other = (cubo) obj;
        if (this.alto != other.alto) {
            return false;
        }
        if (this.ancho != other.ancho) {
            return false;
        }
        if (this.largo != other.largo) {
            return false;
        }
        return true;
    }
    
    
   public int calcularVolumen(int alto, int ancho, int largo){
      return alto*ancho*largo; 
   }
   
}
