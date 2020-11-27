package com.company;

public class Boss extends GameEntity {
    private String M134_Minigun;
    public Boss(String weapon){
        super();
        this.getM134_Minigun();
    }


    public String getM134_Minigun() {
        return M134_Minigun;
    }

    public void setM134_Minigun(String m134_Minigun) {
        M134_Minigun = m134_Minigun;

    }






    @Override
    public String getInfo() {
        return super.getInfo();
    }

}