package com.company;

import java.util.Random;

public class Detail {
    private DetailType _type;
    private String _material;
    private int _weight;
    private int _price;

    public Detail(DetailType type, String material){
        Random r = new Random();
        _type = type;
        _material = material;
        _weight = r.nextInt(300);
        _price = r.nextInt(3000);
    }

    public int get_price() {
        return _price;
    }

    public int get_weight() {
        return _weight;
    }

    public String get_material() {
        return _material;
    }

    public DetailType get_type() {
        return _type;
    }
}

enum DetailType{
    Porshen,
    Ruchka,
    Gaika,
    Shaiba,
    Flanec,
    Klapan,
    Shtucer,
    Salnik
}
