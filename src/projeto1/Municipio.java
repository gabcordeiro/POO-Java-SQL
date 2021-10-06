
package projeto1;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fabricio nandolfo
 */
public class Municipio {
    String nom;
    Map <String,Imovel> mapImovel = new HashMap<>();


    public void adicionarI(String m,Imovel i){
    mapImovel.put(m, i);
    }
    
    public  Imovel RecuperarImovel(String m){
    return mapImovel.get(m);
    }
    
    public float calM(String m){
        Imovel im;
        float res = 0;
        
        im = mapImovel.get(m);
        
        if(im.retornarMesesAtraso() >= 0 && im.retornarMesesAtraso()<=5){
        res=im.retornarImpostoImovel()*1.01F;
        }else if(im.retornarMesesAtraso() >= 6 && im.retornarMesesAtraso()<=8){
        res=im.retornarImpostoImovel()*1.023F;
        }else if(im.retornarMesesAtraso() >= 9 && im.retornarMesesAtraso()<=10){
        res=im.retornarImpostoImovel()*1.03F;
        }else if(im.retornarMesesAtraso() >= 11 && im.retornarMesesAtraso()<=12){
        res=im.retornarImpostoImovel()*1.054F;
        }else if(im.retornarMesesAtraso() > 12){
        res=im.retornarImpostoImovel()*1.1F;
        }
        return res;
        
    }

}
