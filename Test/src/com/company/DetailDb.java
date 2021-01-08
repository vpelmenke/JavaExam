package com.company;

public class DetailDb {
    private Detail[] _details;

    public DetailDb(){
        init();
    }

    private void init(){
        Detail[] details = {
                new Detail(DetailType.Salnik, "Metal"),
                new Detail(DetailType.Salnik, "Wood"),
                new Detail(DetailType.Salnik, "Metal")
        };
        set_details(details);
    }

    public Detail[] get_details() {
        return _details;
    }

    public void set_details(Detail[] _details) {
        this._details = _details;
    }
}
