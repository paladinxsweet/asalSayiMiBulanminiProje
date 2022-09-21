import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);

        System.out.println("Sayiyi giriniz : ");

        int number=tara.nextInt();
        boolean asalMi=true;

        if(number==1 || number <1)
        {
            System.out.println("Geçersiz sayi girdiniz"+number);


        }



//sayiyi bolen  2 ye böldügünde asal oluyorsa o sayi asaldir asal olarak işaretle


//2 ve 2 artırdıgında bölünen sayi eşit olursa asal mi true işaretle


        for(int i=2; i<number ; i++){

if(number %i == 0)
{
    asalMi=false;


}

        }
if (asalMi)
{

    System.out.println("Sayi asaldir ");
}
else {

    System.out.println("Sayi asal degildir ");
}



    }

}
