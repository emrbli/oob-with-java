/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;
    
class sekreter extends calısan{
    private int sayac=0;
    int telefon;
    private String adres;
    int yas;
    boolean sigara;
    public boolean isSigara(){//is fonksiyonunu "sigara içermi" >> "is him smoking" deki is fonksiyonu olarak düşünebiliriz
        return sigara;
    }

    public int getYas() {//get izinle içeriği göstermek için
        return yas;
    }

    public void setYas(int yas) {//set izinle içeriği düzenlemek için kullanılır.
        if (yas>0) {
            this.yas = yas;
        }
        
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    public int getSayac(){
        return sayac;
    }
    public void setSayac(int x){
        sayac=x;
    }
    public sekreter(){
        sayac++;
    }
    public void maas(){
        System.out.println("maas 100");
        System.out.println(sayac);
    }
    public final void yetki(){
        System.out.println("Yetki kimseye verilemez! ");
        
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

public class Getset {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        sekreter ayse=new sekreter();
        sekreter ali =new sekreter();
        System.out.println(ali.getSayac());
    }
    
}


/**
 * abstract(soyutlama) nedir?..
 * 
 * aslında varlıkların, object orianted dünyanın doğasında olan birşeydir.
 * bizim dışarıyla olan yüzümüzün ayarlanması ve bizim kontrolümüzden geçmesidir.
 * dışarıya mümkün olan en kontrollü ve en doğru biçimde objeyi açmak 
 * ve objenin iç karmaşıklığını diğer objelere diğer class lara taşımamak
 * problemi orada yerel olarak o class ın yazılması sırasında çözmektir.
 */

/**
 * encapsulation(kapsülleme) nedir?..
 * 
 * bir objenin dışarıya bakan yüzlerinin bizim kontrolümüzde olması
 * özelliklerinin hiçbir şekilde dışarıya açık olmaması
 * ve methodlar üzerinden "get" ve "set" fonksiyonları veya "is" fonksiyonu ile ayarlanması
 * ve bizim kontrolümüzden geçmesidir.
 * 
 * 
 */
