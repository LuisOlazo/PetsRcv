package com.luis.petsrcv;

import java.util.ArrayList;
import java.util.List;

public class PetDataset {

    public List<PetModel> get() {
        List<PetModel> list = new ArrayList<>();
        list.add(new PetModel(R.drawable.pet1,"Max",3));
        list.add(new PetModel(R.drawable.pet2,"Luna",4));
        list.add(new PetModel(R.drawable.pet3,"Rocky",5));
        list.add(new PetModel(R.drawable.pet4,"Coco",2));
        list.add(new PetModel(R.drawable.pet5,"Bella",1));
        list.add(new PetModel(R.drawable.pet6,"Simba",3));
        list.add(new PetModel(R.drawable.pet7,"Nina",1));
        list.add(new PetModel(R.drawable.pet8,"Toby",7));
        list.add(new PetModel(R.drawable.pet9,"Lola",2));
        list.add(new PetModel(R.drawable.pet10,"Zeus",6));
        return list;
    }

}
