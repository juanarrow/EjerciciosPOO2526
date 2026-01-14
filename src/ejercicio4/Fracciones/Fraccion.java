package ejercicio4.Fracciones;

public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion(int numero){
        this.numerador = numero;
        this.denominador = 1;
    }
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public Fraccion invertir(){
        return new Fraccion(denominador, numerador);
    }

    public Fraccion simplifica(){        
        for(int i = 2; i < Math.min(numerador, denominador); i++){
            if(numerador % i == 0 && denominador % i == 0){
                return new Fraccion(numerador / i, denominador / i).simplifica();
            }
        }
        return new Fraccion(numerador, denominador);
    }    

    public Fraccion multiplica(Fraccion f){
        return new Fraccion(numerador*f.numerador, denominador*f.denominador);
    }

    public Fraccion multiplica(int numero){
        return multiplica(new Fraccion(numero));
    }

    public Fraccion divide(Fraccion f){
        return multiplica(f.invertir());
    }

    public Fraccion divide(int numero){
        return divide(new Fraccion(numero));
    }

    private Fraccion sumaCompatible(Fraccion f){
        return new Fraccion(numerador +f.numerador, denominador);
    }

    
    private Fraccion restaCompatible(Fraccion f){
        return new Fraccion(numerador -f.numerador, denominador);
    }

    public Fraccion suma(Fraccion f){
        return new Fraccion(numerador*(denominador*f.denominador)/denominador,
                            denominador*f.denominador).sumaCompatible(
                                new Fraccion(
                                    f.numerador*(f.denominador*denominador)/f.denominador, 
                                    denominador*f.denominador)).simplifica();
    }

    public Fraccion suma(int numero){
        return suma(new Fraccion(numero));
    }

    public Fraccion resta(Fraccion f){
        return new Fraccion(numerador*(denominador*f.denominador)/denominador,
                            denominador*f.denominador).restaCompatible(
                                new Fraccion(
                                    f.numerador*(f.denominador*denominador)/f.denominador, 
                                    denominador*f.denominador)).simplifica();
    }

    public Fraccion resta(int numero){
        return resta(new Fraccion(numero));
    }


    public Fraccion potencia(int exponente){
        if(exponente == 0)
            return new Fraccion(1,1);
        if(exponente < 0)
            return invertir().potencia(-exponente);        
        return new Fraccion((int)Math.pow(numerador, exponente), (int)Math.pow(denominador, exponente));
    }


    @Override
    public String toString() {  
        return String.format("%d/%d", numerador, denominador);
    }

}

