/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


class Televisor
{
    
	int canal=1; //1-16
	int volume=0;//0-10
	boolean ligado = false;
	void ligarTelevisor()
    	{
        	 ligado = true;
        	 System.out.println("Plim!");
        }
        void desligarTelevisor()
        {
             System.out.println("Pliim!");
        	 ligado = false;
        	 canal=1;
        	 volume=0;
        }
    void mostrarStatus(){
            if(ligado==true){
        	    System.out.println("A TV esta no canal ("+canal+")");
        	    System.out.println("No volume ("+volume+")");
        	    System.out.println("E esta ligada!");}
            else{
        	 System.out.println("A TV esta desligada!");
                }
        	    
    }
            
        	void aumentarVolume()
        	{
                    if (ligado==true){
                        if(volume<10){
        	        volume++;
                        }else{
        	        System.out.println("ERRO! O volume esta no maximo");
                        }
                    }
                    else{
                        System.out.println("A TV esta desligada");
                    }
        	}
            void reduzirVolume()
        	{
                    if (ligado==true){
                        if(volume>0){
                            volume--;
                        }else{
                            System.out.println("ERRO! O volume esta no minimo");
                        }
                    }
                    else{
                        System.out.println("A TV esta desligada");
                    }
        	}
        	void subirCanal()
        	{
                    if (ligado==true){
                        if(canal<16){
        	        canal++;
                        }else{
        	        System.out.println("ERRO! Voce chegou no limite dos canais");
                        }
                    }
                    else{
                        System.out.println("A TV esta desligada");
                    }
        	}
            void descerCanal()
        	{
                    if (ligado==true){
                            if(canal>1){
                                canal--;
                            }else{
                                System.out.println("ERRO! Voce chegou no inicio dos canais");
                            }
                    }
                    else{
                        System.out.println("A TV esta desligada");
                    }
        	}
        	
        	
    }

public class Televisao
{
	public static void main(String[] args) {
		Televisor tv1;
		tv1 = new Televisor();
                tv1.mostrarStatus();
		tv1.ligarTelevisor();
		tv1.aumentarVolume();
                tv1.mostrarStatus();
                tv1.descerCanal();
	}
}


