package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {

    private ArrayList<CartItem> items;

    public void addToCart(int quantity, Product product){
        CartItem item = new CartItem();
        item.setProduct(product);
        items.add(quantity, item);
    }

    public ArrayList<CartItem> getProducts() {

        return items;
    }

    public float getTotal(){
        float total=0;
        for(int i=0; i<items.size(); i++){
            total = total + items.get(i);
        }
        return total;
    }

    public int getCountByName(String name){

        return 0;
    }
}
