import java.util.Scanner;
class monicasssoo {
public static void main(String[] args) {
int monica, fnovo, fmedio, fvelho;
int resultado;
Scanner teclado = new Scanner(System.in);
monica = teclado.nextInt();
fnovo = teclado.nextInt();
fmedio = teclado.nextInt();

while(monica!=0){
resultado = fnovo + fmedio;
fvelho = monica - resultado;
if (fvelho > fmedio && fvelho > fnovo)
{
System.out.println(""+fvelho);
}
if (fmedio > fvelho && fmedio > fnovo)
{
System.out.println(""+fmedio);
}
if (fnovo > fmedio && fnovo > fvelho)
{
System.out.println(""+fnovo);
}
monica = teclado.nextInt();
if(monica != 0){

fnovo = teclado.nextInt();
fmedio =teclado.nextInt();
}
}
}
}