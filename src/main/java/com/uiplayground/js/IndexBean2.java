/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uiplayground.js;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author mamadu
 */
@ViewScoped
@Named
public class IndexBean2 implements Serializable {

    private List<SelectItem> items;
    private SelectItem selectedItem;

    @PostConstruct
    public void IndexBean() {
        items.add(new SelectItem("OBJ1", "label1"));
        items.add(new SelectItem("OBJ2", "label2"));
        items.add(new SelectItem("OBJ3", "label3"));
        items.add(new SelectItem("OBJ4", "label4"));
        items.add(new SelectItem("OBJ5", "label5"));
        System.out.println("##### PRINTED");
    }

    
    public List<SelectItem> getItems() {
        return items;
    }

    public void setItems(List<SelectItem> items) {
        this.items = items;
    }
       public SelectItem getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(SelectItem selectedItem) {
        this.selectedItem = selectedItem;
    }
    public void wiring(){
    }
      public String next(){
          System.out.println("##### NEXT");
          System.out.println(selectedItem);
          return "index2";
    }
}
