public class Uni5Exe4 {
    public Uni5Exe4(){
        float par=2, impar=3, S=0,denominador=2;
    for(int i =0;i<20;i++){
        S+=impar/par;     
        denominador=denominador+2;
        par=denominador+par;
        impar+=2;
        if(impar>=20){
            i=21;
        }        
    }    
    System.out.println("O valor de S será: "+S);
    }
    public static void main(String[] args) {
        new Uni5Exe4();
    }
}
